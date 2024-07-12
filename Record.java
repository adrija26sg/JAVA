
import java.util.*;
public class Record extends Sturank
{
     String name[];
    int rnk[];
      int n;
    static Scanner sc= new Scanner(System.in);
    
     Record(int num)//constructor
    {n=num;
      name=new String[n];
      rnk=new int[n];
    }
    
    void readvalues()//to accept the students and their ranks from the user in two seperate arrays
    {
        
        System.out.println("Enter the name and ranks of the students  one after another");
        for(int i=0; i<n; i++)
        {   name[i]=sc.next()+sc.nextLine();   
           rnk[i]= sc.nextInt();
           
            System.out.println("\n");
        }
       
    }
    
    void display()//to display the names of the students and their ranks as entered by the user
    {
        System.out.println("The students and their corresponding ranks are as follows:");
        for(int i=0; i<n;i++)
        {
            System.out.println(name[i]+"\t-\t"+rnk[i]);
        }
    }
}
    