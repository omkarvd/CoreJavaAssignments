//1. Write a Java program to check whether a number is negative, positive or zero

import java.util.Scanner;
class CheckNum
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Number");
		int num=sc.nextInt();
		if(num>0)
		{
			System.out.println("Number is positive");
		}
		  else if(num<0)
			{
				System.out.println("Number is negative");
			}
		
		else
		{
			System.out.println("Number is zero");
		}
	}
}