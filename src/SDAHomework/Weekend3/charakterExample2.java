package SDAHomework.Weekend3;

public class charakterExample2 {
    public static void main(String[] args) {
        char surname[] =
                {'A', 'N','D','R','Z','E','J'};

        for (int i = 0; i < surname.length; i++) {
            if (i % 2 ==0){
                System.out.printf("%c", Character.toUpperCase(i));

        }
        }
        System.out.println();
    }
}
