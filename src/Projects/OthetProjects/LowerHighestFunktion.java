package Projects.OthetProjects;

import java.util.Scanner;

public class LowerHighestFunktion {
    public static int highestNumber(int a, int b, int c) {
        if (a >= b) {
            if (a >= c) return a;
            else return c;
        }
        else {
            if (b >= c) return b;
            else return c;
        }
    }

    public static int lowestNumber(int a, int b, int c) {
        if (a <= b) {
            if (a <= c) return a;
            else return c;
        }
        else {
            if (b <= c) return b;
            else return c;
        }
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int a, b, c;

        System.out.println("Provide 3 numbers: ");
        a = scan.nextInt();
        b = scan.nextInt();
        c = scan.nextInt();

        System.out.printf("the smallest: %d; the biggest: %d\n",
                lowestNumber(a, b, c), highestNumber(a, b, c));
        scan.close();
    }
}
