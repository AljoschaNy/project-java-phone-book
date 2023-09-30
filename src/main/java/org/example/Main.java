package org.example;

import org.example.phonebook.Contact;

public class Main {
    public static void main(String[] args) {

        Contact contact1 = new Contact(
                "test",
                "test",
                "12345-6789",
                "asdfg@gmx.de",
                "Adress 1"
        );
        Contact contact2 = new Contact(
                "test",
                "test",
                "12345-6789",
                "asdfg@gmx.de",
                "Adress 1"
        );
        Contact contact3 = new Contact(
                "test",
                "test",
                "12345-6789",
                "asdfg@gmx.de",
                "Adress 1"
        );
        Contact contact4 = new Contact(
                "test",
                "test",
                "12345-6789",
                "asdfg@gmx.de",
                "Adress 1"
        );

        System.out.println(contact3);
        System.out.println(contact2);
        System.out.println(contact1);
        System.out.println(contact4);
    }
}