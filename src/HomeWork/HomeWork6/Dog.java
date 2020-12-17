package HomeWork.HomeWork6;

public class Dog extends Animal implements Swiming {

  //Будем считать что это максимальный предел для всех собак
  final static int DOG_SWIM_METERS = 10;
  final static double DOG_JUMP_METERS = 0.5;
  //final static int DOG_RUN_METERS = 500;
  protected int maxMeters;

  public Dog(String name) {
    super(name);
    //* Добавить животным разброс в ограничениях. То есть у одной собаки ограничение на бег может быть 400 м., у другой 600 м.
    this.maxMeters = (int) (Math.random() * 200) + 400; // ограничение от 400 до 600 метров
  }

  public Dog() {
    this("Безымянная собачка");
  }

  @Override
  public String toString() {
    return super.toString() + " {" +
            "Максимольно может пройти ='" + maxMeters + " метра(ов)" + '\'' +
            '}';
  }

  //3. У каждого животного есть ограничения на действия (бег: кот 200 м., собака 500 м.; прыжок: кот 2 м., собака 0.5 м.; плавание: кот не умеет плавать, собака 10 м.).
  //4. При попытке животного выполнить одно из этих действий, оно должно сообщить результат в консоль. (Например, dog1.run(150); -> результат: run: true)
  @Override
  public void swim(int meters) {
    //System.out.println(meters <= DOG_SWIM_METERS);
    System.out.println("Плавание на " + meters + " метров, ограничение: " + DOG_SWIM_METERS + ", результат:" + (meters <= DOG_SWIM_METERS));
  }

  @Override
  public void jump(double height) {
    //System.out.println(height <= DOG_JUMP_METERS);
    System.out.println("Прыжок на " + height + ", ограничение: " + DOG_JUMP_METERS + ", результат:" + (height <= DOG_JUMP_METERS));
  }

  @Override
  public void run(int meters) {
    //System.out.println(meters <= DOG_RUN_METERS);
    System.out.println("Бег на " + meters + " метров, ограничение: " + maxMeters + ", результат:" + (meters <= maxMeters));
  }

}
