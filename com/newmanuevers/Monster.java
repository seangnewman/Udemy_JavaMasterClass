import java.util.ArrayList;
import java.util.List;

public class Monster implements ISaveable{
    private String name;
    private int hitPoints;
    private int strength;

    public Monster(String name, int hitPoints, int strength){
        this.name = name;
        this.hitPoints = hitPoints;
        this.strength = strength;

    }

    // Getters
    public String getName() {
        return name;
    }
    public int getHitPoints() {
        return hitPoints;
    }
    public int getStrength() {
        return strength;
    }
    

    @Override
    public List<String> write() {
        List<String> monsterAttributes = new ArrayList<>();
        monsterAttributes.add(0, this.name);
        monsterAttributes.add(1, String.valueOf(this.hitPoints));
        monsterAttributes.add(2, String.valueOf(this.strength));
        
        return monsterAttributes;
    }

    @Override
    public void read(List<String> stringList) {
        if (stringList == null || stringList.size() <= 0){
            return;
        }
 
        this.name = stringList.get(0);
        this.hitPoints = Integer.parseInt(stringList.get(1));
        this.strength = Integer.parseInt(stringList.get(2));
        
        
    }

    @Override
    public String toString() {
        String returnString = "";
        returnString +="Monster{name='" + this.name + "', "; 
        returnString +="hitPoints=" + this.hitPoints +", ";
        returnString +="strength=" + this.strength + "'}";
        
        return returnString;
    }
    
}
