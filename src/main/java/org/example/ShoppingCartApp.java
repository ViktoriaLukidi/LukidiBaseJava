package shoppingcart;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ShoppingCartApp {
    private List<String> cartItems;

    public ShoppingCartApp() {
        cartItems = new ArrayList<>();
    }

    public void addProductToCart(String product) {
        cartItems.add(product);
    }

    public void displayCartItems() {
        System.out.println("Products in the Shopping Cart:");
        for (String item : cartItems) {
            System.out.println("- " + item);
        }
    }

    public static void main(String[] args) {
        ShoppingCartApp cart = new ShoppingCartApp();
        Scanner scanner = new Scanner(System.in);

        System.out.println("Welcome to the Shopping Cart Application!");

        while (true) {
            System.out.println("\nMenu:");
            System.out.println("1. Add Product to Cart");
            System.out.println("2. Display Cart Items");
            System.out.println("3. Exit");

            System.out.print("Enter your choice: ");
            int choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 1:
                    System.out.print("Enter the product to add: ");
                    String product = scanner.nextLine();
                    cart.addProductToCart(product);
                    System.out.println("Product added to the cart.");
                    break;
                case 2:
                    cart.displayCartItems();
                    break;
                case 3:
                    System.out.println("Thank you for using the Shopping Cart Application!");
                    System.exit(0);
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }
}
