package SDAHomework.Weekend3;

import java.util.Scanner;

public class homework3 {
    public static void main(String[] args) {
        int tests = 10;
        Scanner sc = new Scanner(System.in);
        double array[] = new double[tests];

        for (int i = 0; i < tests; i++) {
            array[i] = sc.nextDouble();
        }

        for (int i = tests-1; i >= 0; i--) {
            System.out.println(array[i]);
        }

        System.out.println();

        for (int i = 0; i < array.length ; i++) {
            System.out.println(Math.pow(array[i], 2.0));
        }
    }
}
