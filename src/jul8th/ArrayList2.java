package jul8th;

import java.util.ArrayList;

public class ArrayList2 {

	public static void main(String[] args) {
		
		ArrayList<String> al=new ArrayList<String>();
		
		al.add("Selenium");
		
		al.add("Reyaz");
		
		al.add("LiveTech");
		
		//al.add(123456);
		
		System.out.println(al.size());
		
		for(int i=0;i<al.size();i++)
		{
			System.out.println(al.get(i));
		}
		
		for(String temp:al)
		{
			System.out.println(temp);
		}
		
		

	}

}
