
/**(10)Often, we hear commercials give out their numbers with phrases.When we press for the phrases on the keypad, we are indirectly translating the phrases into numbers. Now, we want to know
what are the actual numbers based on a typical keypad.The input contains one phone number string s. You can assume that the input is perfectly formed (dashed separators always provided, number 
starts with 1,and no illegal characters are given). Thus, you do not need to perform any specific validation checks on the input, in order to make your program simpler.However, please note that
the number of dashed separators and their positions in the input phone numbers could be different.
*/
import java.util.*;
public class commer_tv
{
    public static void main ()
    {
        Scanner sc= new Scanner (System.in);
        System.out.println("Enter your message for numerical translation\n(Capital letters and numbers and #*- only):");
        String str= sc.nextLine();//to accept the message from the user
        System.out.println("Your input: \n"+str );// to print the input of the user
        String match[] = {"ABC","DEF", "GHI","JKL","MNO","PQRS","TUV","WXYZ","1234567890#*-"};//array which contains the characters in order of their numerical values
        int l= str.length();//checks the length of the above array
        char ch;String s;
        System.out.println("The Numerical Translation:");
        //printlng the numerical translation of the input
        for(int i=0; i<l; i++)
        {
            ch=str.charAt(i);//The character of the input is getting extracted
            for(int k=0; k<9;k++)
            {
                s=match[k];//extracts the elements of the array match[] one by one to find the matching candidate of the character extracted in ch
                if((s.indexOf(ch)!=-1)&&(k<8))//checks if the character is present in a particular member of array match[] is a character
                {
                    //the character's numerical equivalent is printed by adding 2(1(for array index+1)+ 1(since the original position of the charater is 1 place above the assigned position on match[])) 
                    System.out.print(k+2);
                }
                if((s.indexOf(ch)!=-1)&&(k==8))//checks if the character is present in a particular member of array match[] is a digit
                {
                    System.out.print(ch);//digit is printed as it is
                }
            }
        }
    }
}
/*OUTPUT(1):
Enter your message:
1-800-CALL-NOW
Your input: 
1-800-CALL-NOW
The Numerical Translation:
1-800-2255-669

OUTPUT(2):
Enter your message:
1-800-AIRLINE
Your input: 
1-800-AIRLINE
The Numerical Translation:
1-800-2475463
*/
        
                
            
        