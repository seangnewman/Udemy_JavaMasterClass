import Composition.Hamburger;

public class DeluxBurger extends Hamburger{
    public DeluxBurger() {
        super("Delux", "Sausage & Bacon", 14.00, "White");
        super.addHamburgerAddition1("Chips", 3.00);
        super.addHamburgerAddition2("Drink", 2.10);
        
    }
    
    @Override
    public void addHamburgerAddition1(String name, double price){
        System.out.println("Cannot not add additional items to a delux burger");

    }
    @Override
    public void addHamburgerAddition2(String name, double price){
        System.out.println("Cannot not add additional items to a delux burger");
    }
    @Override
    public void addHamburgerAddition3(String name, double price){
        System.out.println("Cannot not add additional items to a delux burger");
    }
    @Override
    public void addHamburgerAddition4(String name, double price){
        System.out.println("Cannot not add additional items to a delux burger");
    }
    

    
}
