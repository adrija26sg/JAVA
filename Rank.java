
import java.util.*;
public class Rank extends Record//using extends to inherit class record
{
    int index;
    Rank(int num)//constructor
    {super(num);
        readvalues();
        this.index=0;
    }

       void display2()//to display the names of the students in order of their ranks
    {  display();
        for(int i=0;i<n-1;i++)//using bubble sort technique to sort the array of students accordin to their ranks
        {
            for(int j=0; j< n-i-1; j++)
            {
                if(rnk[j]>rnk[j+1])
                {
                    int temp1=rnk[j];
                    String temp2= name[j];
                    rnk[j]=rnk[j+1];
                    name[j]=name[j+1];
                    rnk[j+1]=temp1;
                    name[j+1]= temp2;
                }
            }
        }

        System.out.println("The names of the students in order of their ranks");
        System.out.println("RANK\t\t\tNAME");

        for(int i=0;i<n;i++)//printing the names of the srudents in order of their ranks
        {
            System.out.println(rnk[i]+"\t"+name[i]);            
        }

        System.out.println("The Student with the top rank is: "+name[0]+" (Rank:"+(rnk[0])+")");
    }
}