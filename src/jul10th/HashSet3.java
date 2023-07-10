package jul10th;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class HashSet3 {

	public static void main(String[] args) {
		
		Set<String> hs=new HashSet<String>();
		
		System.out.println(hs.size());
		
		hs.add("Selenium");
		hs.add("Reyaz");
		hs.add("Live Tech");
		
		System.out.println(hs.size());
		
		//for-each loop
		for(String temp:hs)
		{
			System.out.println(temp);
		}
		
		//iterator 
		Iterator<String> it=hs.iterator();
		
		while(it.hasNext())
		{
			System.out.println(it.next());
		}
		
		
		
		
	}

}
