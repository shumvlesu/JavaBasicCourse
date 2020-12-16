package Lessons.Lesson6;

public class Cat extends Animal {
  protected String name;
  /*Cat(){
   super(null);
  }*/

  public Cat(String name, String color, int age) {
    super(name, color, age);
  }

  public Cat(String name) {
    super(name);

  }
}
