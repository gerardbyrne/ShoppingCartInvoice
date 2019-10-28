public class Product
{
    private final String productId;

    public String getProductId() {
        return productId;
    }

    public String getDescription() {
        return description;
    }

    public int getQuantity() {
        return quantity;
    }

    public double getItemPrice() {
        return itemPrice;
    }

    private final String description;
    private final int quantity;
    private final double itemPrice;

    public Product(String productId, String description, int quantity, double itemPrice) {

        this.productId = productId;
        this.description = description;
        this.quantity = quantity;
        this.itemPrice = itemPrice;
    }
}
