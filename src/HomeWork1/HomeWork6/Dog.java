package HomeWork1.HomeWork6;

public class Dog extends Animal implements Swiming,Runing,Jumping{

  public Dog(String name) {
    super(name);
  }

  @Override
  public void swim(int speed) {
    System.out.println("Я плаваю!");
  }

  @Override
  public void jump(int height) {

  }

  @Override
  public void run(int speed) {

  }

}
