package HomeWork1.HomeWork6;

public class Cat extends Animal {

  //Будем считать что это максимальный предел для всех кошек
  final static int CAT_JUMP_METERS = 2;
  //final static int CAT_RUN_METERS = 200;
  protected int maxMeters;

  public Cat(String name) {
    super(name);
    //* Добавить животным разброс в ограничениях. То есть у одной собаки ограничение на бег может быть 400 м., у другой 600 м.
    this.maxMeters = (int) (Math.random()*100)+100; //от 100 до 200 метров
  }

  public Cat() {
    this("Безымянная кошка");
  }

  @Override
  public String toString() {
    return super.toString()+" {" +
            "Максимольно может пройти ='" + maxMeters +" метра(ов)"+ '\'' +
            '}';
  }


  @Override
  public void jump(double height) {
    //System.out.println(height <= CAT_JUMP_METERS);
    System.out.println("Прыжок на "+height+", ограничение: "+CAT_JUMP_METERS+", результат:"+(height <= CAT_JUMP_METERS));
  }

  @Override
  public void run(int meters) {
    //System.out.println(meters <= CAT_RUN_METERS);
    System.out.println("Бег на "+meters+" метров, ограничение: "+maxMeters+", результат:"+(meters <= maxMeters));
  }
}
