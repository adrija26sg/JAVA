/**
 * /*
 * Generate a magic square.
 * Accept order of matrix as odd integer. 
 * Numbers should be from 1.
 * Starting position is 1st row, n/2 column.
 * Sum of elements of each row, column and diagonal=n(n*n+1)/2.
 * Example:
 * n=3, sum=15
 * 8 1 6
 * 3 5 7
 * 4 9 2
 */
 




import java.util.*;
class magic_square
{
    public static void main()
    {
        Scanner sc=new Scanner(System.in);

    System.out.print("enter an odd number: ");
    int n = sc.nextInt();
    int[][] a = new int[n][n];
    int i,j;
    int x = 1; //storing number
    int row = 0; //initalising no of rows
    int col = n / 2; //initialising no of coloumns
    int curr_row;
    int curr_col;
    while (x <= n * n)
    {
        a[row][col] = x;
        x++;
        curr_row = row;
        curr_col = col;
        row = row-1;
        col = col+1;
        if (row == -1)
        {
            row = n - 1;
        }
        if (col == n) {
            col = 0;
        }
        if (a[row][col] != 0) {
            row = curr_row + 1;
            col = curr_col;
            if (row == -1)
            {
                row = n - 1;
            }
        }
    }
    System.out.println(" ẗhe magic square is:" );
   
    for ( i = 0; i < a.length; i++)
    {
        for ( j = 0; j < a.length; j++)
        {
            System.out.print(a[i][j] + " ");
        }
        System.out.println();
    }
   
    int sum=n*(n*n+1)/2;
    System.out.println(" the sum of the rows coloumns and diagonals is"+"    "  + sum);
}
}
/* OUTPUT:
 enter an odd number: 9
 ẗhe magic square is:
47 58 69 80 1 12 23 34 45 
57 68 79 9 11 22 33 44 46 
67 78 8 10 21 32 43 54 56 
77 7 18 20 31 42 53 55 66 
6 17 19 30 41 52 63 65 76 
16 27 29 40 51 62 64 75 5 
26 28 39 50 61 72 74 4 15 
36 38 49 60 71 73 3 14 25 
37 48 59 70 81 2 13 24 35 
 the sum of the rows coloumns and diagonals is    369

 */