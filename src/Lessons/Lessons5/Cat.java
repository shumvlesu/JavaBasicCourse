package Lessons.Lessons5;

import java.util.Locale;

public class Cat {

  String name;
  String color;
  int age;

  //конструктор класса Cat
  //можно создать из шаблона используя горячие клавиши Alt+Ins
  public Cat(String name, String color, int age){
      this.name = name != null ? name.toUpperCase() : null;
      this.color = color != null ? color.toUpperCase() : null;
      this.age = age;

    System.out.println("Я родился! Меня зовут "+this.name);
  }

  public Cat(String name) {
    //что бы не писать заново поле можно использовать верхний конструктор  используя this()
    //this.name = name;
    //ссылаемся на верхний конструктор
    this(name,null,0);
  }

  //метод класса Cat
  void printInfo(){
    System.out.println(this); // при выводе this , неявно переводится методом toString в строку. А так как ниже мы сделали (переопределили) свой метод toString то выполняться будет он.
  }

  //переопределяем метод класса toString
  public String toString(){
    return String.format("Котик %s имеет цвет %s и возраст %d", name,color,age);
  }

}
