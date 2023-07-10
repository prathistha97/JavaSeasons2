package jul10th;

import java.util.HashSet;
import java.util.Set;

public class HashSet2 {

	public static void main(String[] args) {
		
		Set<String> hs=new HashSet<String>();
		
		System.out.println(hs.size());
		
		hs.add("Selenium");
		hs.add("Reyaz");
		hs.add("Live Tech");
		
		System.out.println(hs.size());
		
		System.out.println(hs);
		
		hs.add("Selenium");
		hs.add("Reyaz");
		hs.add("Live Tech");
		
		System.out.println(hs.size());
		
		System.out.println(hs);

	}

}
