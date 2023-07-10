package jun26th;

public class Methods3 {
	
	public int natSum(int n)
	{
		int res=n*(n+1)/2;
		
		return res;
	}

	public static void main(String[] args) {
		
		Methods3 obj=new Methods3();
		
		System.out.println( obj.natSum(5));
		System.out.println( obj.natSum(10));
		System.out.println( obj.natSum(100));
		System.out.println( obj.natSum(1000));

	}

}
