/*
 * Written by Georphoe Lin
 */
import java.util.Scanner;
public class PBJFrontEnd {

	public static void main(String[] args) {
		
		
		boolean quit = false;
		while( !quit)
		{
		PBJSandwich pb01 = new PBJSandwich();
		PBJSandwich pb02 = new PBJSandwich();
		Scanner keyboard = new Scanner(System.in);
		
		
		//First PBJ
		System.out.println("Please enter the topslice's properties for pb01, one by one, name, calories, breadtype");
		String pb01TN = keyboard.nextLine();
		int pb01TC =keyboard.nextInt();
		keyboard.nextLine();
		String pb01TB = keyboard.nextLine();
		Bread pb01Top = new Bread(pb01TN,pb01TC,pb01TB);
		pb01.setTopSlice(pb01Top);
		
		
		System.out.println("Please enter the peanutbutter for pb01, one by one, name, calories, iscrunchy");
		String pb01PN = keyboard.nextLine();
		int pb01PC = keyboard.nextInt();
		boolean pb01PIC = keyboard.nextBoolean();
		PeanutButter pb01Pea = new PeanutButter(pb01PN,pb01PC,pb01PIC);
		pb01.setPeanutButter(pb01Pea);
		
		
		System.out.println("Please enter the jelly for pb01, one by one, name, calories, fruittype");
		
		String pb01JN = keyboard.next();
		//###String pb01JN= keyboard.nextLine(); 寫這個一直出錯 InputMismatchException
		int pb01JC = keyboard.nextInt();
		
		keyboard.nextLine();
		String pb01JF=keyboard.nextLine();
		Jelly pb01Jel = new Jelly (pb01JN,pb01JC,pb01JF);
		pb01.setJelly(pb01Jel);
		
		
		System.out.println("Please enter the bottomslice's properties for pb01, one by one, name, calories, breadtype");
		String pb01BN = keyboard.nextLine();
		int pb01BC =keyboard.nextInt();
		keyboard.nextLine();
		String pb01BB = keyboard.nextLine();
		Bread pb01Bot = new Bread(pb01BN,pb01BC,pb01BB);
		pb01.setBottomSlice(pb01Bot);
		
		
		//Second PBJ
		System.out.println("Please enter the topslice's properties for pb02, one by one, name, calories, breadtype");
		String pb02TN = keyboard.nextLine();
		int pb02TC =keyboard.nextInt();
		keyboard.nextLine();
		String pb02TB = keyboard.nextLine();
		Bread pb02Top = new Bread(pb02TN,pb02TC,pb02TB);
		pb02.setTopSlice(pb02Top);
		
		
		System.out.println("Please enter the peanutbutter for pb02, one by one, name, calories, iscrunchy");
		String pb02PN = keyboard.nextLine();
		int pb02PC = keyboard.nextInt();
		keyboard.nextLine();
		boolean pb02PIC = keyboard.nextBoolean();
		keyboard.nextLine();
		PeanutButter pb02Pea = new PeanutButter(pb02PN,pb02PC,pb02PIC);
		pb02.setPeanutButter(pb02Pea);
		
		
		System.out.println("Please enter the jelly for pb02, one by one, name, calories, fruittype");
		String pb02JN= keyboard.nextLine();
		int pb02JC = keyboard.nextInt();
		keyboard.nextLine();
		String pb02JF=keyboard.nextLine();
		Jelly pb02Jel = new Jelly (pb02JN,pb02JC,pb02JF);
		pb02.setJelly(pb02Jel);
		
		
		System.out.println("Please enter the bottomslice's properties for pb02, one by one, name, calories, breadtype");
		String pb02BN = keyboard.nextLine();
		int pb02BC =keyboard.nextInt();
		keyboard.nextLine();
		String pb02BB = keyboard.nextLine();
		Bread pb02Bot = new Bread(pb02BN,pb02BC,pb02BB);
		pb02.setBottomSlice(pb02Bot);
		
		
		//print out properties of the PBJ
		System.out.println(pb01.toString());
		System.out.println(pb02.toString());
		
		
		// determine if they are same
		System.out.println(pb01.equals(pb02));
		
		System.out.println("Please press enter to restart, or enter \"quit\" to quit");
		if (keyboard.nextLine().equalsIgnoreCase("quit"))
				quit = true;
		
		}
		
		
		
		/*第一種用法
		 * Bread aB = new Bread(keyboard.next(),keyboard.nextInt(),keyboard.next());
		pb01.setTopSlice(aB);
		 */
		// 第二種用法
		//pb01.setTopSlice(new Bread(keyboard.next(),keyboard.nextInt(),keyboard.next()));
		
		
		/*System.out.println("Please enter the peanutbutter's properties for pb01, name, calories, isCrunchy");
		PeanutButter aP= new PeanutButter(keyboard.next(), keyboard.nextInt(), keyboard.hasNextBoolean());
		pb01.setPeanutButter(aP);
		*/
		
		
		
		
		

	}

}
