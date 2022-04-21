/* 
 * Rosario Robinson
 * CS 320: Software Test Automation & QA
 * 3-2 Milestone: Contact Service
 * March 19th, 2022 
 */

// Contact Service file will add, delete and update contacts for Contacts.java class
package Contacts;

// imports for arraylist and UUID
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;


public class ContactService {
	
	// Creating an arraylist to hold list of contacts to add, delete, and update
	// ContactService made public so ContactServiceTest could be accessed
	
	// Source: https://stackoverflow.com/questions/19743126/adding-objects-to-arraylist-from-another-class
    public List <Contact> contactList;
    
    // Created public ContactService to be accessed for ContactServiceTest
    public ContactService() {
        contactList = new ArrayList<>();
    }

    // Generate unique ID
    private String newCreateUUID() {
    	// Source: https://www.uuidgenerator.net/dev-corner/java
        String createUUID = UUID.randomUUID().toString();
		return createUUID;
	}
    
    // Add contact ID
    // Source: https://stackoverflow.com/questions/35832831/java-arraylist-class-call-to-another-class
    public void addNewContact(String contactID, String firstName, String lastName, String phoneNum, String address) {
    	Contact contact = new Contact(newCreateUUID(), firstName, lastName, phoneNum, address);
    	contactList.add(contact);
     }

    
	// Delete contacts per contact ID 
    public boolean removeNewContact(String contactID)
    {
        // Created for loop to loop through contact list
        for (Contact contactElement : contactList)
        {
            // If statement that will remove contact from contact list
            if (contactElement.getContactID().equals(contactID))
            {
                return contactList.remove(contactElement);
            }
        }
        return false;
    }
   

    // Update Contact ID
    public void updateNewContact(String contactID) {
	    // loops through contactList 
    	for (Contact contacts : contactList) {
	        Object searchContactId = null;
	        // if statement will find a contact ID to add a new one to arraylist
			if (contacts.getContactID().equals(searchContactId)) {
	            contacts.setContactID("New Contact Added");
	        }
	    }
    }

    
}
