package ArrayD5;

public class Maxmin {
	public void MaxMin(int arr[][]) {	
		int maxSum=0,minSum=0;
		for ( int i=0;i<arr.length;i++)
			{
			int mx=arr[i][0];
			 int mn=arr[i][0];
			for(int  j=0;j<arr[i].length;j++)
			{
				if(mx<arr[i][j]) {
					mx=arr[i][j];
				}
				if(mn>arr[i][j]) {
					mn=arr[i][j];
				}
			}
			maxSum=mx+maxSum;
			minSum=mn+minSum;
		}		
		System.out.println("Maximum Sum of element is:"+maxSum);
		System.out.println("Minimum Sum of element is:"+minSum);
	}

	public static void main(String[] args) {
		int arr[][]= {{10,20,30},{50,60,80,90},{90,10,30,50},{20,40,30,40,60,10},{10,60,70}};
		Maxmin obj=new Maxmin();
		obj.MaxMin(arr);

	}

}
