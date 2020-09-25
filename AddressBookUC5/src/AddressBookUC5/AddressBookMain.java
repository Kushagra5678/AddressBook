package AddressBookUC5;

import java.util.*;
public class AddressBookMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		AddressBook ab = new AddressBook();
		 int i=0;
		 while(i>=0){
			 System.out.println("Menu \n1.Add Contact \n2.edit contact \n3.Remove contact \n4.Exit");
			 System.out.print("Enter your choice: ");
			 int choice=sc.nextInt();
			 sc.nextLine();
			 if(choice==1){
				 System.out.println("Enter details of person ");
				 String firstName = sc.nextLine();
				 String lastName = sc.nextLine();
				 String address = sc.nextLine();
				 String state = sc.nextLine();
				 String zip = sc.nextLine();
				 String phNo = sc.nextLine();
				 String email = sc.nextLine();
				 Contacts c1 = new Contacts(firstName, lastName, address, state, zip, phNo, email);
				 ab.addContact(c1);
				 System.out.println("Contact added Succesfully!!!!");
			 }
		
			 else if(choice==2) {
				 System.out.println("Enter the Name of the person whose details are to be edited");
				 String name = sc.nextLine();
				 String[] s = name.split(" ");
				 System.out.println("Enter the new Address,State,zip,phone number,email of the person");
				 String address = sc.nextLine();
				 String state = sc.nextLine();
				 String zip = sc.nextLine();
				 String phNo = sc.nextLine();
				 String email = sc.nextLine();
				 ab.editContact(s[0], s[1], address, state, zip, phNo, email);
				 System.out.println("Details Edited Succesfully!!!!!!");
			 }
			 else if(choice==3) { 
				 System.out.println("Enter the name of the person whose details are to be deleted");
				 String name=sc.nextLine();
				 String[] x = name.split(" ");
				 ab.delContact(x[0], x[1]);
				 System.out.println("The person's details are deleted Succesfully!!!!!!"); 
			 }
			 else if(choice==4)
				 break;
		 }

	}
}
