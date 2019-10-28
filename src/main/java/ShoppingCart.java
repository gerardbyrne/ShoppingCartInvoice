import java.util.ArrayList;
import java.util.List;

public class ShoppingCart {
    private List<Product> productList = new ArrayList<>();

    public int getProductCount() {
        return productList.size();
    }

    public void addProduct(Product product) {
        for (int counter = 0; counter < product.getQuantity(); counter++) {
            productList.add(product);
        }
    }

    public double getTotalCartValue() {
        double totalCartValue = 0.00;
        if(productList.size()>0){
            for(Product product:productList){
                totalCartValue += product.getItemPrice();
            }
        }
        return totalCartValue;
    }
}