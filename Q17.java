/**Accept n number of city names in an array. Sort them alphabeticaly by bubble sort method with
recursion. And an the sotrted array find a particular name by binary search (with reursion)
method.Display the position number in the arrya if it is found and display proper message if it is not
found.*/
import java.util.*;
public class Q17
{
    private int cap;
    private int[] Qua;
    private int front;
    private int rear;
    public Q17(int c)//constructor
    {
        this.cap = c;
        this.Qua = new int[c];
        front = 0;
        rear = -1;
       
    }

    public void insert(int ag)//to insert elements
    {
        //check if queue is already full
        if(rear== cap-1)
        {
            System.out.println("Queue is full ! Entry is not possible");
            return;
        }
        // for wrapping the queue in case
        //  max size has reached
       
        // increment rear then insert item
        Qua[++rear] = ag;
        System.out.println("Added to queue : " + ag);
        
    }

    public int remove()//to pop elements
    {
        //check if queue is empty
        if((front == -1)||front==cap)
        {
            System.out.println("Queue is empty");
            return (-999);
        }
        
        int temp = Qua[front++];
        
        return temp;
    }

    public void display()//to display elements
    {
        if(front == -1)
        {
            System.out.println("Queue underflow");
        }
        else
        {
            System.out.println("Age of students >12 : ");
            
            for(int i=front;i<=rear;i++)
            {
                if(Qua[i]>12)
                {
                    System.out.print(Qua[i]+"\t");
                }
            }                
            System.out.println();
        }
    }
   
    public static void main()
    {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the maximum number of students that can be input");
        int bl=sc.nextInt();        
        Q17 obn= new Q17(bl);
        int ch=0;
        int k=0;
        while(true)
        {
            System.out.println("Enter 1 for adding a student, 2 for popping a student and 3 to display 4 to exit");
            ch=sc.nextInt();//Variable for switch case
           switch(ch)
           
            {case 1:
                System.out.println("Enter the age of the student to be added");
                int el=sc.nextInt();
                obn.insert(el);
                
                break;
            
            
            case 2:
               int t=obn.remove();
            if (t==-999)
                {
                  System.out.println("Underflow!");  
                }
                else
                {
                System.out.println(t+" Successfully removed");
                
            }
            break;
            
            case 3:
            {
               obn.display();
               break;
            }
            case 4:
            System.exit(0);
        }
        }
        
    }
}
/*output
 Enter the maximum number of students that can be input
5
Enter 1 for adding a student, 2 for popping a student and 3 to display 4 to exit
1
Enter the age of the student to be added
12
Added to queue : 12
Enter 1 for adding a student, 2 for popping a student and 3 to display 4 to exit
1
Enter the age of the student to be added
14
Added to queue : 14
Enter 1 for adding a student, 2 for popping a student and 3 to display 4 to exit
1
Enter the age of the student to be added
15
Added to queue : 15
Enter 1 for adding a student, 2 for popping a student and 3 to display 4 to exit
1
Enter the age of the student to be added
12
Added to queue : 12
Enter 1 for adding a student, 2 for popping a student and 3 to display 4 to exit
3
Age of students >12 : 
14    15    
Enter 1 for adding a student, 2 for popping a student and 3 to display 4 to exit
2
12 Successfully removed
Enter 1 for adding a student, 2 for popping a student and 3 to display 4 to exit
3
Age of students >12 : 
14    15    
Enter 1 for adding a student, 2 for popping a student and 3 to display 4 to exit
2
14 Successfully removed
Enter 1 for adding a student, 2 for popping a student and 3 to display 4 to exit
3
Age of students >12 : 
15    
Enter 1 for adding a student, 2 for popping a student and 3 to display 4 to exit
4

 */