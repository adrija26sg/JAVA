
/**Find the elements which are occurring more than once .Remove the 1st occurrence of each item.*/
import java.util.*;

class find_ele {
    public static void main() {
        Scanner sc = new Scanner(System.in);// calling Scanner class
        int l, i, j, n, f;
        System.out.println("Enter the length of the Array");// accepting the length of the array as user input
        l = sc.nextInt();
        String ar[] = new String[l];
        System.out.println("Enter the elements of the Array(digits and characters to be used only) :");// to get the
                                                                                                       // elements of
                                                                                                       // the array as
                                                                                                       // user input
        for (i = 0; i < l; i++) {
            ar[i] = sc.next();
        }
        System.out.println("The entered Array :");// to print the array that has just been entered
        for (i = 0; i < l; i++) {
            System.out.print(ar[i] + " ");
        }

        for (i = 0; i < l; i++) {
            String t = ar[i];
            f = 0;
            if (t.charAt(0) == '*')// in case the first character of the entered element is *
            {
                continue;// omit the element
            } else {
                for (j = 0; j < l; j++) {
                    if (ar[j].compareTo(t) == 0)// when another element is same as t
                    {
                        f++;// counting the number of times it has repeated
                        if (f > 1) {

                            ar[j] = "*" + ar[j];// inserting * in front of the repeated elemnt to indicate that it has
                                                // been repeated and has already been checked

                        } else {
                            continue;// in case it is the first occurance of the element
                        }
                    }
                    if (j == (l - 1) && f > 1)// to change the first element with '*' sign in the final iteration
                    {
                        ar[i] = "*";
                    }

                }
            }
        }

        System.out.println("\nArray with the first occurance of repeated elements removed :");// to print the array
                                                                                              // without the first
                                                                                              // element of the repeated
                                                                                              // element

        for (i = 0; i < l - 1; i++) {
            if (ar[i].equals("x")) {
                l = l - 1;
                for (j = i; j < l; j++) {
                    ar[j] = ar[j + 1];
                }
            }
        }

        System.out.println("Array with deleted ISt occurence of Duplicate Elements :");
        for (i = 0; i < l; i++) {
            if (ar[i].charAt(0) == '*')
                ar[i] = ar[i].substring(1);
        }
        for (i = 0; i < l; i++) {
            System.out.println(ar[i]);
        }
    }
}

/*
 * Enter the length of the Array
 * 7
 * Enter the elements of the Array(digits and characters to be used only) :
 * 5
 * 2
 * 3
 * 4
 * 5
 * 2
 * 6
 * The entered Array :
 * 5 2 3 4 5 2 6
 * Array with the first occurance of repeated elements removed :
 * Array with deleted ISt occurence of Duplicate Elements :
 * 
 * 
 * 3
 * 4
 * 5
 * 2
 * 6
 * 
 */