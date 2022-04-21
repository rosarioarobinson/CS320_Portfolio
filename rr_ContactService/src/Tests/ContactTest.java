/* 
 * Rosario Robinson
 * CS 320: Software Test Automation & QA
 * 3-2 Milestone: Contact Service
 * March 19th, 2022 
 */

package Tests;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

// imported Contacts package to prevent error in ContactTest class
import Contacts.Contact;

// Created Contact test to test Contact.java file via JUnit 5
// This file will allow for testing the information in Contact.java

class ContactTest {

	// Tests for each object for Contacts
	@Test
	void contactTest() {
		Contact contact = new Contact("8765432", "Jane", "Doe", "8004441800", "221 B Baker Street");
		assertTrue(contact.getContactID().equals("8765432"));
		assertTrue(contact.getFirstName().equals("Jane"));
		assertTrue(contact.getLastName().equals("Doe"));
		assertTrue(contact.getPhoneNum().equals("8004441800"));
		assertTrue(contact.getAddress().equals("221 B Baker Street"));
	}
	
	// Tests to ensure contact ID is not too long 
	@Test
	void testContactTestIdTooLong() {
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			new Contact("8765432123456", "Jane", "Doe", "8004441800", "221 B Baker Street");
			
		});	}

	@Test
	void testContactTestIdIsNull() {
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			new Contact(null, "Jane", "Doe", "8004441800", "221 B Baker Street");
			
		});	}

	// Tests to ensure first name is not too long 
	@Test
	void testContactTestFirstNameTooLong() {
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			new Contact("8765432", "JaneJaneJane", "Doe", "8004441800", "221 B Baker Street");
			
		});	}
	
	@Test
	void testContactTestFirstNameIsNull() {
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			new Contact("8765432", null, "Doe", "8004441800", "221 B Baker Street");
			
		});	}
	
	// Tests to ensure last name is not too long 
	@Test
	void testContactTestLastNameTooLong() {
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			new Contact("8765432", "Jane", "DoeDoeDoeDoe", "8004441800", "221 B Baker Street");
			
		});	}
	
	@Test
	void testContactTestLastNameIsNull() {
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			new Contact("8765432", "Jane", null, "8004441800", "221 B Baker Street");
			
		});	}
	
	// Tests to ensure phone number is not too long
	@Test
	void testContactTestPhoneNumTooLong() {
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			new Contact("8765432", "Jane", "Doe", "80044418003333", "221 B Baker Street");
			
		});	}
	
	@Test
	void testContactTestPhoneNumIsNull() {
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			new Contact("8765432", "Jane", "Doe", null, "221 B Baker Street");
			
		});	}
	
	// Tests to ensure address is not too long
	@Test
	void testContactTestAddressTooLong() {
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			new Contact("8765432", "Jane", "Doe", "8004441800", "221 B Baker Street, Sherlock Holmes");
			
		});	}
	
	@Test
	void testContactTestAddressIsNull() {
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			new Contact("8765432", "Jane", "Doe", "8004441800", null);
			
		});	}
	
}
