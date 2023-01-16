import java.util.Scanner;
class Divisibility
{
	public static void main(String[] a)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the first number");
		int num1=sc.nextInt();
		System.out.println("enter the second number");
		int num2=sc.nextInt();
		
		if(num1/num2%2==0)
		{
			
			System.out.println("even");
		}
		else
		{
			System.out.println("odd");
		}
	}
	
	
}