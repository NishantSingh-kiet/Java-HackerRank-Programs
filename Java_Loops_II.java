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


/*output1
2 6 14 30 62 126 254 510 1022 2046
8 14 26 50 98   
*/
	
/*output2
6 12 24
0 0 0 0 0
12 24 48 96 192 384 768 1536 3072 6144
*/

