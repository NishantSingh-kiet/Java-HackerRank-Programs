/*Addition of two number*/

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
