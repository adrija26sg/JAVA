/**
 * A Goldbach number is a positive even integer that can be expressed as the sum of two odd primes.

Note: All even integer numbers greater than 4 are Goldbach numbers.

Example:

6 = 3 + 3
10 = 3 + 7
10 = 5 + 5

Hence, 6 has one odd prime pair 3 and 3. Similarly, 10 has two odd prime pairs, i.e. 3 and 7, 5 and 5.

Write a program to accept an even integer 'N' where N > 9 and N < 50. Find all the odd prime pairs whose sum is equal to the number 'N'.

Test your program with the following data and some random data:

Example 1

INPUT:
N = 14

OUTPUT:
PRIME PAIRS ARE:
3, 11
7, 7
 */

import java.util.Scanner;

public class GoldbachNumber
{
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
        System.out.print("ENTER THE VALUE OF N: ");
        int n = in.nextInt();
        
        if (n <= 9 || n >= 50) {
            System.out.println("INVALID INPUT. NUMBER OUT OF RANGE.");
            return;
        }
        
        if (n % 2 != 0) {
            System.out.println("INVALID INPUT. NUMBER IS ODD.");
            return;
        }
        
        System.out.println("PRIME PAIRS ARE:");
        
        int a = 3;
        int b = 0;
        while (a <= n / 2) {
            b = n - a;
            
            if (isPrime(a) && isPrime(b)) {
                System.out.println(a + ", " + b);
            }
            
            a += 2;
        }
    }
}

/*
 * 
 * output: 
 * 
 * ENTER THE VALUE OF N: 14
PRIME PAIRS ARE:
3, 11
7, 7

 */