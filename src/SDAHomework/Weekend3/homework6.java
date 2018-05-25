package SDAHomework.Weekend3;

import java.util.Scanner;

public class homework6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
    }
    public static int maxValue(int x,int y, int z){
        if((x > y) && (x>z))
            return x;
        else if ((y>x) && (y > z)){
            return y;
        }
        else{
            return z;
        }
    }

}
