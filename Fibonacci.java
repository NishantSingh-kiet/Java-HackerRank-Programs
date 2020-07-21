/*Fibonacci series*/
import java.util.*;
public class Fibonacci{
    public static void main(String[] args){
         int i,n,a=0,b=0,sum=1;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter number of terms");    
        n=sc.nextInt();
       System.out.println("Fibonacci series:");
        for(i=1;i<=n;i++)
        {
			a=b;
			b=sum;
            sum=a+b;
            System.out.println(a+"");
        }
    }
}

/*output

Enter number of terms
10
Fibonacci series: 0 1 2 3 5 8 13 21 34

*/
