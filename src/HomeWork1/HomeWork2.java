package HomeWork1;

import java.util.Arrays;

public class HomeWork2 {

    public static void main(String[] args) {

        //1. Задать целочисленный массив, состоящий из элементов 0 и 1. Например: [ 1, 1, 0, 0, 1, 0, 1, 1, 0, 0 ].
        // С помощью цикла и условия заменить 0 на 1, 1 на 0;
        int[] myArray = {1, 1, 0, 0, 1, 0, 1, 1, 0, 0};
        //не стал делать 2й цикл для вывода, и так понятно что массив изменился.
        for (int i = 0; i < myArray.length; i++) {
            myArray[i] = myArray[i] == 0 ? 1 : 0;
            System.out.printf("%d ", myArray[i]);
        }


        //2. Задать пустой целочисленный массив размером 8.
        //С помощью цикла заполнить его значениями 0 3 6 9 12 15 18 21;
        System.out.println();
        int[] myArray2 = new int[8];
        int a = 0;
        for (int i = 0; i < myArray2.length; i++) {
            myArray2[i] = i == 0 ? i : myArray2[i-1] + 3;
            System.out.printf("%d ",myArray2[i]);
        }


        //3. Задать массив [ 1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1 ] пройти по нему циклом, и числа меньшие 6 умножить на 2;
        System.out.println();
        int[] myArray3 = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1 };
        final int MY_CONST = 6;
        for (int i = 0; i < myArray3.length; i++) {
            myArray3[i] = myArray3[i] < MY_CONST ? myArray3[i] * MY_CONST: myArray3[i];
            System.out.printf("%d ", myArray3[i]);
        }

        //4. Создать квадратный двумерный целочисленный массив (количество строк и столбцов одинаковое),
        // и с помощью цикла(-ов) заполнить его диагональные элементы единицами;
        System.out.println();
        int[][] myArray4 = new int[6][6];
        for (int i = 0; i < myArray4.length; i++) {
            for (int j = 0; j < myArray4[i].length; j++) {
                System.out.printf("%2d ", myArray4[i][j]);
            }
            System.out.println();
        }

    }

}
