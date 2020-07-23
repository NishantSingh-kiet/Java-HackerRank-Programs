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
public class Scan {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num1,num2,sum;
    //Scanner is used to take input from keyboard
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter number1");
		num1=sc.nextInt();
		System.out.println("Enter number2");
		num2=sc.nextInt();
		sum=num1+num2;
		System.out.println("Addition of two numbers:"+sum);
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
