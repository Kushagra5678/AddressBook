package AddressBookUC5;
import java.util.ArrayList;

public class AddressBook {
	ArrayList<Contacts> contact = new ArrayList<Contacts>();
	public AddressBook()
	{
       
	}

	public void addContact(Contacts c1)
	{
		contact.add(c1);
	}
	
	public void editContact(String firstName,String lastName,String address,String State,String zip,String phoneNumber,String email)
    {
      for(Contacts x: contact) {  	
         if(firstName.equals(x.getFirstName()) && lastName.equals(x.getLastName()))
         {
         	contact.remove(x);
         	break;
         } 
      }
      Contacts c = new Contacts(firstName, lastName, address, State, zip, phoneNumber, email);
      contact.add(c);
    }
	
	public void delContact(String firstName,String lastName)
    {
		for(Contacts x: contact) {  
         if(firstName.equals(x.getFirstName()) && lastName.equals(x.getLastName()))
         {
         	contact.remove(x);
         	break;
         }  
      }
    }
}
