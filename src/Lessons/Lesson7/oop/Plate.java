package Lessons.Lesson7.oop;

public class Plate {

  private int food;

  public void addFoot(int food) {
    this.food += food;
  }

  public void printInfo() {
    System.out.println(this);
  }

  @Override
  public String toString() {
    return "Plate: food = " + food;
  }

  public void decreaseFood(int food) {
    this.food -= food;
  }

}
