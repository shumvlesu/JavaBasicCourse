package HomeWork1.HomeWork5;

public class Main {

  public static void main(String[] args) {
    //* Создать массив из 5 сотрудников
    //Пример:
    //Person[] persArray = new Person[5]; // Вначале объявляем массив объектов
    //persArray[0] = new Person("Ivanov Ivan", "Engineer", "ivivan@mailbox.com", "892312312", 30000, 30); // потом для каждой ячейки массива задаем объект
    //persArray[1] = new Person(...);
    //...
    //persArray[4] = new Person(...);
    //
    Person[] persArray = new Person[5];
    persArray[0] = new Person("Иванов Иван Иванович", "Инженер", "ivivan@mailbox.com", "892312312", 30000, 30);
    persArray[1] = new Person("Петров Петр Петрович", "Сантехник", "ivivan@mailbox.com", "891845524", 20000, 34);
    persArray[2] = new Person("Попкова Аида Вячеславовна", "Клинниг мастер", "ivivan@mailbox.com", "8928555666", 0, 42);
    persArray[3] = new Person("Супрунов Валерий Николаевич", "Разнорабочий", "ааа@mail.com", "891855512", 25000, 52);
    persArray[4] = new Person("Соломахина Татьяна Михайловна", "Повар", "ivivan@mailbox.com", "888812312", 60000, 30);

    //* С помощью цикла вывести информацию только о сотрудниках старше 40 лет;
    for (int i = 0; i < persArray.length; i++) {
      if (persArray[i].getAge()>=40){
        System.out.println(persArray[i].toString());
      }
    }



  }

}
