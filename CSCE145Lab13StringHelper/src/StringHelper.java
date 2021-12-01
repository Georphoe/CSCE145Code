/*
 * Written by Georphoe Lin
 */
public class StringHelper {

	public static boolean hasAllUniqueCharacters(String aS)
	{
		//-charAt(index)// returns the character at index in the string
		
		boolean unique = true;
		for(int i =0; i< aS.length()-1;i++)// check each character
		{
			for(int j=i+1; j<aS.length();j++)// with respect to every other character
			{
				if(aS.charAt(i) == aS.charAt(j))
				{
					unique = false;
				}
			}
		}
		return unique;
	}
	public static String meshString(String aS1, String aS2)
	{
		boolean aS1bigger = true;
		if(aS1.length() < aS2.length()) //check which string is longer
		{
			aS1bigger = false;
		}
		
		String mesh = "";
		if(!aS1bigger )
		{
			int index = 0;
			for(int i=0;i< aS1.length();i++)
			{
				mesh = mesh+aS1.charAt(i)+aS2.charAt(i);// get one letter from each string in order
				index =i;
			}
			mesh = mesh+aS2.substring(index+1);// add the rest
			return mesh;
		}
		else
		{
			int index = 0;
			for(int i=0;i< aS2.length();i++)
			{
				mesh = mesh+aS1.charAt(i)+aS2.charAt(i);
				index =i;
			}
			mesh = mesh+aS1.substring(index+1);
			return mesh;
		}
	}
	public static String replaceVowelsWithOodle(String aS)
	{
		String replacedString = "";
		for (int i = 0 ; i < aS.length();i++)
		{
			if(aS.charAt(i)=='a'||aS.charAt(i)=='A' ||
					aS.charAt(i)=='e'||aS.charAt(i)=='E' ||
					aS.charAt(i)=='i'||aS.charAt(i)=='I' ||
					aS.charAt(i)=='o'||aS.charAt(i)=='O' ||
					aS.charAt(i)=='u'||aS.charAt(i)=='U' )
			{
				replacedString = replacedString +"oodle";// replace vowel with oodle
			}
			else
			{
				replacedString = replacedString + aS.charAt(i);
			}
			
		}
		
		return replacedString;
		/*
		 * if(vowel)
		 * {
		 * String temp =input.subString(0,i);
		 * String temp2 = input.subString(i+1);
		 * input = temp+"input"+temp2;
		 * i+=4;
		 * }
		 */
		
		
		
		
		/*String copy = aS;
		for(int i = 0; i<aS.length();i++)
		{
			if(aS.charAt(i)=='a'||aS.charAt(i)=='A' ||
					aS.charAt(i)=='e'||aS.charAt(i)=='E' ||
					aS.charAt(i)=='i'||aS.charAt(i)=='I' ||
					aS.charAt(i)=='o'||aS.charAt(i)=='O' ||
					aS.charAt(i)=='u'||aS.charAt(i)=='U' )
			{
				copy = aS.substring(0, i)+"oodle";
			}
			return copy;
			}*/
	}
	
	public static double weight(String aS)
	{
		double weight = 0;
		//(a,e,i,o,u)=2.5, rest = 3.4
		for(int i = 0; i< aS.length();i++)// check each character and add up the weight
		{
			if(aS.charAt(i)=='a'||aS.charAt(i)=='A' ||
					aS.charAt(i)=='e'||aS.charAt(i)=='E' ||
					aS.charAt(i)=='i'||aS.charAt(i)=='I' ||
					aS.charAt(i)=='o'||aS.charAt(i)=='O' ||
					aS.charAt(i)=='u'||aS.charAt(i)=='U' )
			{
				weight = weight+2.5;
			}
			else 
				weight = weight+3.4;
			
		}
		return weight;
		
		
	}
}
