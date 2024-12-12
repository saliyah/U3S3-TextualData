public class ShoppingCart01 {
    public static void main(String[] args) {
        // Declare and initialize String variables.  Do not initialize message yet.
        //int custName = "Alex";
        //int itemDesc = "Shirts";
        String custName = "Alex";
        String itemDesc = "Shirts";
        String message = custName + "wants to purchase a shirt" + itemDesc;



        // Assign the message variable
        double price = 19.13;
        double tax = .0065;
        int quantity = 2;

        String totalPrice = "$" + (price * tax) + price;

        String message1 = custName + "wants to purchase" + quantity + "" +itemDesc;
        String message2 = "The total cost with tax is" + totalPrice;

        System.out.println(message1);
        System.out.println(message2);


        // Print and run the code

    }
}
