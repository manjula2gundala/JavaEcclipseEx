 // package declaration 
package Date311023;

// class called Product
public class Product
{
    // Data members
    private int product_Id;
    private String product_desc,batch_code;
    private double price,profit;
    
    // method with arguments and without return value
    public void addProduct(int PrdId, String PrdDescription, String BatchCode, double Price)
    {
        this.product_Id =PrdId;
        this.product_desc = PrdDescription;
        this.batch_code = BatchCode;
        this.price = Price;
        System.out.println("Product details: ");
        displayProductDetails();
    }
    
    // method without arguments and with return value
    public double calculate_Profit()
    {
        if (price >= 10000 && price <= 100000) 
        {
            profit = 0.10 * price;
        } 
        else if (price > 100000 && price <= 500000)
        {
            profit = 0.15 * price;
        } 
        else if (price > 500000) 
        {
            profit = 0.20 * price;
        }
        else 
        {
            profit = 0; 
        }
        return profit;
    }
    
    // method to display product details
    public void displayProductDetails()
    {
        System.out.println("Product ID: " + product_Id);
        System.out.println("Product Description: " + product_desc);
        System.out.println("Batch Code: " + batch_code);
        System.out.println("Price: " + price);
        System.out.println("profit: " + calculate_Profit());
    }

    // main method
    public static void main(String[] args) 
    {
    	// creating instance of class - Object
        Product prd=new Product();
        prd.addProduct(1,"Mobile","cd",50000);
        prd.addProduct(2, "Telivision", "vd", 20000);
    }
}
