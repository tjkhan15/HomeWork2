package String;

public class UseString {
	
	// Design another class name call UseString. 
	// Show the uses of 30 different methods from String class.

	public static void main(String[] args) {

		// 1. This method returns the character located at the String's specified index. 
		// The string indexes start from zero.
		String str1 = "Strings are immutable";
	    char uString1 = str1.charAt(8);
	    System.out.println(uString1);
	    
	    // 2. This method compares this String to another Object.
	    String str2 = new String("Strings are immutable");
	    String str3 = new String("Integers are not immutable");
	      
	    int uString2 = str1.compareTo( str2 );
	    System.out.println(uString2);
	      
	    uString2 = str2.compareTo( str3 );
	    System.out.println(uString2);
	    
	    // 3. This method appends one String to the end of another.
	    str1 = str1.concat(" all the time");
	    System.out.println(str1);
	    
	    // 4. This method returns true if and only if this 
	    // String represents the same sequence of characters as specified in StringBuffer.
	    String str4 = "Not immutable";
	    String str5 = "Strings are immutable";
	    StringBuffer str6 = new StringBuffer( "Not immutable");

	    boolean  result = str4.contentEquals( str6 );
	    System.out.println(result);
		  
	    result = str1.contentEquals( str4 );
	    System.out.println(result);
	    
	    // 5. This method returns a String that represents the character sequence in the array specified.
	    char[] Str7 = {'h', 'e', 'l', 'l', 'o', ' ', 'w', 'o', 'r', 'l', 'd'};
	    String Str8 = "";
	    Str8 = Str8.copyValueOf( Str7 );
	    System.out.println("Returned String: " + Str8);
	    
	    // 6. Converts the String to Lower case.
	  	System.out.println("Lower Case: " + str1.toLowerCase());
	  	
	  	// 7. Converts the String to Upper case.
		System.out.println("Upper Case: " + str1.toUpperCase());
		
		// 8. Returns the size of a String.
		System.out.println("The length of the String is: " + str1.length());
		
		// 9. Returns a character based on the index.
		System.out.println("The character at the position 8 is: " + str1.charAt(8));

		// 10. Returns the index number of a character.
		System.out.println("The index number of character 'a' is: " + str1.indexOf('a'));
		
		// 11. Returns the starting index number of a string word.
		System.out.println("The index number of word 'Strings' is: " + str1.indexOf("Strings"));
		
		// 12. Returns the substring from the index specified to the end of the String.
		System.out.println("Substring from index 5 is: " + str1.substring(5));
		
		// 13. This method returns a hash code for this string. The hash code for a String object is computed as −
		String Str9 = new String("Strings are immutable");
	    System.out.println("Hashcode for Str :" + Str9.hashCode() );
	    
	    // 14. This method returns the index within this string of the first occurrence of the specified character or -1, if the character does not occur.
	    System.out.print("Found Index :" );
	    System.out.println(Str9.indexOf( 'i' ));
	    
	    // 15. This method returns the index of the last occurrence of the character in the character sequence represented by this object that is less than or equal to fromIndex, or -1 if the character does not occur before that point.
	    System.out.print("Found Last Index :" );
	    System.out.println(Str9.lastIndexOf( 'i' ));
		
		// 16. This method returns a new string resulting from replacing all occurrences of oldChar in this string with newChar.
	    System.out.print("Return Value :" );
	    System.out.println(Str9.replace('a', 'T'));

	    System.out.print("Return Value :" );
	    System.out.println(Str9.replace('i', 'D'));
	    
	    
	    // 17. This method replaces each substring of this string that matches the given regular expression with the given replacement.
	    System.out.print("Return Value :" );
	    System.out.println(Str9.replaceAll("(.*)immutable(.*)", "AMROOD"));
	    
	    
	}

}
