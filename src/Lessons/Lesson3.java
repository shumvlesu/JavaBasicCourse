package Lessons;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.Buffer;
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Lesson3 {

    public static void main(String[] args) {
        //Ctrl+F12 посмотреть все методы и классы в модуле
        //Alt+Ctrl+T позволяет выбрать шаблоны текста по типу try catch
        //Alt+Ctrl+M из выделенного куска кода делает отдельный метод

        String str1 = "Java"; //создает это значение Java в куче
        String str2 = "Java"; //так как Java в куче уже есть просто копирует в str2 ссылку на Java в куче
        String str3 = new String("Java"); // а тут уже новый объект и Java будет в другой куче.
        // Соответственно и ссылка другая
        testString(str1, str2, str3);

        int[] a = {0, 0, 0, 0, 0, 0, 0, 0};// a - это ссылка на масив созданый в куче
        testArrayChange(a);//сюда мы передали не сам а , а ссылку на массив который и изменим в методе в цикле
        System.out.println(Arrays.toString(a));//теперь значения выведутся те что мы изменили в методе

        //Перегрузка методов
        testOverLoad(3, 4);
        testOverLoad(3.0, 4.54546);
        testOverLoad(3);
        testOverLoad();
        testOverLoad(new int[]{1, 2, 3});
        testOverLoad(1, 2, 3, 4);


        //Способы получения информации от пользователя в консоли
        //1й способ сложный
        //testConsoleInput();
        //2й способ
        //testConsoleInput2();


        //Рандомизация
        testRandom();

    }

    private static void testOverLoad(int a, int b) {
        int multiple = a * b;
        System.out.printf("Произведение двух чисел: %d * %d = %d %n", a, b, multiple);
    }

    private static void testOverLoad(double a, double b) {
        double multiple = a * b;
        System.out.printf("Произведение двух чисел: %.2f * %.2f = %.2f %n", a, b, multiple);
    }

    private static void testOverLoad(int a) {
        int multiple = a * a;
        System.out.printf("Квадрат числа: %d = %d %n", a, multiple);
    }

    private static void testOverLoad() {
        testOverLoad(0, 0);
    }


   /*непрактичный способ
    private static void testOverLoad(int[] array) {
        int multiple = 1;
        for (int item :array) {
            multiple*=item;
        }
        System.out.printf("Произведение всех чисел: %d %n", multiple);
    }*/
    //в этот метод можно передать любое количество параметров , благодаря int... array он преобразуется в массив
    //массив тоже можно передавать на вход сюда

    private static void testOverLoad(int... array) {
        int multiple = 1;
        for (int item : array) {
            multiple *= item;
        }
        System.out.printf("Произведение всех чисел: %d %n", multiple);
    }

    private static void testString(String str1, String str2, String str3) {
        System.out.println("str1=str2: " + (str1 == str2)); //true потомучто сравнивает именно сылки нас троку в куче.
        System.out.println("str1=str3: " + (str1 == str3)); //false так как ссылки разные
        System.out.println("str1=str3: " + str1.equals(str3)); //true так как сравнивается имнно значение а не ссылка

    }

    private static void testArrayChange(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            arr[i] = i;
        }
    }

    private static void testConsoleInput() {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        try {
            String name = reader.readLine();
            reader.close();
            System.out.println("Hello " + name);
        } catch (IOException e) {
            e.printStackTrace();
        }

    }


    private static void testConsoleInput2() {
        Scanner scanner = new Scanner(System.in);
        /*String name = scanner.next();
        System.out.println("Hello "+name);
        */
        System.out.print("Введите число А:");
        int a = scanner.hasNextInt() ? scanner.nextInt() : 0;
        if (a == 0) scanner.next(); //чтобы сканер считал наше неправильно например ввиденое значение
        // и дальше оно не подставилось в сл сканнер
        System.out.print("Введите число B:");
      /*  int b = scanner.hasNextInt() ? scanner.nextInt():0;
        if (a==0) scanner.next();*/
        //так лучше
        int b = 0;
        if (scanner.hasNextInt()) {
            b = scanner.nextInt();
        } else {
            scanner.next();
        }
        testOverLoad(a, b);

    }

    private static void testRandom() {
        Random random = new Random();
        int[] data = new int[30];
        for (int i = 0; i < data.length; i++) {
            //1й способ задания рандомного числа
            data[i] = random.nextInt(10); // от 0 до 9 диапазон
            data[i] = random.nextInt(8)+3; // от 3 до 10 диапазон
            data[i] = random.nextInt(12)-5; // от -5 до +6 диапазон

            //2й способ задания рандомного числа
            data[i] = (int) (Math.random()*10);// от 0 до 9 диапазон
            data[i] = (int) (Math.random()*8)+3; // от 3 до 10 диапазон
            data[i] = (int) (Math.random()*12)-5; // от -5 до +6 диапазон
        }
        System.out.println(Arrays.toString(data));
    }


}
