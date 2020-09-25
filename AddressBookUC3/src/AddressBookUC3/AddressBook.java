package AddressBookUC3;
import java.util.*;

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
		int i=0;
      for(Contacts x: contact) {  	
         if(firstName.equals(x.getFirstName()) && lastName.equals(x.getLastName()))
         {
         	contact.remove(i);
         	break;
         }
         i+=1; 
      }
      Contacts c = new Contacts(firstName, lastName, address, State, zip, phoneNumber, email);
      contact.add(c);
    }
}
