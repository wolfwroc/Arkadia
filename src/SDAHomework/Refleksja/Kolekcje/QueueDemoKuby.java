package SDAHomework.Refleksja.Kolekcje;

import java.util.ArrayDeque;

public class QueueDemoKuby {
    public static void main(String[] args) {
        ArrayDeque<String> kolejka = new ArrayDeque<>();
        kolejka.add("Anna");
        kolejka.add("Jozef");
        kolejka.add("Genowefa");

        for (int i = 0; i < 3 ; i++) {
            System.out.println(kolejka);
        }

    }

}
