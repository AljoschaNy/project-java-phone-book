package org.example;

import org.example.phonebook.Contact;
import org.example.phonebook.PhoneBook;

public class Main {
    public static void main(String[] args) {
        PhoneBook phoneBook1 = new PhoneBook();
        phoneBook1.addContact(new Contact("Aljoscha", "Nyang","12345","aljoscha@mail.de","Address 1"));
        phoneBook1.addContact(new Contact("Paul", "Müller","345567","paul@mail.de","Address 2"));
        phoneBook1.addContact(new Contact("Fabian", "Hansi","91283","fabian@mail.de","Address 3"));
        phoneBook1.addContact(new Contact("Max", "Mustermann","11111","max@mail.de","Address 4"));
        phoneBook1.addContact(new Contact("Marie", "Schulz","22222","marie@mail.de","Address 5"));

        //System.out.println(phoneBook1.searchContact("Nyang"));
        //System.out.println(phoneBook1);
        //phoneBook1.editContact("Hansi1","first name","Tim");
        //System.out.println(phoneBook1);
        //phoneBook1.deleteContact("Müller");
        //System.out.println(phoneBook1);
        //phoneBook1.editContact("Schulz","email","testtest@gmail.com");
        //System.out.println(phoneBook1);

    }
}