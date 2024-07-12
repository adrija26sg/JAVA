/**
 * A MOBIUS function M(N) returns the value -1 or 0 or 1 for a natural number (N) by the following conditions are defined :
When,
M ( N ) = 1 if N=1.
M ( N ) = 0 if any prime factor of N is contained more than once.
M ( N ) = ( -1 )P if N is the product of ‘P’ distinct prime factors.

Write a program to accept a positive natural number (N) and display the MOBIUS result with proper message. Design your program which will enable the output in the format given below:

Sample 1
INPUT:78
OUTPUT: 78 = 2 x 3 x 13
NUMBER OF DISTINCT PRIME FACTORS = 3
M(78) = -1

 */

import java.util.Scanner;

public class mobifunc{
       public static void main() {
       String N;
       Scanner in = new Scanner(System.in);
       boolean integerFlag;
       do {
              integerFlag = true;
              System.out.println("Enter a positive integer");
              N = in.nextLine();
              for(int i=0; i< N.length();i++)
                     if(!Character.isDigit(N.charAt(i))){
                            integerFlag = false;
                            System.out.println("You must enter an integer:");
                            break;
                     }
       }while(!integerFlag);
       in.close();        
       Mobius obj = new Mobius(Long.parseLong(N));
       if(obj.isPrime(Long.parseLong(N)) || Long.parseLong(N) == 1 ) {
              if (Long.parseLong(N)==1)
                     System.out.println("Number of distinct prime factors:"+"0");
              else
                     System.out.println("Number of distinct prime factors:"+"1");
              System.out.println("Prime Factorisation of "+Long.parseLong(N)+"="+Long.parseLong(N));
              System.out.println("Mobius("+Long.parseLong(N)+")="+"1");
              }
       else {
              System.out.println("Prime Factorisation of "+Long.parseLong(N));
              obj.primeFactorization();
              System.out.println();
              System.out.println("Mobius("+Long.parseLong(N)+")="+obj.mobiusCalculation());
              }
       }
}
class Mobius{
       public  int mobiusCalculation(){
              boolean indexFlag = true;
              if (number == 1)
                     return 1;
              else {
                     for(int i=0; i<numberOfPrimeFactors; i++)
                            if(primeIndex[i] > 1)
                                   indexFlag = false;       
                     if(!indexFlag)                       
                            return 0;
                     else   
                            return ((int)Math.pow((-1),numberOfPrimeFactors));
              }
       }
       public void primeFactorization() {
              int index=0;
              long tempNumber;
              System.out.println("Number of distinct prime factors:"+numberOfPrimeFactors);
              // finding the prime factors
              for(int i = 2; i<=(int)(number/2);i++)
                     if(number%i == 0 && isPrime(i))
                            primeFactors[index++] = i;
              // finding the powers of prime factors              
              tempNumber = number;
              for(int i=0; i<numberOfPrimeFactors; i++){
                     index = 0;
                     do {
                        index++;
                        tempNumber /= primeFactors[i];                                       
                     }while(tempNumber%primeFactors[i]==0);
                     primeIndex[i]=index;
              } 
              // printing the prime factorsiation
              for(int i = 0; i<numberOfPrimeFactors; i++)
                     if(i < numberOfPrimeFactors-1)
                            System.out.print(primeFactors[i]+"^"+primeIndex[i]+"*");
                     else
                            System.out.print(primeFactors[i]+"^"+primeIndex[i]);
       }
       private int numberOfPrimeFactorsMethod(long number) {
              int counter = 0;
              for(int i = 2; i<=(int)(number/2);i++)
                     if(number%i == 0 && isPrime(i)) 
                            counter++;  
              return (counter);
       }
       public boolean isPrime(long numb){
              boolean primeFlag = true;
              for(int i = 2; i<=(int)(numb/2);i++){
                     if(numb%i == 0) {
                            primeFlag = false;
                            break;
                     }
              }
              return (primeFlag);
       }
       Mobius(long N){
              this.number = N;
              this.numberOfPrimeFactors = numberOfPrimeFactorsMethod(number);
              this.primeFactors = new int[this.numberOfPrimeFactors];
              this.primeIndex = new int[this.numberOfPrimeFactors]; 
       }
       private long number;
       private int numberOfPrimeFactors;
       private int[] primeFactors;
       private int[] primeIndex;       
}


/*
 * output:
 * Enter a positive integer
12
Prime Factorisation of 12
Number of distinct prime factors:2
2^2*3^1
Mobius(12)=0

 */