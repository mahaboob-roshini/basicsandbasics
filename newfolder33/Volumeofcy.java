import java.util.Scanner;
public class Volumeofcy {
	public static void main(String args[]) {
		Scanner s=new Scanner(System.in);
		System.out.println("enter the radius");
		double r=s.nextDouble();
		System.out.println("enter the height");
		double h=s.nextDouble();
		double volumeofcy=((22*r*r*h)/7);
		System.out.println("volume is"+volumeofcy);
	}

}











