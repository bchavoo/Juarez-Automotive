package entities;

import java.util.ArrayList;


public class Person {
    private String firstName;
    private String lastName;
    private String phoneNumber;
    private Address address;

    /**
	 * Here created a person class with its constructor
	 * @param firstName
	 * @param lastName
     * @param phoneNumber
	 * @param address
	 */
     public Person(String firstname, String lastName, String phoneNumber, Address address) {
         super();
         this.firstName = firstName;
         this.lastName = lastName;
         this.phoneNumber = phoneNumber;
         this.address = address;
     }

     //Getters and Setters
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
    public String getPhoneNumber(String phoneNumber) {
        return phoneNumber;
    }
    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }
	public Address getAddress() {
		return address;
	}
	public void setAddress(Address address) {
		this.address = address;
	}
}
