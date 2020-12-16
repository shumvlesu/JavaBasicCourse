package Lessons.Lesson6;

public class Main {

  //В версии ultimate есть возможность рисовать диаграммы классов и подклассов при помощи расширения plantUML

  public static void main(String[] args) {
    Cat cat = new Cat();
    System.out.println(cat.toString());
    Dog dog =new Dog();
    System.out.println(dog.toString());
  }
}
