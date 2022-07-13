package java8forEachMethod;

import java.util.HashMap;
import java.util.Map;

public class Java8forEachMethodImpl {

	public static void main(String[] args) {
		Map<String ,Integer> prices = new HashMap<String ,Integer>();
		prices.put("iPhone", 75990);
		prices.put("oneplus", 55990);
		prices.put("samsung", 45990);
		prices.put("mi phones", 35990);
		prices.put("oppo", 5990);
		// iterating without using lambda
		for (Map.Entry<String, Integer> entry : prices.entrySet()) {
			System.out.println("Phone = "+ entry.getKey() + "price = " + entry.getValue());
		}
		
		System.out.println("**********************************************************");
		// iterating using lambda  
		prices.forEach(
				(key, values) ->System.out.println("Phone = "+ 
				key + "price = " + values) );
	}
}
