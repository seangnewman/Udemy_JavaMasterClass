import java.util.ArrayList;
import java.util.List;

public class Player implements ISaveable {
    private String name;
    private String weapon;
    private int hitPoints;
    private int strength;

    public Player(String name, int hitPoints, int strength){
        this.name = name;
        this.hitPoints = hitPoints;
        this.strength = strength;
        this.weapon = "Sword";
    }

    // Getters
    public String getName(){
        return this.name;
    }
    public String getWeapon(){
        return this.weapon;
    }
    public int getHitPoints(){
        return this.hitPoints;
    }
    public int getStrength() {
        return strength;
    }
    // Setters
    public void setName(String name) {
        this.name = name;
    }
    public void setWeapon(String weapon) {
        this.weapon = weapon;
    }
    public void setHitPoints(int hitPoints) {
        this.hitPoints = hitPoints;
    }
    public void setStrength(int strength) {
        this.strength = strength;
    }


    @Override
    public List<String> write() {
       List<String> playerAttributes = new ArrayList<>();
       playerAttributes.add(0, this.name);
       playerAttributes.add(1, String.valueOf(this.hitPoints));
       playerAttributes.add(2, String.valueOf(this.strength));
       playerAttributes.add(3, this.weapon);

       return playerAttributes;
    }

    @Override
    public void read(List<String> stringList) {
       if (stringList == null || stringList.size() <= 0){
           return;
       }

       this.name = stringList.get(0);
       this.hitPoints = Integer.parseInt(stringList.get(1));
       this.strength = Integer.parseInt(stringList.get(2));
       this.weapon = stringList.get(3);

       
    }
    
    
    public String toString() {
        
        String returnString = "";
        returnString +="Player{name='" + this.name + "', "; 
        returnString +="hitPoints=" + this.hitPoints +", ";
        returnString +="strength=" + this.strength + ", ";
        returnString += "weapon='" + this.weapon + "'}";
        return returnString;
    }
}
