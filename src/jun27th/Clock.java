package jun27th;

public class Clock {
	
	int hr,min,sec;
	
	public void setClock(int hr,int min,int sec)
	{
		this.hr=hr;
		this.min=min;
		this.sec=sec;
	}
	
	public void getClock()
	{
		//System.out.println(hr+":"+min+":"+sec);
		System.out.format("%02d:%02d:%02d",hr,min,sec);
	}

}
