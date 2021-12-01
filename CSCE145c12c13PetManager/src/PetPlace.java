/*
 * Written by Georphoe Lin
 */
public class PetPlace {

	public static void main(String[] args) {
		Pet pet01 = new Pet();
		System.out.println(pet01);//這個系統直接假設等於System.out.println(pet01.toString());
		Pet pet02 = new Pet("Mr. Flufferkins", 7, 8.6, PetType.CAT);
		System.out.println(pet02);
		Pet pet03 = new Pet("Roofles", 3 ,15.0, PetType.DOG);
		System.out.println(pet03);
		pet02.giveComplement();
		pet03.giveComplement(3);
		
		Pet pet04 = Pet.creatNewPet(PetType.HAMSTER);
		System.out.println(pet04);
		
		Pet pet05 = Pet.clonePet(pet04);
		System.out.println(pet05);
		System.out.println(pet04.equals(pet05));// true, same properties value
		System.out.println(pet04 == pet05);// false, different memory address
	}

}
