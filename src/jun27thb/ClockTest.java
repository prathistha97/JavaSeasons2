package jun27thb;

public class ClockTest {

	public static void main(String[] args) {
		
		//user 1
		
		Clock c1=new Clock();
		c1.getClock();
		
		//user 2
		
		Clock c2=new Clock(11,43,55);
		c2.getClock();

	}

}
