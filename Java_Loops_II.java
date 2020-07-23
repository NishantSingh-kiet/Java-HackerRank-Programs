/*Java Hacker Rank Program  Java Loops II

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

