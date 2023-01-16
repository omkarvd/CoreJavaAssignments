//10. Write a Java program to find power of any number x ^ y.

import java.util.Scanner;
class PowerOfNumber{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the any number");
		int number=sc.nextInt();
		
		System.out.println("enter the exponent");
		int exponent=sc.nextInt();
		
		double power=Math.pow(number,exponent);
		System.out.println("Power of number is :"+power);
		
	}
}













