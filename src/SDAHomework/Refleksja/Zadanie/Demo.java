package SDAHomework.Refleksja.Zadanie;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Date;


public class Demo {
    public static void main(String[] args) throws NoSuchMethodException, IllegalAccessException, InvocationTargetException, InstantiationException, NoSuchFieldException {


        //Zad1
        Class bookDefinition = Book.class;
        Constructor bookConstructor = bookDefinition.getConstructor(String.class, Date.class);
        //String title, Date date

        Book bookObject = (Book) bookConstructor.newInstance("Przeminelo z wiatrem", new Date());


// wypisanie wszystkich pol
        Field[] bookFields = bookDefinition.getFields();
        for (Field field : bookFields) {
            System.out.println(field.getName());

        }

        Field title = bookDefinition.getDeclaredField("title");
        title.setAccessible(true);
        title.set(bookObject,"jednak nie");

        Method getTitle = bookDefinition.getDeclaredMethod("getTitle");
        Object returnValue = getTitle.invoke(bookObject);
        System.out.println(returnValue);

// Koniec zadania 1

        //Zadanie 2
        Class emailDefinition = EMail.class;
        Constructor emailConstructor = emailDefinition
                .getConstructor(String[].class, String.class, Date.class);
        EMail emailObject = (EMail) emailConstructor
                .newInstance(new String[] {"aaa","bbb"},"Test",new Date()
                );


        Method addAuthor = emailDefinition
                .getMethod("addAuthor",String.class);

        addAuthor.invoke(emailObject,"KKKKK");
        addAuthor.invoke(emailObject,"AAAAA");
        addAuthor.invoke(emailObject,"ZZZZZ");

        Method getAuthors = emailDefinition.getMethod("getAuthors");
        String[] authors = (String[]) getAuthors.invoke(emailObject);

        for (String s : authors) {
            System.out.println(s);
        }

        Class superClass = emailDefinition.getSuperclass();
        String[] doPodmiany = {"1", "2", "3", "4", "5", "6", "7", "8", "9", "10"};
        Field autorzy = superClass.getDeclaredField("authors");
        autorzy.setAccessible(true);
        autorzy.set(emailObject, doPodmiany);
        authors = (String[]) getAuthors.invoke(emailObject);

        for (String s : authors) {
            System.out.println(s);
        }
   }
    }