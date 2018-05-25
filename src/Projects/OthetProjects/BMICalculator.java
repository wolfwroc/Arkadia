package Projects.OthetProjects;

import java.util.Scanner;

public class BMICalculator {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("please provide how tall you are");
        double userHeight = scan.nextDouble();
        scan.nextLine();

        System.out.println("please provide how many KG you have");
        double userWeight = scan.nextDouble();
        scan.nextLine();

        double userBMI = userWeight/Math.pow(userHeight, 2);
        System.out.printf("Your BMI is %.2f, ", userBMI);
        if (userBMI > 24.9) System.out.printf("overweight.\n");
        else if (userBMI < 18.5) System.out.printf("underweight.\n");
        else System.out.printf("your weight is OK.\n");

        scan.close();
    }
}
