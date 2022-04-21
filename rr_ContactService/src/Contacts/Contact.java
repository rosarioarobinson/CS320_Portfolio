/* 
 * Rosario Robinson
 * CS 320: Software Test Automation & QA
 * 3-2 Milestone: Contact Service
 * March 19th, 2022 
 */

package Contacts;

// Created public class Contact
public class Contact {
	
	// private strings based on requirements
	// created contact ID, first name, last name, phone number, and address
	private String contactID;
	private String firstName;
	private String lastName;
	private String phoneNum;
	private String address;

	public Contact(String contactID, String firstName, String lastName, String phoneNum, String address) {
		
		// create if statements for each string to check for length and if invalid,
		// throw error statement
		if(contactID == null || contactID.length() > 10) {
			throw new IllegalArgumentException("Invalid contact ID");
		}
		
		if (firstName == null || firstName.length() > 10) {
			throw new IllegalArgumentException("Invalid first name");
		}
		
		if (lastName == null || lastName.length() > 10) {
			throw new IllegalArgumentException("Invalid last name");
		}
		if (phoneNum == null || phoneNum.length() > 10 || phoneNum.length() < 10) {
			throw new IllegalArgumentException("Invalid phone number");
		}
		if (address == null || address.length() > 30) {
			throw new IllegalArgumentException("Invalid address");
		}
		
		// declares each current object
		this.contactID = contactID;
		this.firstName = firstName;
		this.lastName = lastName;
		this.phoneNum = phoneNum;
		this.address = address;
	}
	
	// Getters
	public String getContactID() {
		return contactID;
	}
	public String getFirstName() {
		return firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public String getPhoneNum() {
		return phoneNum;
	}
	public String getAddress() {
		return address;
	}
	
	
	// Setters
	public void setContactID(String newContactID) {
	    this.contactID = newContactID;
	  }
	public void setFirstName(String newFirstName) {
		this.firstName = newFirstName;
	}
	public void setLastName(String newLastName) {
		this.lastName = newLastName;
	}
	public void setPhoneNum(String newPhoneNum) {
		this.phoneNum = newPhoneNum;
	}
	public void setAddress(String newAddress) {
		this.address = newAddress;
	}

}
