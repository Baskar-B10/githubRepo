package com.program.strings.pangramString;// Java program for the above approach

class PangramStringUsingCharacterTraversal {

	// Function to check if a string
	// contains all the letters from
	// a to z (ignoring case)
	//Time Complexity: O(26*N)
	//Auxiliary Space: O(1)
	public static void
	allLetter(String str)
	{
		// Converting the given string
		// into lowercase
		str = str.toLowerCase();

		boolean allLetterPresent = true;

		// Loop over each character itself
		for (char ch = 'a'; ch <= 'z'; ch++) {

			// Check if the string does not
			// contains all the letters
			if (!str.contains(String.valueOf(ch))) {
				allLetterPresent = false;
				break;
			}
		}

		// Check if all letter present then
		// print "Yes", else print "No"
		if (allLetterPresent)
			System.out.println("Yes");
		else
			System.out.println("No");
	}

	// Driver Code
	public static void main(String args[])
	{
		// Given string str
		String str = "Abcdefghijklmnopqrstuvwxyz12";

		// Function call
		allLetter(str);
	}
}
