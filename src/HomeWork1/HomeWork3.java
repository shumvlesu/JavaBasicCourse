package HomeWork1;

import java.util.Scanner;

public class HomeWork3 {

    final static int COUNT_OF_ATTEMPTS = 3;
    final static int SIZE = 10;
    static Scanner in = new Scanner(System.in);

    public static void main(String[] args) {

        //1. Написать программу, которая загадывает случайное число от 0 до 9,
        // и пользователю дается 3 попытки угадать это число.
        // При каждой попытке компьютер должен сообщить больше ли указанное пользователем число чем загаданное,
        // или меньше. После победы или проигрыша выводится запрос –
        // «Повторить игру еще раз? 1 – да / 0 – нет»(1 – повторить, 0 – нет).
        gameRandomNumber();

        //2 * Создать массив из слов String[] words = {"apple", "orange", "lemon", "banana", "apricot", "avocado", "broccoli", "carrot", "cherry", "garlic", "grape", "melon", "leak", "kiwi", "mango", "mushroom", "nut", "olive", "pea", "peanut", "pear", "pepper", "pineapple", "pumpkin", "potato"};
        //При запуске программы компьютер загадывает слово, запрашивает ответ у пользователя,
        //сравнивает его с загаданным словом и сообщает правильно ли ответил пользователь. Если слово не угадано, компьютер показывает буквы которые стоят на своих местах.
        //apple – загаданное
        //apricot - ответ игрока
        //ap############# (15 символов, чтобы пользователь не мог узнать длину слова)
        //Для сравнения двух слов посимвольно, можно пользоваться:
        //String str = "apple";
        //str.charAt(0); - метод, вернет char, который стоит в слове str на первой позиции
        //Играем до тех пор, пока игрок не отгадает слово
        //Используем только маленькие буквы


    }

    private static void gameRandomNumber() {
        while(true){
           startGame(createHiddenNumber());
           endGameQuestion();
        }
    }

    //генерируем число от 0 до 9
    private static int createHiddenNumber() {
        return (int) (Math.random()*SIZE);
    }

    private static void startGame(int hiddenNumber) {
        System.out.println("Давайте начнем игру!");
        int b = 0;
        for (int i = 0; i < COUNT_OF_ATTEMPTS; i++) {
            System.out.println("\nВведите число от 0 до 9:");
            if (in.hasNextInt()) {
                b = in.nextInt();
                if (b == hiddenNumber) {
                    System.out.println("\nВы выиграли! Это действительно - "+hiddenNumber);
                    return;
                }else if (b >= SIZE) {
                    System.out.printf("\nЭй, это число должно быть больше 0 и меньше %d!",SIZE);
                }else{
                    System.out.printf("\nВаше число %s", b > hiddenNumber ? "больше":"меньше");
                }
            }else {
                System.out.println("\nЭто должно быть число!");
                in.next();
            }
        }
        System.out.println("\nВы проиграли! :( это была цифра -"+hiddenNumber);
    }

    private static void endGameQuestion() {
        System.out.println("\n«Повторить игру еще раз? 1 – да / 0 – нет»(1 – повторить, 0 – нет).");
        switch (in.next()) {
            case "0","n", "no", "Нет", "нет", "НЕТ", "-" -> System.exit(0);
        }

    }

}
