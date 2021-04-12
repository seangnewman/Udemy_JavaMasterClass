public class Person {
    private String firstName;
    private String lastName;
    private int age;

    public String getFirstName(){
        return firstName;
    }
    public String getLastName(){
        return lastName;
    }
    public int getAge(){
        return age;
    }
    public void setFirstName(String _name){
        firstName = _name;
    }
    public void setLastName(String _name){
        lastName = _name;
    }
    public void setAge(int _age){
        age = _age > 100 || _age < 0 ? 0 : _age;
    }
    public boolean isTeen(){
        return age > 12 && age < 20 ? true : false;
    }
    public String getFullName(){
        return firstName.length() > 0 && lastName.length() >0 
                 ? firstName + "" + lastName 
                 : firstName.length() == 0 && lastName.length() == 0 ? ""
                 : firstName.length() == 0 ? lastName : firstName; 
    }

}
