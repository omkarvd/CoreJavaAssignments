//6. Write a Java program to enter length in centimeter and convert it into meter and kilometer.
import java.util.Scanner;
class CentimeterConversion
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter length in centimeter");
		float centimeter=sc.nextFloat();
		
		float meter=centimeter/100;
		System.out.println("Centimeter to meter :"+meter);
		
		float kilometer=centimeter/10000;
		System.out.println("Centimeter to kilometer :"+kilometer);
		
	}
}




