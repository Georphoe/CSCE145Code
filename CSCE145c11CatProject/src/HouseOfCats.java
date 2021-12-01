/*
 * Written by Georphoe Lin
 */
public class HouseOfCats {

	public static void main(String[] args) {
		Cat cat01;
		cat01 = new Cat();
		System.out.println(cat01.getName()+" "+cat01.getWeight()+" "+cat01.getNumberOfLegs());
		cat01.setName("Mr. Flufferlins");
		cat01.setWeight(8.0);
		System.out.println(cat01.getName()+" "+cat01.getWeight()+" "+cat01.getNumberOfLegs());
		
		Cat cat02 =new Cat("Triscuit",9.2,4);
		System.out.println(cat02.getName()+" "+cat02.getWeight()+" "+cat02.getNumberOfLegs());
	}

}
