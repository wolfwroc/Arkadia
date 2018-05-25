package SDAHomework.Refleksja;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class RefleksjaDemo {
    public static void main(String[] args) {
        try {
            //Pobranie definicji
            Class<?> definicjaPies =
                    Class.forName("SDAHomework.Refleksja.Pies");
            //Nowa instancja Klasy
            Pies refleksyjnyBurek = (Pies) definicjaPies.newInstance();
            //Tablice typow wejsciowych do metody setImie
            Class[] argumentyTypyWejsciowe = { String.class };
            //Zapisujemy
            Method metodaSetImieWZmiennej = definicjaPies.getDeclaredMethod("setImie",
                    argumentyTypyWejsciowe);

            //Przygotowanie argumentow wejsciowych
            Object[] argumentyWejsciowe = { "Burek"};

            //Uruchomienie
            metodaSetImieWZmiennej.invoke(refleksyjnyBurek, argumentyWejsciowe);

            //Dobranie sie do metody statycznej
            Method metodaStatycznaSzczekaj = definicjaPies.getMethod("Szczekaj");

            metodaStatycznaSzczekaj.invoke(null);

        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (NoSuchMethodException e) {
            e.printStackTrace();
        } catch (InvocationTargetException e) {
            e.printStackTrace();
        }
    }
}
