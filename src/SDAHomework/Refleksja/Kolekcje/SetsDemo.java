package SDAHomework.Refleksja.Kolekcje;

import java.util.SortedSet;
import java.util.TreeSet;

public class SetsDemo {
    public static void main(String[] args) {
        //Nowak
        //Kowalski
        //Wisniewski
        //Wojcik
        //Kowalczyk

        TreeSet<String> zbior = new TreeSet<>();
        zbior.add("Nowak");
        zbior.add("Kowalski");
        zbior.add("Wisniewski");
        zbior.add("Wojcik");
        zbior.add("Kowalczyk");

//        for (String s : zbior){
//            System.out.println(s);
//        }

        // zad2
//
//        TreeSet<String> zbior2 = new TreeSet<>();
//
//        zbior2.add("Kowalski");
//        zbior2.add("Kowalczyk");
//
//        TreeSet<String> zbiorKopia = new TreeSet<>(zbior);
//        zbior.retainAll(zbior2);
//
//        for (String s: zbiorKopia
//             ) {
//            System.out.println();
//        }

        // zad3

        TreeSet<Integer> zbiorInt = new TreeSet<>();
        zbiorInt.add(1);
        zbiorInt.add(2);
        zbiorInt.add(3);
        zbiorInt.add(5);

        if (zbiorInt.contains(new Integer(4))){
            System.out.println(4);
        }
else {
            SortedSet<Integer> poddrzewo = zbiorInt.
                    tailSet(new Integer(4));
            System.out.println(poddrzewo.first());
        }
    }
}
