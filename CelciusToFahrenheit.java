//7. Write a Java program to enter temperature in °Celsius and convert it into °Fahrenheit.

import java.util.Scanner;
class CelciusToFahrenheit
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter temperature in Celsius");
		float celcius=sc.nextFloat();
		
		float fahrenheit=(celcius*9/5f)+32;
		System.out.println("Celcius to fahrenheit :"+fahrenheit);
	}
}