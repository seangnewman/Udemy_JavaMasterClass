import java.util.ArrayList;

public class Branch {
    private String name;
    private ArrayList<Customer> customers;

    public Branch(String branchName){
      name = branchName;
      customers = new ArrayList<Customer>();
    }

    public String getName(){
        return name;
    }

    public ArrayList<Customer> getCustomers(){
        return customers;
    }

    private Customer findCustomer(String nameOfCustomer){
        
        ArrayList<String> currentCustomers = new ArrayList<String>();
        for( int i =0; i < customers.size(); i++){
            currentCustomers.add(customers.get(i).getName());
        }
        int customerIndex = currentCustomers.indexOf(nameOfCustomer);
        if( customerIndex >= 0)
          return customers.get(customerIndex);

        return null;

    }

    public boolean newCustomer(String nameOfCustomer, double initialTransacton){
        
        
        
        Customer newCustomer = findCustomer(nameOfCustomer);
        if(newCustomer == null){
            Customer addCustomer = new Customer(nameOfCustomer, initialTransacton);
            customers.add(addCustomer);
            return true;

        }

        return false;


    }

    public boolean addCustomerTransaction(String nameOfCustomer, double transactionAmount){
        Customer customer = findCustomer(nameOfCustomer);
        if(customer != null){
            customer.addTransaction(transactionAmount);
            return true;
        }
        return false;
    }
}
