import java.util.ArrayList;

public class Customer {
    private String name;
    private ArrayList<Double> transactions;

    public Customer(String nameOfCustomer, double initialTransaction){
        name = nameOfCustomer;
        transactions = new ArrayList<Double>();
        addTransaction(initialTransaction);
    }   

    public String getName(){
        return name;
    }

    public ArrayList<Double> getTransactions(){
        return transactions;
    }

    public void addTransaction(double transaction){
        transactions.add(transaction);
    }
}
