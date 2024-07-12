/** 
 * A Prime-Adam integer is a positive integer (without leading zeros) which is a prime as well as an Adam number.

Prime number: A number which has only two factors, i.e. 1 and the number itself.

Example: 2, 3, 5, 7 ... etc.

Adam number: The square of a number and the square of its reverse are reverse to each other.

Example: If n = 13 and reverse of 'n' = 31, then,

(13)2 = 169

(31)2 = 961 which is reverse of 169

thus 13, is an Adam number.

Accept two positive integers m and n, where m is less than n as user input. Display all Prime-Adam integers that are in the range between m and n (both inclusive) and output them along with the frequency, in the format given below:

Test your program with the following data and some random data:

Example 1

INPUT:
m = 5
n = 100

OUTPUT:
THE PRIME-ADAM INTEGERS ARE:
11 13 31
FREQUENCY OF PRIME-ADAM INTEGERS IS: 3
 */

import java.util.*;

public class PrimeAdam
{
    public static int reverse(int num) 
    {
        int rev = 0;
        
        while (num != 0) {
            int d = num % 10;
            rev = rev * 10 + d;
            num /= 10;
        }
        
        return rev;
    }
    
    public static boolean isAdam(int num) {
        int sqNum = num * num;
        int revNum = reverse(num);
        int sqRevNum = revNum * revNum;
        int rev = reverse(sqNum);
        
        return rev == sqRevNum;
    }
    
    public static boolean isPrime(int num) {
        int c = 0;
        
        for (int i = 1; i <= num; i++) {
            if (num % i == 0) {
                c++;
            }
        }
        
        return c == 2;
    }
    
    public static void main() {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the value of m: ");
        int m = in.nextInt();
        System.out.print("Enter the value of n: ");
        int n = in.nextInt();
        int count = 0;
        
        if (m >= n) {
            System.out.println("INVALID INPUT");
            return;
        }
        
        System.out.println("THE PRIME-ADAM INTEGERS ARE:");
        for (int i = m; i <= n; i++) {
            boolean adam = isAdam(i);
            if (adam) {
                boolean prime = isPrime(i);
                if (prime) {
                    System.out.print(i + " ");
                    count++;
                }
            }
        }
        
        if (count == 0) {
            System.out.print("NIL");
        }
        
        System.out.println();
        System.out.println("FREQUENCY OF PRIME-ADAM INTEGERS IS: " + count);
    }
}

/*
 * output:
 * Enter the value of m: 5
Enter the value of n: 100
THE PRIME-ADAM INTEGERS ARE:
11 13 31 
FREQUENCY OF PRIME-ADAM INTEGERS IS: 3

 */