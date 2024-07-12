/**Twins primes are consecutive prime numbers whose difference is 2. For example, (3,5), (11,13),
(17,19) are all twin primes. We define the distance of any twin prime pair from a positive integer as
follows. If (p1, p2) is a twin prime pair and n is a positive integer then the distance of the twin
prime from n is: minimum(abs(n-p1), abs(n-p2)) where abs returns the absolute value of its
argument, and minimum returns the smaller of its two arguments. Write a program that reads in a
positive integer n and prints out the twin prime pair that has the least distance from n. For example
if n is 30 the pair is (29,31), if n is 13 it is (11,13), if n is 49 it is (41,43). If n is 54 it is (59,61).
Sample data: Input: Give the number : 34
Output: Number read in is : 34
Pl=29 p2=31
Input: Give the number : 60
Output: Number read in is 60 Pl=59 p2=61*/

import java.util.Scanner;

public class twin_prime
{
    static boolean primeCheck(int num) {
        boolean isPrime = true;
        if (num <= 1)
            return false;
        
        for (int i = 2; i <= num / 2; i++) {
            if (num % i == 0) {
                isPrime = false;
                break;
            }
        }
        
        return isPrime;
    }
    
    static void printResult(int n, int p1, int p2) {
        System.out.println("Number read in is " 
                                + n + "\tp1 = " 
                                + p1 + ", p2 = " 
                                + p2);
    }
    
    public static void main() {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = in.nextInt();
        
        /*
         * First check if the number itself is prime
         * and forms a twin prime pair with a number
         * at distance 2 on either side. For example,
         * if n is 13 then (11, 13) forms a twin 
         * prime pair at least distance from 13
         */
        boolean res1 = primeCheck(n);
        if (res1) {
            boolean res2 = primeCheck(n - 2);
            if (res2) {
                printResult(n, n - 2, n);
                return;
            }
            
            boolean res3 = primeCheck(n + 2);
            if (res3) {
                printResult(n, n, n + 2);
                return;
            }
        }
        
        /*
         * After that check if the number falls between
         * a twin prime pair. For example, if n is 12
         * then twin prime pair at least distance is
         * (11, 13)
         */
        if (primeCheck(n - 1) && primeCheck(n + 1)) {
            printResult(n, n - 1, n + 1);
            return;
        }
        
        /*
         * Find a twin prime pair towards left
         */
        int l1 = 0, l2 = 0;
        for (int i = n - 1; i >= 5; i--) {
            if (primeCheck(i) && primeCheck(i - 2)) {
                l1 = i - 2;
                l2 = i;
                break;
            }
        }
        
        /*
         * Find a twin prime pair towards right
         */
        int r1 = 0, r2 = 0;
        for (int i = n + 1; i < Integer.MAX_VALUE - 2; i++) {
            if (primeCheck(i) && primeCheck(i + 2)) {
                r1 = i;
                r2 = i + 2;
                break;
            }
        }
    /*
         * Find the twin prime pair with minimum distance
         */
        if (l1 != 0 && l2 != 0 && r1 != 0 && r2 != 0) {
            int lDist = Math.min(Math.abs(n - l1), Math.abs(n - l2));
            int rDist = Math.min(Math.abs(n - r1), Math.abs(n - r2));
            if (lDist < rDist)
                printResult(n, l1, l2);
            else
                printResult(n, r1, r2);
        }
        else if (l1 != 0 && l2 != 0) {
            printResult(n, l1, l2);
        }
        else if (r1 != 0 && r2 != 0) {
            printResult(n, r1, r2);
        }
    }
}
/* output
 * Enter a number: 60
Number read in is 60	p1 = 59, p2 = 61

 */
