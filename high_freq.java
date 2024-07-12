/*
Given an array A[] of integers,sort the array according to frequency of elements. That is 
elements that have higher frequency come first.
 */
import java.util.*;
class high_freq
{


    public static int sortByFreq(int arr[], int n)  // sorting array w.r.t frequency
{

	int mx = -1;
	for (int i = 0; i < n; i++) 
	{
		mx = Math.max(mx, arr[i]);
	}
        
	int freq[] = new int[mx + 1];

	
	for (int i = 0; i < n; i++) 
	{
		freq[arr[i]]++;
	}

	int c = 0;

	for (int i = 0; i <= mx; i++) 
	{

		if (freq[i] > 0) 
		{

			int e = 100 - i;
			arr[c] = 100 * freq[i] + e;
			c++;
		}
	}


	return c;
}

static void printSort(int arr[], int t) //printing sorted array w.r.t freq
{
        System.out.println("\nThe Sorted Array is: ");

	for (int i = 0; i <t; i++)
	{

		
		int frequency = arr[i] / 100;

		int e = 100 - (arr[i] % 100);

		
		for (int j = 0; j < frequency; j++)
		{
			System.out.print(e + " ");
		}
	}
}

   
public static void main()
{
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter the size of array");
        int n = sc.nextInt();
        int arr[] = new int[n];
        
        System.out.println("Enter the elements of the array");
        for(int i = 0; i<n ;i++)
        {arr[i] = sc.nextInt();
        }

	
	int t = sortByFreq(arr, n);
	
	printSort(arr,t);

}
}
/* 
 * 
 
 
 Output 1
Enter the size of array
5
Enter the elements of the array
5
5
4
6
4

The Sorted Array is: 
4 4 5 5 6 

*/

/* 
 * OUTPUT 2
 * Enter the size of array
6
Enter the elements of the array
3
6
4
4
2
4

The Sorted Array is: 
2 3 4 4 4 6 
 */