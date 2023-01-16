//1. Write a Java program to check whether a year is leap year or not
import java.util.Scanner;
class CheckLeapYear
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the year :");
		int year=sc.nextInt();
		
		if(year%400==0)
		{
			System.out.println("Year is leap year :");
		}
		else if(year%100==0)
		{
			System.out.println("Not leap :");
		}
		else if(year%4==0)
		{
			System.out.println("Leap :");
	    }
		else
		{
			System.out.println("Not leap");
		}
		
	}
	
}
