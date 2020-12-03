package HomeWork1;

public class HomeWork2 {

    public static void main(String[] args) {

        //1. Задать целочисленный массив, состоящий из элементов 0 и 1. Например: [ 1, 1, 0, 0, 1, 0, 1, 1, 0, 0 ].
        // С помощью цикла и условия заменить 0 на 1, 1 на 0;
        System.out.println("1. Задать целочисленный массив, состоящий из элементов 0 и 1. Например: [ 1, 1, 0, 0, 1, 0, 1, 1, 0, 0 ].\n" +
                "С помощью цикла и условия заменить 0 на 1, 1 на 0;");
        int[] myArray = {1, 1, 0, 0, 1, 0, 1, 1, 0, 0};
        //не стал делать 2й цикл для вывода, и так понятно что массив изменился.
        for (int i = 0; i < myArray.length; i++) {
            myArray[i] = myArray[i] == 0 ? 1 : 0;
            System.out.printf("%d ", myArray[i]);
        }
        System.out.println();


        //2. Задать пустой целочисленный массив размером 8.
        //С помощью цикла заполнить его значениями 0 3 6 9 12 15 18 21;
        System.out.println("2. Задать пустой целочисленный массив размером 8.\n" +
                "С помощью цикла заполнить его значениями 0 3 6 9 12 15 18 21;");
        int[] myArray2 = new int[8];
        for (int i = 0; i < myArray2.length; i++) {
            myArray2[i] = i == 0 ? i : myArray2[i - 1] + 3;
            System.out.printf("%d ", myArray2[i]);
        }
        System.out.println();


        //3. Задать массив [ 1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1 ] пройти по нему циклом, и числа меньшие 6 умножить на 2;
        System.out.println("3. Задать массив [ 1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1 ] пройти по нему циклом, и числа меньшие 6 умножить на 2");
        int[] myArray3 = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        final int MY_CONST = 6;
        for (int i = 0; i < myArray3.length; i++) {
            myArray3[i] = myArray3[i] < MY_CONST ? myArray3[i] * MY_CONST : myArray3[i];
            System.out.printf("%d ", myArray3[i]);
        }
        System.out.println();

        //4. Создать квадратный двумерный целочисленный массив (количество строк и столбцов одинаковое),
        // и с помощью цикла(-ов) заполнить его диагональные элементы единицами;
        System.out.println("4. Создать квадратный двумерный целочисленный массив (количество строк и столбцов одинаковое),\n" +
                " и с помощью цикла(-ов) заполнить его диагональные элементы единицами;");
        int[][] myArray4 = new int[7][7];
        for (int i = 0; i < myArray4.length; i++) {
            // for (int j = 0; j < myArray4[i].length; j++) {
            for (int j = 0, x = myArray4[i].length - 1; j < myArray4[i].length; j++, x--) {
                //i и x идут друг к другу "навстречу". i сверху право вниз. x слева влево вниз.
                if (i == j || i == x) myArray4[i][j] = 1;
                System.out.printf("%2d ", myArray4[i][j]);
            }
            System.out.println();
        }


        //5. ** Задать одномерный массив и найти в нем минимальный и максимальный элементы (без помощи интернета);
        System.out.println("5. ** Задать одномерный массив и найти в нем минимальный и максимальный элементы (без помощи интернета);");
        //int[] myArray5 = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1 };
        int[] myArray5 = {-2, 5, -3, 2, 11, 4, 5, 2, 4, 8, 9, -1};
        int min = myArray5[0];
        int max = myArray5[0];
        for (int j : myArray5) {
            if (j < min) min = j;
            if (max < j) max = j;
        }
        System.out.printf("Минимум: %d, Максимум: %d.", min, max);

        //6. ** Написать метод, в который передается не пустой одномерный целочисленный массив, метод должен вернуть true,
        // если в массиве есть место, в котором сумма левой и правой части массива равны.
        // Примеры: checkBalance([2, 2, 2, 1, 2, 2, || 10, 1]) → true, checkBalance([1, 1, 1, || 2, 1]) → true,
        // граница показана символами ||, эти символы в массив не входят.
        System.out.println();
        System.out.println("6. ** Написать метод, в который передается не пустой одномерный целочисленный массив, метод должен вернуть true,\n" +
                " если в массиве есть место, в котором сумма левой и правой части массива равны.\n" +
                " Примеры: checkBalance([2, 2, 2, 1, 2, 2, || 10, 1]) → true, checkBalance([1, 1, 1, || 2, 1]) → true,\n" +
                " граница показана символами ||, эти символы в массив не входят.");
        int[] myArray6 =  {2, 2, 2, 1, 2, 2, 10, 1};
        System.out.println(checkBalance(myArray6));
    }


    public static boolean checkBalance(int[] myArray6) {
        for (int i = 0; i < myArray6.length + 1; i++) {
            int sum1 = 0;
            int sum2 = 0;
            for (int j = 0; j < i; j++) {
                sum1 += myArray6[j];
            }
            for (int j = i; j < myArray6.length; j++) {
                sum2 += myArray6[j];
            }
            if (sum1 == sum2) return true;
        }
        return false;
    }

}


