package com.pluralsight;

import java.util.Scanner;

public class CellPhoneApplication {
    static void main() {
        Scanner scanner = new Scanner(System.in);

        CellPhone cellPhone = new CellPhone();

        System.out.print("What is the serial number? ");
        int serialNumber = scanner.nextInt();
        scanner.nextLine();

        System.out.print("What model is the phone? ");
        String model = scanner.nextLine();

        System.out.print("Who is the carrier? ");
        String carrier = scanner.nextLine();

        System.out.print("What is the phone number? ");
        String phoneNumber = scanner.nextLine();

        System.out.print("Who is the owner of the phone? ");
        String owner = scanner.nextLine();

        cellPhone.setSerialNumber(serialNumber);
        cellPhone.setPhoneNumber(phoneNumber);
        cellPhone.setCarrier(carrier);
        cellPhone.setModel(model);
        cellPhone.setOwner(owner);

        System.out.println("The phone serial number is: " + cellPhone.getSerialNumber());
        System.out.println("The phone dual number is: " + cellPhone.getPhoneNumber());
        System.out.println("The phone carrier is: " + cellPhone.getCarrier());
        System.out.println("The phone model is: " + cellPhone.getModel());
        System.out.println("The phone owner is: " + cellPhone.getOwner());


    }
}
