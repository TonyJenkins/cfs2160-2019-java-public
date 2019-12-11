package com.cfs2160.lectures.week09;

import java.util.ArrayList;

public class PhoneBook {

    private ArrayList <Contact> contacts;

    public PhoneBook () {
        this.contacts = new ArrayList <Contact> ();
    }

    public PhoneBook (ArrayList <Contact> contacts) {
        this.contacts = contacts;
    }

    public void addContact (Contact newContact) {
        this.contacts.add (newContact);
    }

    public boolean printContact (String name) {

        for (Contact c: this.contacts) {
            if (c.getName ().equals (name)) {
                System.out.println (c);
                return true;
            }
        }
        return false;
    }

    public boolean searchContacts (String search) {

        boolean found = false;
        for (Contact c: this.contacts) {
            if (c.getName ().contains (search) || c.getNumber ().contains (search)) {
                System.out.println (c);
                found = true;
            }
        }
        return found;
    }

    public String toString () {
        String s = "";

        s = "Current Contacts\n\n";

        for (Contact c: this.contacts) {
            s += c.toString ();
            s += "\n";
        }

        return s;
    }

    public static void main (String[] args) {

        Contact charlesBabbage = new Contact ("Charles Babbage", "0113 275 1235");
        Contact adaLovelace = new Contact ("Ada Lovelace", "020 487 7362");
        Contact alanTuring = new Contact ("Alan Turing", "0113 336 4112");
        Contact jamesGosling = new Contact ("James Gosling", "+01 271 27261");

        PhoneBook myContacts = new PhoneBook ();

        myContacts.addContact (charlesBabbage);
        myContacts.addContact (adaLovelace);
        myContacts.addContact (alanTuring);
        myContacts.addContact (jamesGosling);

        System.out.println (myContacts);

        System.out.println ("Looking for Ada's Number");
        myContacts.printContact ("Ada Lovelace");

        System.out.println ();
        System.out.println ("Looking for Leeds Phone Numbers.");
        myContacts.searchContacts ("0113");

    }
}
