package Lessons;

import java.util.Arrays;

public class Lesson2 {

    public static void main(String[] args) {
        //использование switch
        System.out.println(convertSeasonBySwitch(2));

        //цикл for
       /* int i = 0;
        for (; i<15; i++){
            System.out.println(i);
        }
        System.out.println("Последнее значение i было - "+i);*/

        //массивы
        final int SIZE = 5;
        double[] data = new double[SIZE];
        Arrays.fill(data,2);
        System.out.println(Arrays.toString(data));

        data[0] =20.5856165465;
        data[1] =18;
        data[2] =25.4254525;
        data[3] =45;
        data[4] =2;

        Arrays.sort(data);
        for (int j = 0; j < data.length; j++) {
            //System.out.print(data[j]+" ");
            System.out.printf("Index № %d %.2f %n", j, data[j]);
            // В %d - подставляется значение а %n - делает перенос строки
            // %.2f - означает что выводятся дробные числа , но только с 2 знаками после запятой, причем число будет округлено по математическим правилам.
        }


        //Двумерные массивы
        System.out.println();
        System.out.println("Двумерные массивы");
        System.out.println();
        int[][] deepData = new int[7][7];
        int n = 0;
        for (int i = 0; i < deepData.length; i++) {
            for (int j = 0; j < deepData[i].length; j++) {
                deepData[i][j] = ++n;
            }
        }

        //Выводим массив. 1 способ
        for (int i = 0; i < deepData.length; i++) {
            for (int j = 0; j < deepData[i].length; j++) {
                System.out.printf("%2d ", deepData[i][j]); //Чтобы ячейки не разъезжались при выводе массива %2d выделяем 2 ячейки под вывод в консоли
            }
            System.out.println();
        }
        System.out.println();
        System.out.println("Второй способ вывода");
        System.out.println();

        //Аналог вывода массива  2 способ
        //Чтобы вывел такой массив написать - iter
        //Можем только читать таким массивом
        for (int[] deepDatum : deepData) {
            for (int item : deepDatum) {
                System.out.printf("%2d ", item);
            }
            System.out.println();
        }


        for (int i = 0; i < 5000; i++) {
            System.out.printf("%d: %c ",i,i);
            if (i%15 == 0) {
                System.out.println();
            }
        }


    }

   public static String convertSeasonBySwitch(int seasonNumber){
       return switch (seasonNumber){
           case 1 -> "Winter";
           case 2 -> "Spring";
           case 3 -> "Summer";
           case 4 -> "Fall";
           default -> "Unknown season";
       };
   }
//Чтобы редактировать несколько строк можно нажать Alt+Shift




}
