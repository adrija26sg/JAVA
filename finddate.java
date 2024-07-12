/*
Accept the 1st day of any year along with the year.Find out which day will be 15th August in the 
year. 
*/

import java.util.*;
class finddate
{
   
    public static boolean leapyear(int year) 
    {
        if (year % 4 == 0) 
        {
           
     if (year % 100 == 0) // if the year is century
      {

        
        if (year % 400 == 0)
        return true;
        else
        return false;
    }
    else
    return true;
}
    else
    return false;
}
        public static void main()
{
    Scanner sc = new Scanner(System.in);int i,d1=0,d2=0,dayno;
    
    System.out.print("Enter the YeaR who want to search in ! :-");
    int yr = sc.nextInt();
    System.out.print(" Enter the 1st day of the year :-");
    String fd = sc.next();
    
    String days[] = {"Monday","Tuesday","Wednesday","Thursday","Friday","Saturday","Sunday"};
    int n[] = {1,2,3,4,5,6,7};
    
    if(leapyear(yr))// to check for leap year
    {
        for(i=0;i<7;i++)
        {
            if(fd.equalsIgnoreCase(days[i]))
          { 
              d1=i;
              
            }
        }
       dayno = n[d1]+3;
        for(i=0;i<7;i++)
        {
        if(n[i]==dayno)
        {
            d2 = i;
        }
     }
     System.out.println("15th August falls on:-"+days[d2]);
     }
    else
    {
        for(i=0;i<7;i++)
        {
            if(fd.equalsIgnoreCase(days[i]))
          {
              d1=i;
            }
        }
       dayno = n[d1]+2;
        for(i=0;i<7;i++)
        {
        if(n[i]==dayno)
        {
            d2 = i;
        }
     }
      System.out.println("15th August:-"+days[d2]);
    }
   
}
}

/* OUTPUT 1
 * Enter the YeaR who want to search in ! :-2016
 Enter the 1st day of the year :-23
15th August falls on:-Thursday

 */


/* OUTPUT 2
 * Enter the YeaR who want to search in ! :-1900
 Enter the 1st day of the year :-1
15th August:-Wednesday

 */