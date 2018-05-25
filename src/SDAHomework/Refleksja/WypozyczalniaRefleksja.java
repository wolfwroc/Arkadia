package SDAHomework.Refleksja;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class WypozyczalniaRefleksja {
    public static void main(String[] args) throws NoSuchMethodException, IllegalAccessException, InvocationTargetException, InstantiationException, NoSuchFieldException {
        Class rental = RentCar.class;
        System.out.println("Pelna nazwa klasy: " + rental.getName());
        System.out.println("Sama nazwa klasy: " + rental.getSimpleName());
        System.out.println("Nazwa klasy canonical: " + rental.getCanonicalName());
        Package paczka = rental.getPackage();
        System.out.println("Nazwa paczki: " + paczka);

        //Tworzenie obiektu z wykorzystaniem konstruktorów

        // krok1 pobranie konstruktorow
        Constructor[] constructors = rental.getConstructors();

        //krok2 pobranie i zapisanie konkretnego konstruktora
        Constructor constructor = rental.getConstructor(Integer.TYPE);

        //Krok3: na podstawie konstruktora tworzymy obiekt
        RentCar rent = (RentCar) constructor.newInstance(123);

        System.out.println();

        //Pobieranie metod
        Method[] metody = rental.getMethods();
        for (Method metoda : metody) {
            System.out.println(metoda.getName());
        }

        //pobieranie konkretnej metody po nazwie
        Method metoda = rental.getDeclaredMethod(
                "computeRentalCost", int.class);
        System.out.println(metoda);

        // Uruchomienie konkretnej metody
        metoda.invoke(rent,45);

        //pobieranie typow wejsciowych metody
        Class[] typyArgumentow = metoda.getParameterTypes();

        // pobieranie typu zwracanego
        Class zwracanyTyp = metoda.getReturnType();
        System.out.println(zwracanyTyp);

        //oddzielanie soutem gory do dolu - moj komentarz
        System.out.println("----------");

        //Pola
        Field[] pola = rental.getFields();
        for (Field field : pola) {
            System.out.println(field.getName());
            Object type = field.getType();
            System.out.println("Typ Pola: " + type.toString());
            System.out.println("Wartosc pola: " + field.get(rent));
        }
        System.out.println("=============");

        // Pola prywatne
        Field prywatnePole = rental.getDeclaredField("type");
        prywatnePole.setAccessible(true);
        System.out.println(prywatnePole.get(rent));
        prywatnePole.set(rent,"Dupa");
        System.out.println(rent.getType());
    }
}
