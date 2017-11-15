package University.labs.laba2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class OnlyMain {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Create the mass");
        System.out.print("Enter the count of rows ");
        int n = Integer.parseInt(reader.readLine());
        System.out.print("Enter the count of columns ");
        int m = Integer.parseInt(reader.readLine());
        int[][] masiv = new int[n][m];

        int a=0;
        int b=10;

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                masiv[i][j] = a + (int) (Math.random() * b);
            }
        }

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                System.out.println("[" + i + "][" + j + "]=" + masiv[i][j] + ",");
            }
        }

        int maximum = masiv[0][0];
        int minimum = masiv[0][0];

        String indexMin="";
        String indexMax="";
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (masiv[i][j] > maximum) {
                    maximum = masiv[i][j];
                    indexMax = "["+i+"]["+j+"] = ";
                }
                if (masiv[i][j] < minimum) {
                    minimum = masiv[i][j];
                    indexMin = "["+i+"]["+j+"] = ";
                }
            }
        }
        System.out.println("max = " + indexMax + maximum + ", min = " + indexMin + minimum);
    }
}
