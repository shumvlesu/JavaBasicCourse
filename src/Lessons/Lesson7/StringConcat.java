package Lessons.Lesson7;

import java.io.*;

public class StringConcat {
  public static void main(String[] args) throws IOException {
    String a1 = "Hello My ";
    String a2 = "Dear World";
    String a3 = a1 + a2;
    String a33 = a1.concat(a3);

    String b1 = "Число";
    int b2 = 10;
    String b3 = b1 + b2;
    String b33 = b1.concat(String.valueOf(b2));

    String c = "(" + 2 + 3 + ")" + b3 + "!";


    System.out.println("Вывод строк символами или отдельными словами:");
    //разбиваем строку на символы
    for (char ch : b1.toCharArray()) {  //toCharArray() разбивает строку на массив символов.
      System.out.println("Буква: " + ch);
    }

    //разбиваем строку на слова
    for (String word : a3.split("\s+")) { //Метод split("\s+"). Параметр сплита это регулярное выражение (шаблон по которому что то может происходить.
      // поиск, проверка на правильностть ввода телефона, поиск запрещенных слов и т.д.)
      System.out.println("Слово: " + word);
    }


    System.out.println("Сравнивание строк:");
    System.out.println(a1.equals(a2)); //сравнивание именно значений
    System.out.println(a1.compareTo(a2)); //compareTo применяется обычно для сортировки. Тут будет возвращено 4 так как
    //первый символ в строке ("H") на 4 символа дальше первого символа во второй строке("D")
    //Получается если число положительное то значит строка а2 должна быть выше в сортировки строки а1
    //а если отрицательное то а1 должна быть выше а2 в сортировке


    System.out.println("Проверка на пустату строк:");
    String space = " ";
    System.out.println(space == null);
    System.out.println(space.isEmpty());//скажет что строка не пустая так как в строке есть пробел. и вернет false
    System.out.println(space.isBlank());//скажет что строка пустая (true) так как isBlank проверяет на истинно пустоту строки.


    System.out.println("Выделение(копирование) подстроки из строки:");
    System.out.println(a3.substring(6));
    System.out.println(a3.substring(6, 16)); //1 параметр это начало откуда выделяем , второй параметр это если нужно окончание выделения


    System.out.println("Замена подстрокой в строке:");
    System.out.println(a3.replace("My", "Our")); //Заменяем все "My" на "Our" в строке а3 аналог стрЗаменить в 1с
    System.out.println(a3.replaceAll("My", "Our"));
    System.out.println(a3.replace("l", "!")); //Заменяем все "My" на "Our" в строке а3 аналог стрЗаменить в 1с
    System.out.println(a3.replaceAll("l", "!"));


    System.out.println("Нахождение индекса символа в строке:");
    System.out.println(a3.indexOf(' '));//Узнаем какой индекс в строке имеет пробел
    System.out.println(a3.charAt(16));//Узнаем какой символ соответствует 16 индексу в строке




    //Абсолютный путь
    //File file = new File("X:\\Ya.Disk\\work\\Lessons\\java_1\\src\\lesson7\\string\\resources\\text.txt");
    //Отностительный путь
    File file = new File("src\\Lessons\\Lesson7\\resources\\text.txt");
    FileInputStream is = new FileInputStream(file);
    System.out.println(new String(is.readAllBytes()));//метод readAllBytes() считывает байты нужно перевести их в Строку


    //чтение большого файла
    //var говорит о том что переменная примет любой тип помещаемого в переменную значения. это более удобно. называется автоприведение типа.
    var file2 = new File("src/Lessons/Lesson7/resources/java_platform.txt");
    BufferedInputStream is2 = new BufferedInputStream(new FileInputStream(file2));
    //1й способ вывода
    //System.out.println(new String(is2.readAllBytes()));

    //2й способ вывода
    StringBuilder sb = new StringBuilder(); //создаем пустую строку
    //Если мы просто бы сделали sb = ""; то мы каждый раз добавляя к строке n создавали бы новый объект
    //что сожрало бы у нас кучу памяти и затормозило бы выполнение программы.

    int n; //
    while ((n = is2.read()) != -1) { // присваиваем n значение из is.read() и сразу сравниваем с -1. Так у нас и n имеет значение и сравнение сразу делаем.
      //-1 это отсутствие чего либо в файле.
      sb.append((char) n); //в объект добавляем сивол
    }
    System.out.println(sb);

  }
}
