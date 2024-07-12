/**Create a class named 'Rectangle' with two data members 'length' and 'breadth' and two methods to
print the area and perimeter of the rectangle respectively. Its constructor having parameters for
length and breadth is used to initialize length and breadth of the rectangle. Let class 'Square' inherit
the 'Rectangle' class with its constructor having a parameter for its side (suppose s) calling the
constructor of its parent class as 'super(s,s)'. Print the area and perimeter of a rectangle and a square. */

import java.util.*;
class Square extends Rectangle
{
    public Square(int s)
    {
        super(s,s);   //Calling the constructor of super class
    }
    public Square(int a,int b)
    {
        super(a,b);   //Calling the constructor of super class
    }
    public void display()
    {
        System.out.println("The area is: "+area());
        System.out.println("The perimeter is: "+perimeter());
    }
    public static void main()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("1: Area & Perimeter of a square.");
        System.out.println("2: Area & Perimeter of a rectangle.");
        System.out.println("Enter your choice:");
        int ch=sc.nextInt();
        switch(ch)   //Processing the choice
        {
            case 1:System.out.println("Enter the side length");
                   int s=sc.nextInt();
                   Square s1=new Square(s);
                   s1.display();
                   break;
            case 2:System.out.println("Enter the side lengths");
                   int a=sc.nextInt();
                   int b=sc.nextInt();
                   Square s2=new Square(a,b);
                   s2.display();
                   break;
            default:System.out.println("No match found");
        }
    }
}
/*output
 1: Area & Perimeter of a square.
2: Area & Perimeter of a rectangle.
Enter your choice:
1
Enter the side length
12
The area is: 144
The perimeter is: 48
1: Area & Perimeter of a square.
2: Area & Perimeter of a rectangle.
Enter your choice:
2
Enter the side lengths
10
12
The area is: 120
The perimeter is: 44

 * 
 * 
 */