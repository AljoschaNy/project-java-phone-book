package org.example.phonebook;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class PhoneBook {
    List<Contact> contacts = new ArrayList<>();

    public PhoneBook() {
    }

    public void addContact(Contact contact) {
        this.contacts.add(contact);
    }

    public Contact searchContact(String lastName) {
        for(Contact contact: contacts) {
            if(contact.getLastName().equals(lastName)) {
                return contact;
            }
        }
        System.out.println("Can't find contact");
        return null;
    }

    public void editContact(String lastName, String fieldToEdit, String newEntry) {
        if(this.searchContact(lastName) != null) {
            if(fieldToEdit.equals("first name") || fieldToEdit.equals("firstName") || fieldToEdit.equals("firstname")) {
                this.searchContact(lastName).setFirstName(newEntry);
            } else if (fieldToEdit.equals("last name") || fieldToEdit.equals("lastName") || fieldToEdit.equals("lastname")) {
                this.searchContact(lastName).setLastName(newEntry);
            } else if (fieldToEdit.equals("phone number") || fieldToEdit.equals("phoneNumber") || fieldToEdit.equals("phonenumber")) {
                this.searchContact(lastName).setPhoneNumber(newEntry);
            } else if (fieldToEdit.equals("email")) {
                this.searchContact(lastName).setEmail(newEntry);
            } else if(fieldToEdit.equals("address")) {
                this.searchContact(lastName).setAddress(newEntry);
            }
        }
        System.out.println("Contact has been edited");
    }

    public void deleteContact(String lastName) {
        if(this.searchContact(lastName) != null) {
            this.contacts.remove(this.searchContact(lastName));
            System.out.println("Contact has been deleted");
        }
    }

    public List<Contact> getContacts() {
        return contacts;
    }

    public void setContacts(List<Contact> contacts) {
        this.contacts = contacts;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        PhoneBook phoneBook = (PhoneBook) o;
        return Objects.equals(contacts, phoneBook.contacts);
    }

    @Override
    public int hashCode() {
        return Objects.hash(contacts);
    }

    @Override
    public String toString() {
        return "PhoneBook{" +
                "contacts=" + contacts +
                "\n}";
    }
}
