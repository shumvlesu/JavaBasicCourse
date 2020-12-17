package HomeWork;

public class HomeWork1 {

  //1.Создать пустой проект в IntelliJ IDEA и прописать метод main();
  public static void main(String[] args) {

    //2.Создать переменные всех пройденных типов данных,и инициализировать их значения;
    byte pByte = 127; //от -128 до 127
    short pShort = 32767; //от -32768 до 32767
    int pInt = 2; // от -2147483648 до 2147483647
    long pLong = 9223372036854775807L; //от -9223372036854775808 до 9223372036854775807
    float pFloat = 31.24f; //от ~1,4*10-45 до ~3,4*1038
    double pDouble = 3.14159; //от ~4,9*10-324  до ~1,8*10308
    char pChar = 'f';
    boolean pBoolean = true;
    String str = new String("Строка");

    //3.Написать метод вычисляющий выражение a*(b+(c/d)) и возвращающий результат,где a,b,c,d – входные параметры этого метода;
    System.out.println(formulaCalculation(1, 2, 3, 4));

    //4.Написать метод,принимающий на вход два числа,и проверяющий что их сумма лежит в пределах от 10до 20(включительно),если да – вернуть true,в противном случае – false;
    System.out.println(booleanSum(15, 4));

    //5.Написать метод,которому в качестве параметра передается целое число,метод должен напечатать в консоль положительное ли число передали,
    // или отрицательное;Замечание:ноль считаем положительным числом.
    whatNumber(15);

    //6.Написать метод,которому в качестве параметра передается целое число,метод должен вернуть true,если число отрицательное;
    System.out.println(whatNumberBoolean(-15));

    //7.Написать метод,которому в качестве параметра передается строка,обозначающая имя,метод должен вывести в консоль сообщение «Привет,указанное_имя!»;
    hello("Вася");

    //8.*Написать метод,который определяет является ли год високосным,и выводит сообщение в консоль.
    //Каждый 4-й год является високосным,кроме каждого 100-го,при этом каждый 400-й – високосный.
    System.out.println(leapYear(2020));
  }

  public static float formulaCalculation(int a, int b, float c, int d) {
    return a * (b + (c / d));
  }

  public static boolean booleanSum(int a, int b) {
    return 10 <= a + b && a + b <= 20;
  }

  public static void whatNumber(int a){
    System.out.println(a < 0 ? "Число "+a+" отрицательное" : "Число "+a+" положительное");
  }

  public static boolean whatNumberBoolean(int a){
    return a < 0;
  }

  public static void hello(String str){
    System.out.println("Привет, "+str+"!");
  }

  public static String leapYear(int a){
    return (a % 100 != 0 && a % 4 == 0) || a % 400 ==0 ? "Високосный год" : "Обычный год";
  }

}