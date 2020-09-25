package addressBookUC1;

public class Contacts
{	
	public String firstName;
	public String LastName;
	public String address;
	public String State;
	public String zip;
	public String phoneNumber;
	public String email;

	public Contacts(String firstName,String LastName,String address,String State,String zip,String phoneNumber,String email)
	{
		this.firstName = firstName;
		this.LastName= LastName;
		this.address= address;
		this.State = State;
		this.zip = zip;
		this.phoneNumber = phoneNumber;
		this.email = email;
	}
}
