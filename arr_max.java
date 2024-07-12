/*
Accept MX8 as dimensions of a 2 dimensional array. Fill up the array with the binary 
conversion of M no. Of decimal number .Print the column nos. Which are having 
maximum 
number of 1’s in it. 
 */


import java.util.*;
class arr_max
{ 
    public static void main()
     {
        arr_max obj=new arr_max();
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of the array");
        int m=sc.nextInt(); int i,j ;
        
        int b[][]=new int[m][8];
        
        int n[]=new int[m];
        
        System.out.println("Enter the numbers into the array"); //accepting array
        
        for(i=0;i<m;i++)
        {
         n[i]=sc.nextInt();
        
        }
        
        for( i=0;i<m;i++) //converting entered elements to binary
        {
         String bin=obj.convert(n[i]);
         
         for( j=0;j<8;j++)
         {
             b[i][j]=(int)(bin.charAt(j))-48;
            
            }
        
        }
        
        for( i=0;i<m;i++) //filling up the array with those elements
        {
            for(j=0;j<8;j++)
            {
                System.out.print(b[i][j]);
                            
            }
            System.out.println();
        }
        
        int max=0;
        
        
        int c[]=new int[8];
        for( i=0;i<8;i++) //to find the coloumn number of max number of 1's
        {
            
            
            for(j=0;j<m;j++)
            if(b[j][i]==1)
            c[i]++;
            if(c[i]>max)
            max=c[i];
        
        }
       for( i=0;i<8;i++)
       {
           if(c[i]==max)
           System.out.println("Column "+(i+1)+" has highest number of ones.");  //printing
        }
     }
    
    
    public String convert(int num)
    {
        String x="";
        for(;num>0;num/=2)
        {
         x= (num%2) +x;
        
        }
        for(;x.length()<8;)
        {x="0"+x;
        }
        return x;
       
    }
    
}
/*
 * OUTPUT 1
 * Enter the size of the array
5
Enter the numbers into the array
45
78
1245
34
789
00101101
01001110
10011011
00100010
11000101
Column 5 has highest number of ones.
Column 6 has highest number of ones.
Column 7 has highest number of ones.
Column 8 has highest number of ones.
*/



/*
 * OUTPUT 2
 * Enter the size of the array
4
Enter the numbers into the array
43
9888
756
2
00101011
10011010
10111101
00000010
Column 5 has highest number of ones.
Column 7 has highest number of ones.

 */