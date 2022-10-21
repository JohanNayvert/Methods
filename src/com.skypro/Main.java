package com.skypro;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        System.out.println("Methods");
        System.out.println();

        announceArguments();

        System.out.println("HomeWork Complete");
    }

    //обьявление переменных
    private static void announceArguments() {
        int years = 2022;
        int currentYear = LocalDate.now().getYear();
        int versionOS = 0;
        int deliveryDistance = 95;
        checkByPrintLeapYear(years);
        checkVersionOS(currentYear, versionOS);
        deliveryTimeCalculation(deliveryDistance);
    }

    //task-3
    public static void deliveryTimeCalculation(int longDistance) {
        System.out.println("Task-3");
        int deliveryLongDistance = (longDistance / 40) + 1;
        System.out.println("Потребуется дней: " + deliveryLongDistance);
        System.out.println(" ");
    }

    //task-2
    private static void checkVersionOS(int ageGadget, int versionOS) {
        System.out.println("Task-2");
        if (versionOS == 0) {
            if (ageGadget < 2015) {
                System.out.println("Установите облегченную версию приложения для iOS по ссылке");
            } else {
                System.out.println("Установите приложение iOS по ссылке");
            }
        }
        if (versionOS != 0) {
            if (ageGadget < 2015) {
                System.out.println("Установите облегченную версию приложения для Android по ссылке");
            } else {
                System.out.println("Установите приложение Android по ссылке");
            }
        }

        System.out.println();
    }

    //task-1
    public static void checkByPrintLeapYear(int yearsNumber) {
        System.out.println("Task-1");
        if (yearsNumber % 4 == 0 && yearsNumber % 100 != 0 || yearsNumber % 400 == 0) {
            System.out.printf("%d - високосный год\n", yearsNumber);
        } else {
            System.out.printf("%d - не високосный год\n", +yearsNumber);
        }
        System.out.println();
    }
}
