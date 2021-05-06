import java.util.ArrayList;

public class Bank {
    private String name;
    private ArrayList<Branch> branches;

    public Bank(String bankName){
        name = bankName;
        branches = new ArrayList<Branch>();
    }

    public boolean addBranch(String branchName){
        Branch newBranch = findBranch(branchName);

        if(newBranch == null){
            Branch createBranch = new Branch(branchName);
            branches.add(createBranch);
            return true;
        }
        
        return false;

    }

    public boolean addCustomer(String branchName, String customerName, double initialDeposit){
        Branch existingBranch = findBranch(branchName);
        if(existingBranch == null)
          return false;

        
        return existingBranch.newCustomer(customerName, initialDeposit);
         

    }

    public boolean addCustomerTransaction(String branchName, String customerName, double transactionAmount){
        Branch existingBranch = findBranch(branchName);
        if(existingBranch != null){

            // this is not a new customer
            //Customer existingCustomer = existingBranch.findCustomer(customerName);
            if(!existingBranch.newCustomer(customerName, transactionAmount)){
                existingBranch.addCustomerTransaction(customerName, transactionAmount);
                return true;
            }

        }

        return false;
    }

    private Branch findBranch(String branchName){
        ArrayList<String> branchNames = new ArrayList<String>();
        int branchIndex;
        if(branches.size() == 0)
          return null;
        for( int i = 0; i < branches.size(); i++){
            branchNames.add(branches.get(i).getName());
        }
        
        branchIndex = branchNames.indexOf(branchName);
        if(branchIndex >= 0)
          return branches.get(branchIndex);

        return null;
    }

    public boolean listCustomers(String branchName, boolean printTransaction){
        
        Branch listBranch = findBranch(branchName);
        
        if( listBranch != null){
            System.out.println("Customer details for branch " + listBranch.getName());
            for( int i=0; i < listBranch.getCustomers().size(); i++){
                System.out.println("Customer: " + listBranch.getCustomers().get(i).getName() + "[" + (i + 1) + "]");
            if( printTransaction)
            {
                
                    System.out.println("Transactions");
                    for(int j = 0; j < listBranch.getCustomers().get(i).getTransactions().size(); j++){
                        double lineItem = listBranch.getCustomers().get(i).getTransactions().get(j);
                        System.out.println("[" + (j+1) + "]  Amount " + lineItem);
                    }
    
                }
    

            }
            return true;
        } 

        return false;
    }
    
}
