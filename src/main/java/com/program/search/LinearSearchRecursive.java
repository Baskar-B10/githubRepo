package com.program.search;// Java Program to Search an element in an Array Recursively

// DateWithDifferentLocale class
public class LinearSearchRecursive {

	// Method 1
	// Recursive method to search for an element and
	// its index in the array

	//Time complexity: O(N2) where N is size of input array
	//Auxiliary Space : O(N)
	static int recursiveSearch(int arr[], int l, int r,
							int x)
	{

		// if r<l,it means that element is not present in
		// the array
		if (r < l)
			return -1;

		if (arr[l] == x)
			return l;

		if (arr[r] == x)
			return r;

		// Since element has not found on both left most and
		// rightmost boundary,ie at l and r, now recursive the
		// array to find position of x.
		return recursiveSearch(arr, l + 1, r - 1, x);
	}

	// Method 2
	// DateWithDifferentLocale driver method
	public static void main(String[] args)
	{
		// Element to be searched for
		// Custom input number
		int x = 3;

		// Declaring and initializing the integer array
		int arr[] = new int[] { 25, 60, 18, 3, 10 };

		// Calling the above recursive method method to
		// search for the element in the array

		// Recursive function is called over array to
		// get the index of the element present in an array
		int index
			= recursiveSearch(arr, 0, arr.length - 1, x);

		// If index is found means element exists
		if (index != -1)

			// Print the element and its index
			System.out.println("Element " + x
							+ " is present at index "
							+ index);

		// If we hit else case means
		// element is not present in the array
		else

			// Simply display the corresponding element
			// is not present
			System.out.println("Element " + x
							+ " is not present");
	}
}
