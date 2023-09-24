package phone_app;

import org.example.BankATM;
import org.example.BankAccount;
import org.example.BankCard;

import java.util.Scanner;

public class Registration implements RegistrationInterface {
    long numberPhone;
    int userPassword;
    String name;
    int numberCard;
    public Registration(long numberPhone, int userPassword, String name, int numberCard) {
        this.numberPhone = numberPhone;
        this.userPassword = userPassword;
        this.name = name;
        this.numberCard = numberCard;
    }
    BankATM bankApp = new BankATM();
    Scanner sc = new Scanner(System.in);

    @Override
    public void mainMenu() {
        System.out.println("Что вы хотите сделать?");
        System.out.println("1-Зарегистрироваться");
        System.out.println("2-Войти");
        int method = sc.nextInt();

        switch (method) {
           case 1 -> registration();
           case 2 -> numberPhone();
           default -> System.out.println("Неверное значение");

        }
    }


    @Override
    public void numberPhone() {
        System.out.println("Введите номер телефона: ");
        System.out.print("+");
        long number = sc.nextLong();
        BankAccount numberPhone;
    }

    @Override
    public void password() {
        int password = sc.nextInt();
        this.userPassword = password;
    }

    @Override
    public void registration() {
        System.out.println("Введите ваше имя: ");
        String name= sc.next();
        numberPhone();
        System.out.println("Придумайте пароль: ");
        password();
        System.out.println("Добавте карту");
        System.out.println("Введите номер карты: ");
        int numberCard = sc.nextInt();
        System.out.println("Введите пин код: ");
        int pinCode = sc.nextInt();
        System.out.println("Введите cvv: ");
        int cvv = sc.nextInt();
        int id = (int) Math.random();
        bankApp.bankAccounts.add(new BankAccount(name, id ,1, new BankCard(numberCard,pinCode,cvv) ,bankApp.registrations));
        System.out.println("Вы успешно создали аакаунт");
        System.out.println("Вход");
        entranceInSystem();
    }

    @Override
    public void entranceInSystem() {
        System.out.println("Введите номер телефона: ");
        System.out.print("+");
        long number = sc.nextLong();
        System.out.println("Введите пароль: ");
        int password = sc.nextInt();
        if (number == numberPhone && password == userPassword ){
            System.out.println("Вы успешно вошли");
            bankApp.terminate();
        }else {
            System.out.println("Вы неправильно ввели данные");
        }
    }
}
