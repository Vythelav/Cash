package phone_app;

import org.example.BankATM;

import java.util.Scanner;

public class Registration implements RegistrationInterface {
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
           default -> System.out.println("Incorrect values");

        }
    }


    @Override
    public void numberPhone() {
        System.out.println("Введите номер телефона: ");
        long number = sc.nextLong();
        Bank numberPhone;
    }

    @Override
    public void password() {

    }

    @Override
    public void registration() {
        System.out.println("Введите ваше имя: ");
        String name= sc.next();
        System.out.println("Введите номер телефона: ");
        numberPhone();
        System.out.println("Придумайте пароль: ");
        pasword();
    }
}
