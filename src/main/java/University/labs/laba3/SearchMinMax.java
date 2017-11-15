package University.labs.laba3;

import java.util.Arrays;
import java.util.OptionalInt;
//import java.util.OptionalInt;

public class SearchMinMax {
    private int numberRows;
    private int numberColumns;
    private int massiv[][] = new int[999][999];

    public void setNumberRows(int numberRows) {
        this.numberRows = numberRows;
    }
    public void setNumberColumns(int numberColumns) {
        this.numberColumns = numberColumns;
    }
    public void setMassiv(int[][] massiv) {
        this.massiv = massiv;
    }

   public int getMin() {
       int minimum = massiv[0][0];

       for (int i = 0; i < numberRows; i++) {
           for (int j = 0; j < numberColumns; j++) {
               if (massiv[i][j] < minimum) {
                   minimum = massiv[i][j];
               }
           }
       }
       return minimum;
   }
   public int getMax() {
       int maximum = massiv[0][0];

       for (int i = 0; i < numberRows; i++) {
           for (int j = 0; j < numberColumns; j++) {
               if (massiv[i][j] > maximum) {
                   maximum = massiv[i][j];
               }
           }
       }
       return maximum;
   }
//   public OptionalInt getMaxWithApi() {
//       int[] newArr = Arrays.stream(massiv)
//               .flatMapToInt(Arrays::stream) //преобразовываем IntStream<int[]> в IntStream
//               .toArray(); // преобразовываем IntStream в int[]
//       //System.out.println("Massiv : "+Arrays.toString(newArr));
//       OptionalInt max = Arrays.stream(newArr).max();
//       //System.out.println("Max = "+max.getAsInt());
//       return max;
//    }
//    public OptionalInt getMinWithApi() {
//        int[] newArr = Arrays.stream(massiv)
//                .flatMapToInt(Arrays::stream) //преобразовываем IntStream<int[]> в IntStream
//                .toArray(); // преобразовываем IntStream в int[]
//        //System.out.println("Massiv : "+Arrays.toString(newArr));
//        OptionalInt min = Arrays.stream(newArr).min();
//        return min;
//       // System.out.println("Min = "+min.getAsInt());
//    }
}
