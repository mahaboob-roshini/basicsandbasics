
public class Electricbill {
	public static  void main(String args[]) {
		int units=500;
		double billpay=0;
		if(units<100)
		{
			 billpay=units*1.20;
		}
		else if(units<300) {
			 billpay=100*1.20+(units-100)*2;
		}
		else if(units>300) {
			 billpay=100*1.20+200*2+(units-300)*3;
		}
		System.out.println("bill is"+billpay);
	}
	
	

}
