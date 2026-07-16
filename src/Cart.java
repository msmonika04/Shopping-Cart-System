public class Cart {

    Product product;
    int quantity;

    public Cart(Product product, int quantity) {
        this.product = product;
        this.quantity = quantity;
    }

    public double getTotalPrice() {
        return product.price * quantity;
    }

    public void displayCartItem() {
        System.out.println(product.id + " | " +
                           product.name + " | ₹" +
                           product.price + " | Qty: " +
                           quantity + " | Total: ₹" +
                           getTotalPrice());
    }
}