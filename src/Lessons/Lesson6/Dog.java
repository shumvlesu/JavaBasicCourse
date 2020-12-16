package Lessons.Lesson6;

public class Dog extends Animal {

  protected boolean isBark = false;

  public Dog(String name, String color, int age, boolean isBark) {
    // обращаюсь к коструктору суперкласса. Должен быть обязательно первой строкой.
    super(name, color, age);
    this.isBark = isBark;

  }

  public Dog(String name) {
    super(name);

  }

  @Override
  public String toString() {

    return "Dog " + super.toString() + //вызывваем реализацию toString() у суперкласса и добавляем свое поле
            " isBark=" + isBark +
            '}';
  }
}
