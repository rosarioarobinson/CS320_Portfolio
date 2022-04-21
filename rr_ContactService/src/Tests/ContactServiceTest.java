/* 
 * Rosario Robinson
 * CS 320: Software Test Automation & QA
 * 3-2 Milestone: Contact Service
 * March 19th, 2022 
 */

package Tests;

import static org.junit.Assert.assertTrue;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import Contacts.Contact;
import Contacts.ContactService;

// Created ContactService test to test ContactService.java file via JUnit 5
// This file will allow for testing the information in ContactService.java

class ContactServiceTest {

	// Tests that each contact is added to arraylist
	@Test
	void addContactTest() {
		ContactService newContact = new ContactService();
        Contact contact = new Contact("8765432", "Jane", "Doe", "8004441800", "221 B Baker Street");
        assertTrue(newContact.contactList.add(contact));

        contact = new Contact("8765432", "Jane", "Doe", "8004441800", "221 B Baker Street");

	}

	// Tests that the contact is removed from arraylist
    @Test
    public void removeContactTest()
    {
        ContactService contactservice = new ContactService();
        Contact contact = new Contact("8765432", "Jane", "Doe", "8004441800", "221 B Baker Street");
        
        assertTrue(contactservice.contactList.add(contact));
        assertTrue(contactservice.removeNewContact("8765432"));

    }
    
    // Tests that the contact is updated from arraylist
    // Unsure if this test is necessary, as it works similarly to the addContactTest
    @Test
    public void updateContactTest()
    {
        ContactService updatecontactservice = new ContactService();
        Contact contact = new Contact("8765432", "Jane", "Doe", "8004441800", "221 B Baker Street");
        
        assertTrue(updatecontactservice.contactList.add(contact));
        //assertTrue(contactservice.updateNewContact("8765432"));

    }
    

}
