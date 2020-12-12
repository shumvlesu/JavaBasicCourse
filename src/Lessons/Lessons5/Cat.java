package Lessons.Lessons5;

public class Cat {

  String name;
  String color;
  int age;

  //конструктор класса Cat
  //можно создать из шаблона используя горячие клавиши Alt+Ins
  public Cat(String name, String color, int age){
      this.name = name;
      this.color = color;
      this.age = age;

    System.out.println("Я родился!");
  }

  public Cat(String name) {
    //что бы не писать заново поле можно использовать верхний конструктор  используя this()
    //this.name = name;
    //ссылаемся на верхний конструктор
    this(name,null,0);
  }
}
