package Lessons.Lesson6;

public class Duck extends Animal implements Flying,Runner{
    public Duck(String name, String color, int age) {
        super(name, color, age);
    }

    public Duck(String name) {
        super(name);
    }

    //переопределение этого метода обязательна так как в анимал он абстрактный
    @Override
    public void voice() {
        System.out.println("Кря кря!");
    }

    public void fly(){
        System.out.println("Я могу летать!");
    }

    @Override
    public void run() {

    }
}
