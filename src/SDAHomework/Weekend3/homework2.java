package SDAHomework.Weekend3;

import java.util.Scanner;

public class homework2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Podaj liczbe prob");
        int tests = sc.nextInt();

        int userchoise = 0;
        int sum = 0;
        for (int i = 0; i < tests; i++) {
        userchoise = sc.nextInt();
        sum += userchoise;
        }
        System.out.printf("Uzytkownik ppodal %d liczb;\n" + "Suma tych liczb: %d\n" + "Srednia tych liczb wynosi %f\n", tests, sum, (float)sum/tests);
    }
}
