package Lessons.Lessons5;

public class Lessons5 {
  public static void main(String[] args) {

    //Ctrl+r посик и замена значений
    //Alt+Ins можно создать из шаблона (конструкторы, геттеры и сеттеры и т.д.) используя горячие клавиши

    Cat cat1= new Cat("Мартин Лютер Кинг", "Афрокот",2);
    Cat cat2= new Cat("Борис Николаевич", "Рыжий",3);
    //обращение к перегруженному конструктору с одним параметром
    Cat cat3= new Cat("Шава");

    cat1.printInfo();
    cat2.printInfo();
    cat3.printInfo();


  }
}
