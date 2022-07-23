package order.details;
// 4. Order details (ordid,ordname,orddescription,ordprice)


class OrderDetails{
	public int orderId;
	public String orderName;
	public String orderDesc;
	public double orderPrice;
	// constructor to assign values
	public OrderDetails(int orderId, String orderName, String orderDesc, double orderPrice) {
	
		this.orderId = orderId;
		this.orderName = orderName;
		this.orderDesc = orderDesc;
		this.orderPrice = orderPrice;
	}
	
	
}

public class OrderDetailsConstructor {

	public static void main(String[] args) {
		// create object
				OrderDetails orderObj = new OrderDetails(1001, "lenovo idea pad"," Intel core i5, RAM 8gb ", 60000);
				// get the output on console
				System.out.println("order's ID is : "+ orderObj.orderId);
				System.out.println("order name : "+ orderObj.orderName);
				System.out.println("order Description: "+ orderObj.orderDesc);
				System.out.println("order price: "+ orderObj.orderPrice);

	}

}
