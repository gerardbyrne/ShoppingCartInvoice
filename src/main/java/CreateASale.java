import java.util.Scanner;

public class CreateASale
{
    static Scanner readInput = new Scanner(System.in);

    public static void main(String[] args)
    {
        String productId, productDescription;
        int quantityOfItems;
        double itemPrice;

        System.out.println("What is the");

        System.out.println("\tProduct id:\t\t\t");
        productId = readInput.nextLine();

        System.out.println("\tProduct description:\t");
        productDescription = readInput.nextLine();

        System.out.println("\tProduct quantity:\t");
        quantityOfItems = readInput.nextInt();

        System.out.println("\tProduct price:\t\t");
        itemPrice = readInput.nextDouble();

        Invoice customerInvoice = new Invoice(productId, productDescription, quantityOfItems, itemPrice);

        System.out.println("The order details are");
        System.out.println("Product Id\t\tProduct Description\t\tQuantity\tUnit Price");
        System.out.println(productId +"\t\t\t" + productDescription + "\t\t\t" + quantityOfItems + "\t\t\t" + itemPrice);

        System.out.println();
        System.out.println();

        System.out.println("**********************************************");
        System.out.println("***************CUSTOMER INVOICE***************");
        System.out.println("**********************************************");
        System.out.println("Cost Price\t\t\t"   + customerInvoice.getQuantity()
                                                 + " @ £ " + customerInvoice.getItemPrice()
                                                 + "\t\t\t£ " + customerInvoice.costBeforeVAT());
        System.out.println("\nVAT Amount\t\t\t" + customerInvoice.calculateVATRate()
                                                 + " X " + customerInvoice.costBeforeVAT()
                                                 + "\t\t\t£ " + customerInvoice.calculateVATAmount());
        System.out.println("              \t\t\t\t\t\t\t______");
        System.out.println("Invoice Total\t\t\t\t\t\t\t£ " + customerInvoice.calculateTotalCost());
        System.out.println("              \t\t\t\t\t\t\t______");

    }
}
