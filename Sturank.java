
import java.util.*;
public class Sturank  //main class
{
    public static void main()
    {Scanner sc=new Scanner(System.in);
        System.out.println("enter the no. of students");
        int no=sc.nextInt();
        Rank ob=new Rank(no);
        
        ob.display2();//calling method
    }
}
/*OUTPUT:
enter the no. of students
5
Enter the name and ranks of the students  one after another
ddd
2


www
1


qqq
4


gggg
3


rrr
5


The students and their corresponding ranks are as follows:
ddd    -    2
www    -    1
qqq    -    4
gggg    -    3
rrr    -    5
The names of the students in order of their ranks
RANK            NAME
1    www
2    ddd
3    gggg
4    qqq
5    rrr
The Student with the top rank is: www (Rank:1)

 * 
 */