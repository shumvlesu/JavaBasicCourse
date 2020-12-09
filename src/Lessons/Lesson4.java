package Lessons;

import java.util.Random;
import java.util.Scanner;

public class Lesson4 {

    static final int SIZE = 3;

    static final char DOT_EMPTY = '•';
    static final char DOT_HUMAN = 'X';
    static final char DOT_AI = '0';

    static final char HEADER_FIRST_SYMBOL = '♥';
    static final String EMPTY = " ";

    static final char[][] map = new char[SIZE][SIZE];
    static final Scanner in = new Scanner(System.in);
    static final Random random = new Random();

    public static void main(String[] args) {
        turnGame();
    }

    private static void turnGame() {
        initMap();
        printMap();
        playGame();
    }

    private static void printMap() {
        printHeaderMap();
        printBodyMap();
    }

    private static void initMap() {
        for (int i = 0; i < SIZE; i++) {
            for (int j = 0; j < SIZE; j++) {
                map[i][j] = DOT_EMPTY;
            }
        }
    }

    private static void printHeaderMap() {
        System.out.print(HEADER_FIRST_SYMBOL + EMPTY);
        for (int i = 0; i < SIZE; i++) {
            printMapNumbers(i);
        }
        System.out.println();
    }

    private static void printMapNumbers(int i) {
        System.out.print(i + 1 + EMPTY);
    }

    private static void printBodyMap() {
        for (int i = 0; i < SIZE; i++) {
            printMapNumbers(i);
            for (int j = 0; j < SIZE; j++) {
                System.out.print(map[i][j] + EMPTY);
            }
            System.out.println();
        }
    }

    private static void playGame() {
        //ход человека
        humanYurn();
        printMap();
        //проверка на окончание игры после хода человека


        //ход ии
        printMap();
        //проверка на окончание игры после хода ии
    }

    private static void humanYurn() {
        int rowNumber = 0;
        int columnNumber = 0;

        do {
            if (in.hasNextInt()) {
                rowNumber = in.nextInt() - 1;
            } else {
                in.next();
                System.out.println("Введите число!");
                continue;
            }

            if (in.hasNextInt()) {
                columnNumber = in.nextInt() - 1;
            } else {
                in.next();
                System.out.println("Введите число!");
                continue;
            }
        } while (!isCellValid());

        map[rowNumber][columnNumber] = DOT_HUMAN;

    }

  private static boolean isCellValid() {
      return false;
  }


}
