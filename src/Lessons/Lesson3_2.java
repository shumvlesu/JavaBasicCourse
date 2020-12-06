package Lessons;

import java.util.Scanner;

public class Lesson3_2 {

    static Scanner in = new Scanner(System.in);

    public static void main(String[] args) {
        turnGame();
    }

    private static void turnGame() {
        while (true) {
            printTitles();
            chooseAction();
        }
    }

    private static void printTitles() {
        System.out.println("\n Выберите цвет терминала:");
        System.out.println("1. Красный");
        System.out.println("2. Бирюзовый");
        System.out.println("3. Желтый");
        System.out.println("4. Синий");
        System.out.println("0. Выход");
    }

    private static void chooseAction() {
        switch (in.next()) {
            case "1":
                colorRed();
                break;
            case "2":
                colorCyan();
                break;
            case "3":
                colorYellow();
                break;
            case "4":
                colorBlue();
                break;
            case "0":
                doExit();
                break;
            default:
                System.out.println("Попробуйте еще раз");
        }
    }

    private static void colorRed() {
        System.out.println("\u001B[31m");
    }

    private static void colorCyan() {
        System.out.println("\u001B[36m");
    }

    private static void colorYellow() {
        System.out.println("\u001B[33m");
    }

    private static void colorBlue() {
        System.out.println("\u001B[34m");
    }

    private static void doExit() {
        System.out.println("Вы уверены? y/n");

        switch (in.next()) {
            //новый синтаксис switch
            case "y", "yes", "Да", "да", "+" -> System.exit(0); //exit завершает выполнение программы,
            // а параметр 0 говорит что без ошибок.1 с ошибками.
        }

    }


}
