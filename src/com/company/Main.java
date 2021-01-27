package com.company;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.Random;


public class Main {

    public static Scanner scan = new Scanner(System.in);

    public static ArrayList<Person> Persons = new ArrayList<>();

    public static void main(String[] args) {

        int select = -1;

        while (select != 0) {
            System.out.println("1. Sign in");
            System.out.println("2. Create account");
            System.out.println("0. Exit");

            select = scan.nextInt();

            if (select == 1) {
                SignIn();
            } else if (select == 2) {
                CreateAccount();
            }
        }
    }

    private static void SignIn() {
        int method = scan.nextInt();
        if (method == 1) {
            System.out.println("Enter PINcode: ");
            String PINcode = scan.next();
            boolean check = false;
            for (int i = 0; i < Persons.size(); i++) {
                if (Persons.get(i).PINcode.equals(PINcode)) {
                    check = true;
                    System.out.println("Name: " + Persons.get(i).name);
                    System.out.println("Surname: " + Persons.get(i).surname);
                    System.out.println("PINcode: " + Persons.get(i).PINcode);
                    System.out.println("balance: " + Persons.get(i).balance);
                    System.out.println("CardNumber: " + Persons.get(i).cardNumber);

                    int select = -1;

                    while (select != 0) {
                        System.out.println("1. Check Balance");
                        System.out.println("2. Send money to another account");
                        System.out.println("3. Deposit Money");
                        System.out.println("4. Withdraw Money");
                        System.out.println("5. Change PINcode");
                        System.out.println("6. Logout");
                        select = scan.nextInt();

                        if (select == 1) {
                            CheckBalance();
                        } else if (select == 2) {
                            SendMoney();
                        }
                    }
                }
            }

        }
    }
    private static void CreateAccount(){
                System.out.print("Enter name: ");
                String name = scan.next();
                System.out.print("Enter surname: ");
                String surname = scan.next();
                System.out.print("Enter PINcode: ");
                String PINcode = scan.next();
                System.out.print("Enter balance: ");
                Double balance = scan.nextDouble();
                System.out.print("Enter CardNumber: ");
                String CardNumber = scan.next();

                Person newPerson = new Person(name, surname, PINcode, balance, CardNumber);
                Persons.add(newPerson);

                System.out.println("Your account has been created successfully!");
    }

    private static void CheckBalance(){
        for (int i = 0; i < Persons.size(); i++)
        System.out.println("balance: " + Persons.get(i).balance);
    }

    private static void SendMoney (){
        for (int i = 0; i < Persons.size(); i++)
            System.out.println("balance: " + Persons.get(i).balance);
    }

    private static String GenerateCardNumber()
    {
        Random rand = new Random();
        String cardNum = "";
        for (int i=0; i<16; i++){
            int number = rand.nextInt(9);
            cardNum += String.valueOf(number);
        }
        return cardNum;
    }

}


