public class Item {
    String itemCode;
    String itemName;
    double price;

    Item(String itemCode, String itemName, double price) {
        this.itemCode = itemCode;
        this.itemName = itemName;
        this.price = price;
    }

    void displayItemDetails() {
        System.out.println("Item Code: " + itemCode);
        System.out.println("Item Name: " + itemName);
        System.out.println("Price per Item: " + price);
    }

    double calculateTotalCost(int quantity) {
        return price * quantity;
    }

    public static void main(String[] args) {
        Item item = new Item("I101", "Pen", 15.0);

        item.displayItemDetails();

        int quantity = 10;
        System.out.println("Quantity: " + quantity);
        System.out.println("Total Cost: " + item.calculateTotalCost(quantity));
    }
}
