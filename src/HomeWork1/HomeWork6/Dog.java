package HomeWork1.HomeWork6;

public class Dog extends Animal implements Swiming{

  public Dog(String name) {
    super(name);
  }

  @Override
  public void swim(int meters) {
    System.out.println("Я плаваю!");
  }

  @Override
  public void jump(int height) {

  }

  @Override
  public void run(int meters) {

  }

}
