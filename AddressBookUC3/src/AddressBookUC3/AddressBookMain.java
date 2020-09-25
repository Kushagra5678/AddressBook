package AddressBookUC3;
import java.util.*;
public class AddressBookMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		 Contacts c = new Contacts("Kush","Agg","Alpha 1 Noida","UP","201302","9891876543","kush@gmail.com");
		   AddressBook addressBook = new AddressBook();
		   addressBook.addContact(c);
		   System.out.println("Enter the Name of the person whose details are to be edited");
		   String name = sc.nextLine();
	       String[] s = name.split(" ");
		   System.out.println("Enter the new Address,State,zip,phone number,email of the person");
		   String address = sc.nextLine();
		   String state = sc.nextLine();
		   String zip = sc.nextLine();
		   String phNo = sc.nextLine();
		   String email = sc.nextLine();
	       addressBook.editContact(s[0], s[1], address, state, zip, phNo, email);
	       System.out.println("Details Edited Succesfully!!!!!!");
	}

}
