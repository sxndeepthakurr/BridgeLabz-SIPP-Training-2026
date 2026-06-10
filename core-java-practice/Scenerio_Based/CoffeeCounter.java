import java.util.*;

public class CoffeeCounter{

    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);

        final double gstRate=0.18;

        while(true){
            System.out.println("Enter coffee type (Espresso, Latte, Cappuccino) or 'exit': ");
            String coffee=sc.nextLine();

            if(coffee.equalsIgnoreCase("exit")){
                System.out.println("Cafe Closed. Thank you!");
                break;
            }

            System.out.print("Enter quantity: ");
            int quantity = sc.nextInt();
            sc.nextLine(); // consume newline

            double price = 0;

            switch (coffee.toLowerCase()) {
                case "espresso":
                    price = 120;
                    break;

                case "latte":
                    price = 150;
                    break;

                case "cappuccino":
                    price = 180;
                    break;

                default:
                    System.out.println("Invalid coffee type!");
                    continue;
            }

            double total = price * quantity;
            double gst = total * gstRate;
            double finalBill = total + gst;

            System.out.println("\n----- BILL -----");
            System.out.println("Coffee Type : " + coffee);
            System.out.println("Quantity    : " + quantity);
            System.out.println("Amount      : ₹" + total);
            System.out.println("GST (18%)   : ₹" + gst);
            System.out.println("Final Bill  : ₹" + finalBill);
            System.out.println("----------------\n");
        }

        sc.close();
    }
}