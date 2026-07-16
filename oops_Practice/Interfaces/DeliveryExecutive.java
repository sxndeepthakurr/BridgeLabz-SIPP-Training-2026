interface FoodDelivery {

    default void trackOrder() {
        System.out.println("Tracking Food Order...");
    }

    void deliverFood();

    static String generateDeliveryCode() {
        return "FD" + (int)(Math.random() * 10000);
    }
}

interface GroceryDelivery {

    default void trackOrder() {
        System.out.println("Tracking Grocery Order...");
    }

    void deliverGroceries();
}

public class DeliveryExecutive implements FoodDelivery, GroceryDelivery {

    String[] customers = {"Ankit", "Priya", "Mohit"};

    @Override
    public void deliverFood() {
        System.out.println("Food Delivered Successfully.");
    }

    @Override
    public void deliverGroceries() {
        System.out.println("Groceries Delivered Successfully.");
    }

    @Override
    public void trackOrder() {
        FoodDelivery.super.trackOrder();
        GroceryDelivery.super.trackOrder();
    }

    public void processDeliveries() {

        for (String customer : customers) {

            System.out.println("\nCustomer : " + customer);

            trackOrder();

            deliverFood();
            deliverGroceries();

            System.out.println("Delivery Code : "
                    + FoodDelivery.generateDeliveryCode());

            System.out.println("---------------------------");
        }
    }

    public static void main(String[] args) {

        DeliveryExecutive obj = new DeliveryExecutive();
        obj.processDeliveries();
    }
}