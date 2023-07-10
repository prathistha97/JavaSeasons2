package jun28th;

public class SchoolDemo {

	public static void main(String[] args) {
		
		
		//Student s1=new Student();
		//Marks s1=new Marks();
		Leave s1=new Leave();
		s1.setDetails(1, "Sam");
		s1.getDetails();
		s1.setMarks(80, 70, 90);
		s1.getResults();
		s1.setLeave(5, 6);
		s1.getLeaves();

	}

}
