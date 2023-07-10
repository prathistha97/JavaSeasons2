package jun26th;

public class PersonTest {

	public static void main(String[] args) {
		
		Person p1=new Person();
		
		System.out.println(p1.name);
		System.out.println(p1.age);
		System.out.println(p1.ph);
		
		p1.name="DJ Tillu";
		p1.age=30;
		p1.ph=9609333222l;
		
		System.out.println(p1.name);
		System.out.println(p1.age);
		System.out.println(p1.ph);
		
		p1.greet();
		
		Person.bye();
		

	}

}
