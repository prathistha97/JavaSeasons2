package jun28th;

public class Leave extends Marks {
	
	int cl,sl;
	
	public void setLeave(int cl,int sl)
	{
		this.cl=cl;
		this.sl=sl;
	}
	
	public void getLeaves()
	{
		System.out.println("Total leaves taken "+(cl+sl));
	}

}
