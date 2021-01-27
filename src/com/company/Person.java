package com.company;

public class Person {

    String name;
    String surname;
    String PINcode;
    Double balance;
    String cardNumber;

    public Person(String name, String surname, String PINcode, Double balance, String cardNumber) {
        this.name = name;
        this.surname = surname;
        this.PINcode = PINcode;
        this.balance = balance;
        this.cardNumber = cardNumber;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getPINcode() {
        return PINcode;
    }

    public void setPINcode(String PINcode) {
        this.PINcode = PINcode;
    }

    public Double getBalance() {
        return balance;
    }

    public void setBalance(Double balance) {
        this.balance = balance;
    }

    public String getCardNumber() {
        return cardNumber;
    }

    public void setCardNumber(String cardNumber) {
        this.cardNumber = cardNumber;
    }
}
