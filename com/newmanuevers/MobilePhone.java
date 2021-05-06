import java.util.ArrayList;

public class MobilePhone {
    private String myNumber;
    private  ArrayList<Contact>  myContacts;

    public MobilePhone(String phoneNumber){
        this.myNumber = phoneNumber;
        this.myContacts = new ArrayList<Contact>();
    }

    public boolean addNewContact(Contact newContact){
        if(findContact(newContact) == -1){

            myContacts.add((newContact));
            return true;
        }

        return false;
    }
    public boolean updateContact(Contact origContact, Contact updContact){
        int existingContact = findContact(origContact);
        if(existingContact >= 0){
            myContacts.set(existingContact, updContact);
            return true;
            
        }else{
            return false;
        }
    }

    public boolean removeContact(Contact delContact){
        int existingContact = findContact(delContact);
        if(existingContact >= 0){
            myContacts.remove(delContact);
            return true;
        }
        return false;
    }
    
    private int findContact(Contact findContact){
        ArrayList<String> contactNames = new ArrayList<String>();
        String qryName = findContact.getName();
        for( int i =0; i < myContacts.size(); i++){
            contactNames.add( myContacts.get(i).getName());
        }
        if(contactNames.contains(qryName)){
            return contactNames.indexOf(qryName);
             
        }
        else{
            return -1;
        }
    }

    private int findContact(String qryName){
        ArrayList<String> contactNames = new ArrayList<String>();
         
        for( int i =0; i < myContacts.size(); i++){
            contactNames.add( myContacts.get(i).getName());
        }
        if(contactNames.contains(qryName)){
            return contactNames.indexOf(qryName);
             
        }
        
        return -1;
        
    }



    public Contact queryContact(String qryName){
       
        int qryIndex = findContact(qryName);
         
        if( qryIndex >= 0 )
            return myContacts.get(qryIndex);
         
        return null;
          
    }

    public void printContacts(){
        System.out.println("Contact List:");
        for( int i = 0; i < myContacts.size(); i++){
            System.out.println((i+1) + ". " + myContacts.get(i).getName() + " -> " + myContacts.get(i).getPhoneNumber());
        }
    }
}
