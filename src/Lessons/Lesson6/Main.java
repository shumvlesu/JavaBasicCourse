package Lessons.Lesson6;

public class Main {

  //В версии ultimate есть возможность рисовать диаграммы классов и подклассов при помощи расширения plantUML
  //Ctrl+O позволяет иде в подклассе сразу переопределить метод супер класса.
  public static void main(String[] args) {
    Cat cat = new Cat("Мартин");
    System.out.println(cat.toString());
    Dog dog = new Dog("Гендальф", "Серый", 10, true);
    System.out.println(dog.toString());
    Duck duck = new Duck("Дональд");
    System.out.println(duck.toString());

    sayWord(duck);
    sayWord(dog);
    sayWord(cat);

    Animal[] animals = {duck,dog,cat};
    for (Animal animal : animals) {
      sayWord(animal);
      animal.printInfo();
      if (animal instanceof Duck) { //Летать может только утка т.к.только она имеет такой метод
        //при помощи опертора сравнения типов instanceof проверяем что animal имеет тип подкласа Duck
        ((Duck) animal).fly();
      }

      if (animal instanceof Flying) { //можно проверять не только на подкласс но и на интерфейс который и отвечает за метод fly
        //просто здесь проверяется не подкласс с наличием метода fly а любой подкласс имеющий импелементацию интерфейса Flying
        ((Flying) animal).fly();
      }

    }


  }

  public static void sayWord(Animal animal){// не смотря на то что Animal абстрактный клас мы можем передать в качестве параметра
    //любой экземпляр класса у которого родительский класс Animal
    animal.voice();
  }

}
