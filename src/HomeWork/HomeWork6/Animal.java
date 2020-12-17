package HomeWork.HomeWork6;

public abstract class Animal implements Runing, Jumping {

  protected String name;

  public Animal(String name) {
    this.name = name;
  }

  @Override
  public String toString() {
    return "{" +
            "name='" + name + '\'' +
            '}';
  }

  //Я не стал задавать методы run и jump как абстрактные, так как рыба например только плавает
  // , и уж точно не бегает и не прыгает и в случае добавления класса рыба это будет логически неправильно

}