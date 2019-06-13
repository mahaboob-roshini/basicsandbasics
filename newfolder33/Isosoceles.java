import java.math.*;
import java.util.Scanner; 
public class Isosoceles {
	public static void main(String args[]) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the a value");
		double a=sc.nextDouble();
		System.out.println("enter the b value");
		double b=sc.nextDouble();
		double area=(b/4)*Math.sqrt((4*a*a)-(b*b));
		System.out.println("area is"+area);
		
	}
	


}
