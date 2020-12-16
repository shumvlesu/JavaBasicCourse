package Lessons.Lesson6;

public abstract class Animal extends Object implements Runner {  //Object общий родитель для все классов , нулевой так сказать класс(объект).
    //интерфейс можно имплементировать не только классам но и абстрактным классам
    //в таком случае всем подклассам также придется переопределить абстрактные методы интерфейса
    //(у интерфейсов методы абстрактные всегда, а поля всегда константы)
    // в этом абстрактном классе переопределять абстрактный метод интерфейса смысла нет.
    protected String name;
    private String color;
    protected int age;

    public Animal(String name, String color, int age) {
        this.name = name;
        this.color = color;
        this.age = age;
    }

    public Animal(String name) {
        this(name, "Серобуромалиновый", 0);
    }

    //public Animal() {
    //  this(null);
    //}

    @Override
    public String toString() {
        return "{" +
                "name='" + name + '\'' +
                ", color='" + color + '\'' +
                ", age=" + age +
                '}';
    }

    //абстрактный метод должен быть переопределен в дочерних классах
    //иначе в них будет ошибка от иде
    public abstract void voice();

    public void printInfo() {
        System.out.println(this);
    }
}
