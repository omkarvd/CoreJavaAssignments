//BMI
import java.util.Scanner;
class BmiCal{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter height in foot");
		double height=sc.nextDouble();
 height=height*30.48;
		System.out.println("Enter the weight");
		double weight=sc.nextDouble();
		
		double bmi=weight/(height*height);
		System.out.println("BMI :"+bmi);
		
	}
	
}
