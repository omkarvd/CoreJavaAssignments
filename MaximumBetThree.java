//3. Write a Java program to find maximum between three numbers

import java.util.Scanner;
class MaximumBetThree
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the first Number :");
		int num1=sc.nextInt();
		System.out.println("Enter the Second number :");
		int num2=sc.nextInt();
		System.out.println("Enter the Third number :");
         int num3=sc.nextInt();
		 
		 if(num1>num2 && num1>num3)
		 {
			 System.out.println(" First Number is greater");
	     }
		 else if(num2>num1 && num2>num3)
		 {
			 System.out.println("Second number is greater");
		 }
		 else
		 {
			 System.out.println("Third number is greater");
		 }
	}	
}
