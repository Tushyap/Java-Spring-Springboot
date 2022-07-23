package product.details;
//3. Product details (pid, pname, pdescription, pprice)
// product class
class ProductDetails{
	public int productId;
	public String productName;
	public String productDesc;
	public double productPrice;
	// constructor to assign values
	public ProductDetails(int productId, String productName, String productDesc, double productPrice) {
		this.productId = productId;
		this.productName = productName;
		this.productDesc = productDesc;
		this.productPrice = productPrice;
	}
		
}

public class ProductDetailsConstructor {

	public static void main(String[] args) {
		// create object
		ProductDetails productObj = new ProductDetails(1221, "HP probook"," Intel core i7, RAM 16gb ", 65000.330);
		// get the output on console
		System.out.println("Product's ID is : "+ productObj.productId);
		System.out.println("Product name : "+ productObj.productName);
		System.out.println("Product Description: "+ productObj.productDesc);
		System.out.println("Product price: "+ productObj.productPrice);
	}

}
