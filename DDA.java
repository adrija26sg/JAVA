/*
 * Write a program to declare a single dimensional array a[] and a square matrix b[][] of size N 
 where and N>2 &N<10 .Allow the user to input positive integer only into the single 
 dimensional array. Perform the following tasks. 
 a.Sort the elements of the one diensional array in ascending order using any sorting technique 
 display the sorted array. 
 b. Fill the array b[][] in the following format if the array a[]={5,2,8,1} then after sorting it 
 becomes a[]={1,2,5,8} 
Then the matrix b[][] will be filled as below: 
1 2 5 8 
1 2 5 1 
1 2 1 2 
1 1 2 5 
*/

import java.io.*;
import java.util.*;
class DDA
{
    public static void main()
    {
        Scanner in = new Scanner(System.in);
        int n,i,j,x,l,m,temp;
        System.out.println("Enter Array Capacity");
        n= in.nextInt(); // Input Array Capacity
        int a[]= new int[n]; // Single Dimensional Array
        int b[][]= new int[n][n]; // Double Dimension Array
        System.out.println("Enter Array Elements");
        for(i=0;i<n;i++)
        {
            a[i]= in.nextInt(); // Storing numbers in array
        }
        System.out.println("Original 1D Array");
        for(i=0;i<n;i++)
        {
            System.out.print(a[i]+"\t"); // Displaying unsorted array
        }
        System.out.println();
        for(i=0;i<n-1;i++)
        {
            for(j=0;j<((n-1)-i);j++)
            {
                if(a[j]>a[j+1]) // Sorting array
                {
                    temp=a[j];
                    a[j]=a[j+1];
                    a[j+1]=temp;
                }
            }
        }
        x=0; // variable used for storing elements in array.
        for(i=n;i>=1;i--) // 1st pattern condition
        {
            for(j=1;j<=i;j++)
            {
                b[x][j-1]= a[j-1]; // storing first pattern elements in 2D array
            }
            x++;
        }
        m=1;
        l=n;
        for(i=1;i<n;i++) // 2nd pattern condition
        {
            for(j=1;j<=i;j++)
            {
                b[m][l-1]= a[j-1]; // storing 2nd pattern in 2D array
                l++;
            }
            m++;
            l=l-m;
        }
        System.out.println("Sorted 1D Array");
        for(i=0;i<n;i++)
        {
            System.out.print(a[i]+"\t"); // displaying sorted array
        }
        System.out.println();
        System.out.println("2D Array");
        for(i=0;i<n;i++)
        {
            for(j=0;j<n;j++)
            {
                System.out.print(b[i][j]+"\t"); // display double dimensional matrix
            }
            System.out.println("\t");
        }
    } // end of main method
} // end of class  



/*
 * Enter Array Capacity
4
Enter Array Elements
5
2
8
1
Original 1D Array
5	2	8	1	
Sorted 1D Array
1	2	5	8	
2D Array
1	2	5	8		
1	2	5	1		
1	2	1	2		
1	1	2	5		

 */