package com.address.book;

import java.util.ArrayList;
import java.util.Scanner;

public class AddressBookMain
{
    public static Scanner sc = new Scanner(System.in);
    public static void main( String[] args )
    {
        System.out.println( "Welcome to Address Book System" );
        AddressBook addressBook = new AddressBook();

        System.out.println("Enter the contact details.............");
        System.out.println("Enter the first name:");
        String firstName = sc.next();
        System.out.println("Enter the last name:");
        String lastName = sc.next();
        System.out.println("Enter the address:");
        String address = sc.next();
        System.out.println("Enter the city:");
        String city = sc.next();
        System.out.println("Enter the state:");
        String state = sc.next();
        System.out.println("Enter the zip code:");
        String zip = sc.next();
        System.out.println("Enter the phone no:");
        String phoneNumber = sc.next();
        System.out.println("Enter the email:");
        String email = sc.next();
        Details d = new Details(firstName, lastName, address, city, state, email, phoneNumber, zip);

        ArrayList<Details> contactList = addressBook.contactList(d);
        for(Details contact:contactList){
            System.out.println("First name: "+contact.getFirstName()+"\n"+
                            "Last name: "+contact.getLastName()+"\n"+
                            "Address: "+contact.getAddress()+"\n"+
                            "City: "+contact.getCity()+ "\n"+
                            "State: "+contact.getState()+"\n"+
                            "Email: "+contact.getEmail()+"\n"+
                            "Contact no: "+contact.getPhoneNumber()+"\n"+
                            "Zip: "+contact.getZip());
        }

    }
}
