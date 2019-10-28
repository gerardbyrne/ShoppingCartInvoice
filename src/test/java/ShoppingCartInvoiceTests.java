import org.junit.Assert;
import org.junit.Test;

public class ShoppingCartInvoiceTests
{
    ShoppingCart cart = new ShoppingCart();

    @Test
    public void testCreateEmptyShoppingCart()
    {
        //ShoppingCart cart = new ShoppingCart();
        Assert.assertEquals(0,cart.getProductCount());
    }

    @Test
    public void testAddSingleProductToShoppingCart()
    {
        //ShoppingCart cart = new ShoppingCart();
        Product product = new Product("T15555 ", "Java Beginners", 5, 10.0);
        cart.addProduct(product);
        Assert.assertEquals(5, cart.getProductCount());
        Assert.assertEquals(50.0, cart.getTotalCartValue(), 0.00);
        }

    @Test
    public void testAddSingleProductToShoppingCart1()
    {
        //ShoppingCart cart = new ShoppingCart();
        Product product = new Product("T14444", "Swift Beginners", 2, 15.0);
        cart.addProduct(product);
        Assert.assertEquals(2, cart.getProductCount());
        Assert.assertEquals(30.0, cart.getTotalCartValue(), 0.00);
    }
}