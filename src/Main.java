import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        ShoppingCart shop = new ShoppingCart();
        Scanner sc = new Scanner(System.in);

        int choice;

        do {
            System.out.println("\n===== Shopping Cart Menu =====");
            System.out.println("1. View Products");
            System.out.println("2. Add Product to Cart");
            System.out.println("3. View Cart");
            System.out.println("4. Remove Product");
            System.out.println("5. Checkout");
            System.out.println("6. Exit");
            System.out.print("Enter your choice: ");

            choice = sc.nextInt();

            switch (choice) {
                case 1:
                    shop.displayProducts();
                    break;

                case 2:
                    shop.addToCart();
                    break;

                case 3:
                    shop.viewCart();
                    break;

                case 4:
                    shop.removeFromCart();
                    break;
                    
                case 5:
                    shop.checkout();
                    break;

                case 6:
                   System.out.println("Thank you for shopping!");
                   break;

                default:
                    System.out.println("Invalid choice! Please try again.");
            }

        } while (choice != 6);

        sc.close();
    }
}