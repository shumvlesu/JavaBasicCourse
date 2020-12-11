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
  static int turnsCount;

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
    System.out.println();
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
    turnsCount = 0;
    while (true) {
      //ход человека
      humanYurn();
      printMap();
      //проверка на окончание игры после хода человека
      checkEnd(DOT_HUMAN);

      //ход ии
      aiTurn();
      printMap();
      //проверка на окончание игры после хода ии
      checkEnd(DOT_AI);
    }
  }

  private static void humanYurn() {
    int rowNumber;
    int columnNumber;

    System.out.println("\n  Ход человека! Введите номера строки и столбца");
    do {
      rowNumber = 0;
      columnNumber = 0;

      System.out.print("Строка = ");
      if (in.hasNextInt()) {
        rowNumber = in.nextInt() - 1;
      } else {
        in.next();
        System.out.println("Введите число!");
        continue;
      }

      System.out.print("Столбец = ");
      if (in.hasNextInt()) {
        columnNumber = in.nextInt() - 1;
      } else {
        in.next();
        // System.out.println("Введите число!");
        continue;
      }
    } while (!isHumanValidTurn(rowNumber, columnNumber));

    map[rowNumber][columnNumber] = DOT_HUMAN;

  }

  private static boolean isHumanValidTurn(int rowNumber, int columnNumber) {
    return isNumbersValued(rowNumber, columnNumber) && isCellOccupancy(rowNumber, columnNumber, false);
  }


  //валидность чисел
  private static boolean isNumbersValued(int rowNumber, int columnNumber) {
    if (rowNumber > SIZE || rowNumber < 0 || columnNumber > SIZE || columnNumber < 0) {
      System.out.println("\nПроверьте значение строки и столбца");
      return false;
    }
    return true;
  }

  //проверка на занятость
  private static boolean isCellOccupancy(int rowNumber, int columnNumber, boolean isAI) {
    if (map[rowNumber][columnNumber] != DOT_EMPTY) {
      if (!isAI) System.out.println("\nВы выбрали занятую ячейку!");
      return false;
    }
    return true;
  }

  private static void checkEnd(char symbol) {
    boolean isEnd = false;

    //победа
    if (checkWin(symbol)) {
      isEnd = true;
      System.out.println();
      String winMessage;
      if (symbol == DOT_HUMAN) {
        winMessage = "Ура! Вы победили!";
      } else {
        winMessage = "Восстание близко. ИИ победил.";
      }

      System.out.println(winMessage);
    }


    //ничья
    if (!isEnd && isMapFullByTurnsCount()) {
      System.out.println("Ничья!");
      isEnd = true;
    }

    if (isEnd) System.exit(0);

  }

  private static boolean isMapFullByTurnsCount() {
    return ++turnsCount == SIZE * SIZE;
  }

  private static boolean checkWin(char symbol) {

    if (map[0][0] == symbol && map[0][1] == symbol && map[0][2] == symbol) return true;
    if (map[1][0] == symbol && map[1][1] == symbol && map[1][2] == symbol) return true;
    if (map[2][0] == symbol && map[2][1] == symbol && map[2][2] == symbol) return true;

    if (map[0][0] == symbol && map[1][0] == symbol && map[2][0] == symbol) return true;
    if (map[0][1] == symbol && map[1][1] == symbol && map[2][1] == symbol) return true;
    if (map[0][2] == symbol && map[1][2] == symbol && map[2][2] == symbol) return true;

    if (map[0][0] == symbol && map[1][1] == symbol && map[2][2] == symbol) return true;
    if (map[0][2] == symbol && map[1][1] == symbol && map[2][0] == symbol) return true;

    return false;
  }

  private static void aiTurn() {
    int rowNumber;
    int columnNumber;
    System.out.println("\nХод копьютера");
    do {
      rowNumber = random.nextInt(SIZE);
      columnNumber = random.nextInt(SIZE);
    } while (!isCellOccupancy(rowNumber, columnNumber, true));
    map[rowNumber][columnNumber] = DOT_AI;
  }

}
