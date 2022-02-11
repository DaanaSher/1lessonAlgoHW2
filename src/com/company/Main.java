package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введиту сумму зарплаты");
        int income = scanner.nextInt();
        int fifty = (income * 50) / 100;
        int thirty = (income * 30) / 100;
        int twenty = (income * 20) / 100;
        int fiveInFifty = (fifty * 5) / 100;
        int eightInThirty = (thirty * 8) / 100;
        int tenInTwenty = (twenty * 10) / 100;
        int bonus = fiveInFifty + eightInThirty + tenInTwenty;
        System.out.println("Зарплата = " + income);
        System.out.println("Бонус 5 % от 50% " + income + " = " + fiveInFifty );
        System.out.println("Бонус 8 % от 30% " + income + " = " + eightInThirty );
        System.out.println("Бонус 10 % от 20% " + income + " = " + tenInTwenty );
        System.out.println("Общий бонус = " + bonus);
    }
}
