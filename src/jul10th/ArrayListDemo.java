package jul10th;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ArrayListDemo {

	public static void main(String[] args) {
		
		 List<Integer> al=new ArrayList<Integer>();
		 
		 System.out.println(al.size());
		 
		 al.add(10);
		 al.add(20);
		 al.add(30);
		 al.add(40);
		 al.add(50);
		 
		 System.out.println(al.size());
		 
		 Iterator<Integer> it=al.iterator();
		 
		 while(it.hasNext())
		 {
			 System.out.println(it.next());
		 }

	}

}
