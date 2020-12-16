package Lessons.Lesson6;

public class Animal {

  protected String name;
  private String color;
  protected int age;

  public Animal(String name, String color, int age) {
    this.name = name;
    this.color = color;
    this.age = age;
  }

  public Animal(String name) {
    this(name,"Серобуромалиновый",0);
  }

  public Animal() {
    this(null);
  }

  @Override
  public String toString() {
    return "{" +
            "name='" + name + '\'' +
            ", color='" + color + '\'' +
            ", age=" + age +
            '}';
  }


}
