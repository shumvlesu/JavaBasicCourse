package Lessons.Lesson7.oop;

public class Test {

  public static void main(String[] args) {
    Cat cat = new Cat("Мартин");
    Plate plate = new Plate();

    plate.addFoot(10);
    cat.eat(plate);
    plate.printInfo();
  }

}
