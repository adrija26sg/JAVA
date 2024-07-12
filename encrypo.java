/**
 *  simple encryption system uses a shifting process to hide a message. The value of the shift can be in the range of 1 to 26. For example a shift of 7 means that A=U, B=V, C-W, etc. i.e.,
Text :     A B C D E F G H I J K L M N O P Q R S T U V W X Y Z
CODE : U V W X Y Z A B C D E F G H I J K L M N O P Q R S T

First an extra space is added to the end of the string. To make things a little more difficult, space within the original text are replaced with QQ before the text is encrypted. Double Q(QQ) was selected because no English word ends in Q or contains QQ.

Additionally the coded message is printed in blocks of six characters separated by spaces. The last block might not contain six characters. Write a program that takes the coded text (less than 100 characters.) the shift value and prints the decoded original text. Tour program must reject any non valid value for shift and display an error message “INVALID SHIFT VALUE”. Assume all characters are upper-case. Test your program for the following data and some data that you have coded, using rules given above:

INPUT :
CODED TEXT :  UHINBY LKKQCH HYLKK
SHIFT : 7
OUTPUT   DECODED TEXT : ANOTHER WINNER 

INPUT :  CODED TEST: RUIJGG EVGGBK SAGG
SHIFT : 11
OUTPUT   DECODED TEXT : BEST OF LUCK 

 */

import java.util.*;
public class encrypo {
       public static void main() {
             String msg;
             int shift;
             Scanner in = new Scanner(System.in);
             System.out.println("INPUT CODED TEXT:");
             msg = in.nextLine();
             do {
             System.out.println("Enter the shift key:");
             shift = in.nextInt();
             if(shift <1 || shift > 26)
                   System.out.println("Invalid shift key, input again:");
             }while(shift <1 || shift > 26);
             decryption obj = new decryption(msg.toUpperCase(),shift);
             System.out.println("OUTPUT:");
             obj.decryptionProcess();
             in.close();
             }
}

class decryption {
public void decryptionProcess() {
       //removing spaces in encrypted message, since original word seperator is QQ
       removeSpacesInCodedText();
       //extract word separated by QQ
       int i,j;
       String s;
       for(i=0;i<text_to_decrypt.length()-2;i++) {
             s="";
             for(j=i;j<text_to_decrypt.length()-2;j++) {
                    if(shiftPlaces(text_to_decrypt.charAt(j+1),key)!='Q' && shiftPlaces(text_to_decrypt.charAt(j+2),key)!='Q') {
                          s+=text_to_decrypt.charAt(j);
                          }
                    else {
                          s+=text_to_decrypt.charAt(j);
                          s +=text_to_decrypt.charAt(j+1);
                          j=j+3;
                          i=j;
                          break;
                          }
                    }
             //decoding the message
             for(int l=0;l<s.length();l++)
                    System.out.print(shiftPlaces(s.charAt(l),key));
             System.out.print(" ");
             }
 }
private void removeSpacesInCodedText() {
             String temp="";
             for(int i=0;i<text_to_decrypt.length();i++) {
                    if(text_to_decrypt.charAt(i)==' ')
                          continue;
                    else
                          temp = temp+text_to_decrypt.charAt(i);
                    }
             text_to_decrypt = temp;
             }
private char shiftPlaces(char c,int key) {
       c=(char)(c+key > 90 ? (65+(c+key)%90-2):c+key-1);
       return c;
    }

decryption(String msg,int shift){
       text_to_decrypt = msg;
       key = shift;
       }
private int key;
private String text_to_decrypt;
}

/*
 * INPUT CODED TEXT:
RUIJGG EVGGBK SAGG
Enter the shift key:
11
OUTPUT:
BEST OF LUCK 
 */