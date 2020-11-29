package Lessons;

import java.util.Arrays;

public class Lesson2 {

    public static void main(String[] args) {
        System.out.println(convertSeasonBySwitch(2));

        int i = 0;
        for (; i<15; i++){
            System.out.println(i);
        }
        System.out.println("Последнее значение i было - "+i);

        final int SIZE = 5;
        int[] data = new int[SIZE];
        Arrays.fill(data,2);
        System.out.println(Arrays.toString(data));

        data[0] =20;
        data[1] =18;
        data[2] =25;
        data[3] =45;
        data[4] =2;

        Arrays.sort(data);
        for (int j = 0; j < data.length; j++) {
            System.out.print(data[j]+" ");
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
