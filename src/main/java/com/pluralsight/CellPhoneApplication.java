package com.pluralsight;

import java.util.Scanner;

public class CellPhoneApplication {

    static void main(String[] args) {

        Scanner myScanner = new Scanner(System.in);

        System.out.print("What is the serial number? ");
        String number = myScanner.nextLine();
        long serialNumber = Long.parseLong(number);

        System.out.print("What model is the phone? ");
        String phoneModel = myScanner.nextLine();

        System.out.print("Who is the carrier? ");
        String carrier = myScanner.nextLine();

        System.out.print("What is the phone number? ");
        String phoneNumber = myScanner.nextLine();

        System.out.print("Who is the owner of the phone? ");
        String owner = myScanner.nextLine();

        CellPhone customer = new CellPhone(serialNumber, phoneModel, carrier, phoneNumber, owner);

        System.out.println(customer.getSerialNumber());
        System.out.println(customer.getModel());
        System.out.println(customer.getCarrier());
        System.out.println(customer.getPhoneNumber());
        System.out.print(customer.getOwner());

        myScanner.close();
    }

}
