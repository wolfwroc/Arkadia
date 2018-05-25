package SDAHomework.Refleksja.Kolekcje;

import java.util.ArrayDeque;
import java.util.Queue;

public class QueueDemo {
    public static void main(String[] args) {
        String name1 = "Adam";
        String name2 = "Marzena";
        String name3 = "Julian";
        String name4 = "Kunegunda";
        String name5 = "Pawel";


        Queue<String> kolejka = new ArrayDeque<>(); kolejka.add(name1);
        kolejka.add(name2);
        kolejka.add(name3);

        System.out.println(kolejka);
    }

}
