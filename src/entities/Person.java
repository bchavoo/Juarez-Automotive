package entities;

public class Person {
	
	private String firstName;
	private String lastName;
	private Address address;
	private PhoneNumber number;
	
	
	public Person(String firstName, String lastName, Address address, PhoneNumber number) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.address = address;
		this.number = number;
	}


	public String getFirstName() {
		return firstName;
	}


	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}


	public String getLastName() {
		return lastName;
	}


	public void setLastName(String lastName) {
		this.lastName = lastName;
	}


	public Address getAddress() {
		return address;
	}


	public void setAddress(Address address) {
		this.address = address;
	}


	public PhoneNumber getNumber() {
		return number;
	}


	public void setNumber(PhoneNumber number) {
		this.number = number;
	}

	

}
