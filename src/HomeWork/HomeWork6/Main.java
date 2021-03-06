package HomeWork.HomeWork6;

public class Main {
  public static void main(String[] args) {

    //1. Создать классы Собака и Кот с наследованием от класса Животное.
    Animal cat = new Cat("Васька");
    Dog dog = new Dog("Шарик");

    Animal[] animals = {dog, cat, new Cat(), new Dog()};
    for (Animal animal : animals) {
      System.out.println(animal.toString());
      animal.jump(20);
      animal.run(300);
      // лучше проверять на интерфейс плавающих чем на конкретный класс. Вдруг класс рыбу добавим.
      if (animal instanceof Swiming) {
        ((Swiming) animal).swim(2);
      }
    }

  }
}
