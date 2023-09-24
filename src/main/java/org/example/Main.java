package org.example;


import phone_app.Registration;

public class Main {
    public static void main(String[] args) {
        BankATM atm =new BankATM();
        Registration registration = new Registration(291049,4243,"423424",424242);
        registration.mainMenu();
    }
}