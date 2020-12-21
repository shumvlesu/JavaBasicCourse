package Lessons.Lesson7.oop;

import HomeWork.HomeWork6.Animal;

public class Test {

  public static void main(String[] args) {

    //1. Расширить задачу про котов и тарелки с едой
    //+ 2. Сделать так, чтобы в тарелке с едой не могло получиться отрицательного количества еды (например, в миске 10 еды, а кот пытается покушать 15-20)
    //+ 3. Каждому коту нужно добавить поле сытость (когда создаем котов, они голодны). Если коту удалось покушать (хватило еды), сытость = true
    //+ 4. Считаем, что если коту мало еды в тарелке, то он ее просто не трогает, то есть не может быть наполовину сыт (это сделано для упрощения логики программы)

    //+5. Создать массив котов и тарелку с едой, попросить всех котов покушать из этой тарелки и потом вывести информацию о сытости котов в консоль
    Cat[] cats = {new Cat("Мартин"),new Cat("Кузя"), new Cat("Бусинка"), new Cat("Зюксель"), new Cat("Васька")};
    Plate plate = new Plate();
    //+6. Добавить в тарелку метод, с помощью которого можно было бы добавлять еду в тарелку
    plate.addFoot(20);
    System.out.println("Начальное состояние тарелки");
    plate.printInfo();
    System.out.println();
    for (Cat cat : cats){
      cat.eat(plate);
      cat.printInfo();
      plate.printInfo();
      System.out.println();
    }

    /*Cat cat = new Cat("Мартин");
    Plate plate = new Plate();

    plate.addFoot(10);
    cat.eat(plate);
    plate.printInfo();
    cat.printInfo();*/
  }

}
