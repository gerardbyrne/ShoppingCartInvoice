import org.junit.Assert;
import org.junit.Test;

public class InvoiceTests
{
    @Test
    public void testCostBeforeVAT()
    {
        Invoice invoice = new Invoice("T15555", "Java Beginners", 5, 10.0);
        Assert.assertEquals(50.00, invoice.costBeforeVAT(),0.0);
    }

    @Test
    public void testCostBeforeVAT1()
    {
        Invoice invoice = new Invoice("T14444", "Swift Beginners", 2, 15.0);
        Assert.assertEquals(30.00, invoice.costBeforeVAT(),0.0);
    }

    @Test
    public void testVATCodeOfProduct()
    {
        Invoice invoice = new Invoice("T15555", "Java Beginners", 5, 10.0);
        Assert.assertEquals("T1",invoice.VATCodeOfProduct());
    }

    @Test
    public void testVATCodeOfProduct1()
    {
        Invoice invoice = new Invoice("T14444", "Swift Beginners", 2, 15.0);
        Assert.assertEquals("T1",invoice.VATCodeOfProduct());
    }

    @Test
    public void testCalculateVATRate()
    {
        Invoice invoice = new Invoice("T15555", "Java Beginners", 5, 10.0);
        Assert.assertEquals(0.20,invoice.calculateVATRate(), 0.00);
    }

    @Test
    public void testCalculateVATRate1()
    {
        Invoice invoice = new Invoice("T14444", "Swift Beginners", 2, 15.0);
        Assert.assertEquals(0.20,invoice.calculateVATRate(), 0.00);
    }

    @Test
    public void testCalculateVATAmount()
    {
        Invoice invoice = new Invoice("T15555", "Java Beginners", 5, 10.0);
        Assert.assertEquals(10,invoice.calculateVATAmount(), 0.00);
    }

    @Test
    public void testCalculateVATAmount1()
    {
        Invoice invoice = new Invoice("T14444", "Swift Beginners", 2, 15.0);
        Assert.assertEquals(6,invoice.calculateVATAmount(), 0.00);
    }

    @Test
    public void testCalculateTotalCost()
    {
        Invoice invoice = new Invoice("T15555", "Java Beginners", 5, 10.0);
        Assert.assertEquals(60,invoice.calculateTotalCost(), 0.00);
    }

    @Test
    public void testCalculateTotalCost1()
    {
        Invoice invoice = new Invoice("T14444", "Swift Beginners", 2, 15.0);
        Assert.assertEquals(36,invoice.calculateTotalCost(), 0.00);
    }

    @Test
    public void testCalculateTotalCost2()
    {
        Invoice invoice = new Invoice("T03333", "Python Beginners", 10, 5.0);
        Assert.assertEquals(50,invoice.calculateTotalCost(), 0.00);
    }

    @Test
    public void testCalculateTotalCost3()
    {
        Invoice invoice = new Invoice("T22222", "Maven Beginners", 20, 25.0);
        Assert.assertEquals(525,invoice.calculateTotalCost(), 0.00);
    }
}
