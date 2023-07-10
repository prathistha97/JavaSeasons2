package jul8th;

public class Arrays2 {

	public static void main(String[] args) {
		
		
		int[] b=new int[5];
		
		System.out.println(b.length);
		
		for(int i=0;i<b.length;i++)
		{
			System.out.println(b[i]);
		}
		
		
		b[0]=100;
		//b[1]=200.33;
		b[2]=300;
		b[3]=400;
		b[4]=500;
		//b[5]=600;
		
		for(int i=0;i<b.length;i++)
		{
			System.out.println(b[i]);
		}

	}

}
