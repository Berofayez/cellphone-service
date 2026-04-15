package com.pluralsight;

import java.util.Scanner;

public class CellPhoneApplication {
    static void main() {
        Scanner scanner = new Scanner(System.in);

        CellPhone cellPhone = new CellPhone();
        CellPhone cellPhone1 = new CellPhone();
        CellPhone cellPhone2 = new CellPhone();
        CellPhone phone = new CellPhone(2323, "nokia", "varizon", "2062611691", "Abeer");

        display(phone);

        cellPhone1.dial(phone);


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

        display(cellPhone1);
        display(cellPhone2);

        cellPhone1.dial(cellPhone2.getPhoneNumber());
        cellPhone2.dial(cellPhone1.getPhoneNumber());





    }
    public static void display(CellPhone phone) {
        System.out.println("The phone serial number is: " + phone.getSerialNumber());
        System.out.println("The phone dual number is: " + phone.getPhoneNumber());
        System.out.println("The phone carrier is: " + phone.getCarrier());
        System.out.println("The phone model is: " + phone.getModel());
        System.out.println("The phone owner is: " + phone.getOwner());

    }
}
