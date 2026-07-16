import java.util.ArrayList;
import java.util.Scanner;

public class ShoppingCart {

    ArrayList<Product> products = new ArrayList<>();
    ArrayList<Cart> cart = new ArrayList<>();

    Scanner sc = new Scanner(System.in);

    // Constructor
    public ShoppingCart() {

        products.add(new Product(1, "Laptop", 50000));
        products.add(new Product(2, "Mouse", 700));
        products.add(new Product(3, "Keyboard", 1200));
        products.add(new Product(4, "Headphones", 2500));
        products.add(new Product(5, "USB Drive", 600));

    }

    // Display Products
    public void displayProducts() {

        System.out.println("\n------ Available Products ------");

        for (Product p : products) {
            p.displayProduct();
        }
    }
    public void addToCart() {

    System.out.print("Enter Product ID: ");
    int id = sc.nextInt();

    System.out.print("Enter Quantity: ");
    int quantity = sc.nextInt();

    for (Product p : products) {

        if (p.id == id) {

            cart.add(new Cart(p, quantity));

            System.out.println("Product added to cart successfully!");

            return;
        }
    }

    System.out.println("Product not found!");

}
public void viewCart() {

    if (cart.isEmpty()) {
        System.out.println("Your cart is empty!");
        return;
    }

    System.out.println("\n------ Shopping Cart ------");

    for (Cart item : cart) {
        item.displayCartItem();
    }
}
public void checkout() {

    if (cart.isEmpty()) {
        System.out.println("Your cart is empty!");
        return;
    }

    double totalBill = 0;

    System.out.println("\n------ Bill ------");

    for (Cart item : cart) {
        item.displayCartItem();
        totalBill += item.getTotalPrice();
    }

    System.out.println("---------------------------");
    System.out.println("Total Bill: ₹" + totalBill);
    System.out.println("Thank you for shopping!");
}
public void removeFromCart() {

    if (cart.isEmpty()) {
        System.out.println("Your cart is empty!");
        return;
    }

    System.out.print("Enter Product ID to remove: ");
    int id = sc.nextInt();

    for (int i = 0; i < cart.size(); i++) {

        if (cart.get(i).product.id == id) {

            cart.remove(i);
            System.out.println("Product removed successfully!");
            return;
        }
    }

    System.out.println("Product not found in cart!");

}

}