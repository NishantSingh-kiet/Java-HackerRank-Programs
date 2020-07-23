/*Java Hacker Rank Program  Java Loops II*/
/*Addition of two number*/
/*
Input Format
The first line contains an integer,q , denoting the number of queries.
Each line i of the q subsequent lines contains three space-separated integers describing the respective ,a ,b and n values for that query.
Output Format
For each query, print the corresponding series on a new line. Each series must be printed in order as a single line of n space-separated integers.
*/

/* Input1
2
0 2 10
5 3 5
*/
/*Input 2
3
3 3 3
0 0 5
6 6 10
*/

import java.util.*;
import java.io.*;

class Solution{
   
    public static void main(String []argh){
      //   int m,result=0;
        Scanner in = new Scanner(System.in);
        int t=in.nextInt();
           for(int i=0;i<t;i++){
        int result=0;
            int a = in.nextInt();
            int b = in.nextInt();
            int n = in.nextInt();
           
          for(int m=0;m<n;m++){
           if(m==0){
                        result = result + (a + (int)Math.pow(2,m) * b);
                    }
                    else{
                        result = result + ((int)Math.pow(2,m) * b);
                    }
              System.out.print(result+" ");
          }
          System.out.printf("%n");
    }
        in.close();
    }
}

