package SDAHomework.Refleksja.Generyki;

public class FruitBasket <T extends  Fruit> {
private T owoc;

    public T getOwoc() {
        return owoc;
    }

    public void setOwoc(T owoc) {
        this.owoc = owoc;
    }
}
