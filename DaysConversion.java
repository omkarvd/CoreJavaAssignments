//9. Write a Java program to convert days into years, weeks and days.

import java.util.Scanner;
class DaysConversion
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the days");
		int days=sc.nextInt();
		
		int years=days/365;
		System.out.println("days to years :"+years);
		
		int weeks=days/7;
		System.out.println("days to years :"+weeks);
		
	}
}
