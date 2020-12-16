package Lessons.Lessons5;

public class Lessons5 {
  public static void main(String[] args) {

    //Ctrl+r посик и замена значений
    //Alt+Ins можно создать из шаблона (конструкторы, геттеры и сеттеры и т.д.) используя горячие клавиши

    Cat cat1= new Cat("Мартин Лютер Кинг", "Афрокот",2);
    Cat cat2= new Cat("Борис Николаевич", "Рыжий",3);
    //обращение к перегруженному конструктору с одним параметром
    Cat cat3= new Cat("Шава");

    Cat cat4 = new Cat("Том");



    cat1.setAge(-1);

    cat1.printInfo();
    cat2.printInfo();
    cat3.printInfo();

    cat4 = null;
    //просим гарбедж коллектор прийти к нам. он может прийти или не прийти по его "желанию"
    System.gc();

    System.out.println(Cat.getCatCount());

  }
}
