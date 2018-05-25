package SDAHomework.Refleksja.Generyki;

public class Walizka <T extends Ubranie> {
    private T przedmiot;

    public T getPrzedmiot() {
        return przedmiot;
    }

    public void setPrzedmiot(T przedmiot) {
        this.przedmiot = przedmiot;
    }




}
