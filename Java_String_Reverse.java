/*Java String Reverse

A palindrome is a word, phrase, number, or other sequence of characters which reads the same backward or forward.(Wikipedia)
Given a string , print Yes if it is a palindrome, print No otherwise.

Constraints

 A will consist at most 50 lower case english letters.
 
Sample Input

madam

Sample Output

Yes


*/

import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        int i;
        String rev ="";
        Scanner sc=new Scanner(System.in);
        String A=sc.next();
        int len=A.length();
        for(i=len-1;i>=0;i--)
        {
            rev=rev+A.charAt(i);


        }
        //System.out.println(rev);
        if(A.equals(rev))
        {
            System.out.println("Yes");
        }
        else
        {
            System.out.println("No");
        }
        /* Enter your code here. Print output to STDOUT. */
        
    }
}
