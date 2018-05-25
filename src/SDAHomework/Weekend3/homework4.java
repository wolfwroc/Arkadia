package SDAHomework.Weekend3;

import java.util.Random;

public class homework4 {
    public static void main(String[] args) {
        //tworzenie tablicy i wypelnianie losowymi wartosciami
        int array[] = new int[10];
        Random rand = new Random();

        for (int i = 0; i < array.length; i++) {
            array[i] = rand.nextInt(200);
        }
        //wypisujemy zawartosc tablicy
        for (int i = 0; i < array.length; i++) {
            System.out.printf("%d\t", array[i]);;
        }
        System.out.println();

        //Szukamy max i min

        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        for (int i = 0; i < array.length; i++) {
            //max
            if (array[i] > max){
                max = array [i];
            }
            //min
            if (array[i] < min) {
                min = array[i];
            }
        }
        System.out.println("Max " + max + " Min " + min);

        // Srednia
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            sum += array[i];
        }
double average = sum / 10.0;
        System.out.println("Srednia wynosi " + average);

// ile jest mniejszych i wiekszych od sredniej
        int aboveaverage = 0;
        int belowaverage = 0;

        for (int i = 0; i < array.length; i++) {
            if (array[i] > average)
            aboveaverage++;
            else
            belowaverage++;
        }
            System.out.println("Ponad srednia: " + aboveaverage + "Ponizej sredniej: " + belowaverage);

    //odwrotna kolejnosc
        for (int i = array.length-1; i >=0; i--) {
            System.out.printf("%d\t", array[i]);

        }
        }
    }


