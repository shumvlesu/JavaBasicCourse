package HomeWork1.HomeWork5;

public class Person {


  //* Создать класс "Сотрудник" с полями: ФИО, должность, email, телефон, зарплата, возраст;
  protected String FIO;
  protected String position;
  protected String email;
  protected String tel;
  private int salary;
  private int age;
  protected final int MINIMAL_SALARY = 12130; //минималка в краснодарском крае :)

  //* Конструктор класса должен заполнять эти поля при создании объекта;
  public Person(String FIO,
                String position,
                String email,
                String tel,
                int salary,
                int age){

    this.FIO = FIO;
    this.position = position;
    this.email = email;
    this.tel = tel;
    setSalary(salary);
    setAge(age);
  }

  public Person(String FIO){
    this(FIO,"","","",0 ,0);
  }

  //* Внутри класса «Сотрудник» написать метод, который выводит информацию об объекте в консоль;
  @Override
  public String toString(){
    return String.format("Это %s, должность %s, с зарплатой: %d, email-%s,  возраст %d. Телефон:%s", FIO, position, getSalary(), email, getAge(),tel);
  }

  public int getSalary() {
    if (salary == 0) {
      return MINIMAL_SALARY;
    }else {
      return salary;
    }
  }

  public void setSalary(int salary) {
    if(salary>0) {
      this.salary = salary;
    }else if (salary==0){
      this.salary = MINIMAL_SALARY;
    } else {
      System.err.println("Нельзя у человека брать деньги за работу!");
    }
  }

  public int getAge() {
    return age;
  }

  public void setAge(int age) {
    if(age>=0) {
      this.age = age;
    }else {
      System.err.println("Не может быть отрицательного возраста.");
    }
  }
}
