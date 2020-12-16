package Lessons.Lesson6;

public class Main {

  //В версии ultimate есть возможность рисовать диаграммы классов и подклассов при помощи расширения plantUML

  public static void main(String[] args) {
    Cat cat = new Cat("Мартин");
    System.out.println(cat.toString());
    Dog dog = new Dog("Гендальф", "Серый", 10, true);
    System.out.println(dog.toString());
  }
}
