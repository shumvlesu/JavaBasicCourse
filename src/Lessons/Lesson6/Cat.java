package Lessons.Lesson6;

public class Cat extends Animal implements Runner{
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

  @Override
  public void voice() {
    System.out.println("Мяу!");
    //super.voice();
  }

  @Override
  public void run() {

  }
}
