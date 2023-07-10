package jun23rd;

public class Methods2 {
	
	public static void main(String[] args) {
		
		Methods2 obj1=new Methods2();
		
		obj1.natSum(5);
		obj1.natSum(10);
		obj1.natSum(100);
		obj1.natSum(1000);
		
	}
	
	public void natSum(int n)
	{
		int res=n*(n+1)/2;
		
		System.out.println(res);
	}

}
