package basics.datatypes;

public class FloatExercise {
    public static void main(String[] args ) {

        float percentage = 89.5f;
        float height = 175.5f;
        float temperature  = 36.6f;
        float price = 99.99f;

        System.out.println("Percentage "+percentage);
        System.out.println("Height "+height);
        System.out.println("Temperature "+temperature);
        System.out.println("Price "+price);

        float product1 = 99.50f;
        float product2 = 149.75f;
        float product3 = 250.25f;

        float total = product1 + product2 + product3;
        float averagePrice = total/3;

        System.out.println("Total Price "+total);
        System.out.println("Average Price "+averagePrice);


    }
}
