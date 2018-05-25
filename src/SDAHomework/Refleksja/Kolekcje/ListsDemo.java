package SDAHomework.Refleksja.Kolekcje;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Arrays;

public class ListsDemo {
    public static void main(String[] args) {
        int[] tab1 = new int[10];
        for (int i = 0; i < tab1.length; i++) {
            tab1[i] = i;
        }

        Integer[] tab2 = new Integer[10];
        for (int i = 0; i < tab2.length; i++) {
            tab2[i] = i;
        }

        List arraylist1 = Arrays.asList(tab1);
        List arraylist2 = Arrays.asList(tab2);
        System.out.println();

// zad2

List copy = new ArrayList(arraylist2);

// zad3

        Collections.reverse(copy);

        //zad4

        arraylist2.addAll(copy);
    }
}
