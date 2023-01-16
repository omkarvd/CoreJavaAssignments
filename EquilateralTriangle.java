//1. Write a Java program to calculate area of an equilateral triangle.

import java.util.Scanner;
class EquilateralTriangle{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the side");
		double side=sc.nextDouble();
	double area=(Math.sqrt(3)/4)*(side*side);
		System.out.println(area);
		
	}
	
}


