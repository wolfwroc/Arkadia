package SDAHomework.Weekend3;

import java.util.Random;

public class homework1 {
    public static void main(String[] args) {
        Random rand = new Random();
        int kule = 20;
        int urny = 10;

        int urnyArray[] = new int[urny];
        int los = 0;
        for (int i = 0; i < kule; i++) {
            los = rand.nextInt(10);
            urnyArray[los]++;
        }
        for (int i = 0; i < kule; i++) {
            System.out.printf("do %d urny wpadla %d " +
            "co daje %f %% wszystkich kul\n",
                    i+1, urnyArray[i],
                    (float)urnyArray[i]*100 / kule);
        }
    }
}
