/*
 * Written by Georphoe
 */
public class StringHelperTester {

	public static void main(String[] args) {
		
		System.out.println("Welcome to the String Helper Tester!");
		System.out.print("\n");
		StringHelper A = new StringHelper();
		System.out.println("Testing Has All Unique Characters with \"facetiously\"");
		System.out.println(A.hasAllUniqueCharacters("facetiously"));
		System.out.println("Testing Has All Unique Characters with \"banana\"");
		System.out.println(A.hasAllUniqueCharacters("banana"));
		System.out.print("\n");
		
		//System.out.print(A.hasAllUniqueCharacters("abxcc"));
		//System.out.print("\n");
		
		System.out.println("Testing Mesh Strings with \"harp\" and \"fiddle\"");
		System.out.println(A.meshString("harp","fiddle" ));
		System.out.println("Testing Mesh Strings with \"banana\" and \"apple\"");
		System.out.println(A.meshString("banana","apple" ));
		System.out.print("\n");
		
		System.out.println("Testing Replace Vowels with Oodle with \"burrito\"");
		System.out.println(A.replaceVowelsWithOodle("burrito"));
		System.out.println("Testing Replace Vowels with Oodle with \"apple\"");
		System.out.println(A.replaceVowelsWithOodle("apple"));
		System.out.print("\n");
		
		System.out.println("Testing Weight with \"heavy\"");
		System.out.println(A.weight("heavy"));
		System.out.println("Testing Weight with \"light\"");
		System.out.println(A.weight("light"));
	}

}
