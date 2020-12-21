package Lessons.Lesson7.oop;

import java.util.Random;

public class Cat {
  private String name;
  private Random random = new Random();
  private boolean satiety;//показатель говорит о том сыт котик или нет

  public Cat(String name) {
    this.name = name;
    this.satiety = false; //изначально котик голоден
  }

  public void eat(Plate plate) {
    int nyam = random.nextInt(4) + 3;
    System.out.println("Котик хочет скушать - "+nyam);
    this.satiety = plate.decreaseFood(nyam);
  }

  //вывести информацию о сытости котов
  public void printInfo() {
    System.out.println(this);
  }

  @Override
  public String toString() {
    return "Кот: " + this.name+", котик - "+ (this.satiety ? "сыт":"голоден :(") ;
  }

}
