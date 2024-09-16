package com.address.book;

import java.util.Scanner;

public class AddressBookMain {
    public static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println("Welcome to Address Book System");
        AddressBook addressBook = new AddressBook();

        boolean flag = true;

        while (flag) {

            System.out.println("1.Add Contact");
            System.out.println("2.Display Contact");
            System.out.println("3.Edit Contact");
            System.out.println("4.Delete Contact");
            System.out.println("5.Exit");
            System.out.println("Enter Choice: ");

            int option = sc.nextInt();

            switch (option) {
                case 1:
                    addressBook.addContact();
                    break;

                case  2:
                    addressBook.displayRecord();
                    break;

                case 3:
                    System.out.println("Enter the Person First name to edit details: ");
                    String person_name = sc.next();

                    boolean b = addressBook.editContact(person_name);
                    if (b == true) {
                        System.out.println("Details Updated");
                    } else {
                        System.out.println("Contact Not Found");
                    }
                    break;

                case 4:
                    System.out.println("Enter the Contact to be deleted:");
                    String firstName = sc.next();
                    boolean listDeleted = addressBook.deleteContact(firstName);
                    if (listDeleted) {
                        System.out.println("Details Deleted");
                    } else {
                        System.out.println("Cannot be Deleted");
                    }
                    break;

                default:
                    System.out.println("Invalid choice");

            }
        }

    }
}