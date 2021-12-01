/*
 * written by Georphoe Lon
 */
public class Tester {
	
	public static void main(String[] args) {
		Person p = new Person();
		Student s = new Student();
		Ugrad u = new Ugrad();
		
		System.out.println(p);
		System.out.println(s);
		System.out.println(u);
		
		Person[] people = new Person[3];
		people[0] = new Person("asdf");
		people[1] = new Student("asdf2",4);
		people[2] = new Ugrad("asdf3",5,2);
		
		for(int i= 0; i<people.length;i++)
		{
			System.out.println(people[i]);
		}
	}

}
