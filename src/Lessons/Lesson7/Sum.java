package Lessons.Lesson7;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.math.BigInteger;
import java.util.Scanner;

public class Sum {

  public static void main(String[] args) throws FileNotFoundException {

    File input = new File("src/Lessons/Lesson7/resources/input.txt");
    File output = new File("src/Lessons/Lesson7/resources/output.txt");

    //читаем файл при помощи сканнера
    Scanner scanner = new Scanner(input);
    //сюда пишем на выход
    PrintWriter pw = new PrintWriter(output);

    //используем библиотеку длинной арифметики (используется для больших чисел)
    BigInteger a = scanner.nextBigInteger(); //цифры в файле могут невероятно большими. для того чтобы не было ошибки исключения
    // используем BigInteger, для интерпретации строки в число
    BigInteger b = scanner.nextBigInteger();

    //так как а типа BigInteger строка слаживать нужно методом add
    pw.println(a.add(b));
    //pw.println(a.pow(12));

    //закрываю файл
    pw.close();
  }

}
