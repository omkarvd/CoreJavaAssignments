//8. Write a Java program to enter temperature in Fahrenheit(°F) and convert it into Celsius(°C)

import java.util.Scanner;
class FahrenheitCelcius
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter temperature in fahrenheit");
		float fahrenheit=sc.nextFloat();
		
		float celcius=(fahrenheit-32)*5/9;
		System.out.println(" fahrenheit to celcius :"+celcius);
	}
}