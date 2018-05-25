package SDAHomework.Refleksja;

public class RentCar {
    private int rate;
    public static String type;

    public int price;

    public int getRate() {
        return rate;
    }

    public void setRate(int rate) {
        this.rate = rate;
    }

    public static String getType() {
        return type;
    }

    public static void setType(String type) {
        RentCar.type = type;
    }

    public RentCar(int length){
        if (length < 455){
            rate = 35;
            type = "small";
        }
        else if (length < 495){
            rate = 45;
            type = "Mid-size";
        }
        else {
            rate = 55;
            type = "Large";
        }
    }


        void computeRentalCost(int numberDays){
            price = rate * numberDays;
        System.out.println(price);
    }
}

