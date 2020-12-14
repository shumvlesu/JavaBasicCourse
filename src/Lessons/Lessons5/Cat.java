package Lessons.Lessons5;

import java.util.Locale;

public class Cat {

  protected String name;
  protected String color;
  private int age;
  //Статитическая переменная которая действует для самого класса но не для экземпляров класса.
  private static int catCount;

  //конструктор класса Cat
  //можно создать из шаблона используя горячие клавиши Alt+Ins
  public Cat(String name, String color, int age){
      this.name = name != null ? name.toUpperCase() : null;
      this.color = color != null ? color.toUpperCase() : null;
      this.age = age;
      catCount++;

    System.out.println("Я родился! Меня зовут "+this.name+". А всего котов "+catCount);
  }

  public Cat(String name) {
    //что бы не писать заново поле можно использовать верхний конструктор  используя this()
    //this.name = name;
    //ссылаемся на верхний конструктор
    this(name,null,0);
  }

  //из статических методов мы не видим поля и методы экземпляров класса
  //а из  нестатических методов и полей (элементов класса) мы можем видеть статические методы и поля.
  public static int getCatCount() {
    return catCount;
  }

  //метод класса Cat
  void printInfo(){
    System.out.println(this); // при выводе this , неявно переводится методом toString в строку. А так как ниже мы сделали (переопределили) свой метод toString то выполняться будет он.
  }

  //переопределяем метод класса toString
  public String toString(){
    return String.format("Котик %s имеет цвет %s и возраст %d", name,color,age);
  }

  public int getAge() {
    return age;
  }

  public void setAge(int age) {
    if (age>=0 && age<30) {
      this.age = age;
    }
    else {
    System.err.println("Неверный возраст");
    }
  }

  //отрабатывает когда уничтожается значение экземпляра объекта в памяти (куче)
  @Override
  protected void finalize() throws Throwable {
    //super.finalize();
    catCount--;
    System.out.println("Один котик - "+name+" сбежал, теперь их:"+catCount);

  }
}
