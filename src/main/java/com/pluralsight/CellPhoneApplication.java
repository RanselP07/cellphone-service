package com.pluralsight;

import java.util.Scanner;

public class CellPhoneApplication {

    static void main(String[] args) {

        Scanner myScanner = new Scanner(System.in);

        System.out.print("What is the serial number? ");
        String number = myScanner.nextLine();
        long serialNumber = Long.parseLong(number);

        System.out.print("What model is the phone? ");
        String model = myScanner.nextLine();

        System.out.print("Who is the carrier? ");
        String carrier = myScanner.nextLine();

        System.out.print("What is the phone number? ");
        String phoneNumber = myScanner.nextLine();

        System.out.print("Who is the owner of the phone? ");
        String owner = myScanner.nextLine();

        CellPhone customer1 = new CellPhone(serialNumber, model, carrier, phoneNumber, owner);

        System.out.println(customer1.getSerialNumber());
        System.out.println(customer1.getModel());
        System.out.println(customer1.getCarrier());
        System.out.println(customer1.getPhoneNumber());
        System.out.println(customer1.getOwner() + "\n");

        CellPhone customer2 = new CellPhone();
        customer2.setPhoneNumber("234-546-7777");
        customer2.setOwner("Dave");

        System.out.print(display(customer1));
        System.out.println(customer1.dial(customer2.getPhoneNumber()));

        System.out.print(display(customer2));
        System.out.println(customer2.dial(customer1.getPhoneNumber()));

        myScanner.close();
    }

    private static String display(CellPhone phone) {
        String own = "Owner: " + phone.getOwner();
        String number = "Phone Number: " + phone.getPhoneNumber();
        return own + "\n" + number;
    }

}
