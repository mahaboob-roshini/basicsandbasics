
public class Deprication {
	public static void main(String args[]) {
		long amount,dispercent,year,afterdis,temp;
		amount=100000;
		dispercent=10;
		temp=amount;
		year=3;
		for(int i=0;i<year;i++) {
			temp=((100-dispercent)*temp)/100;
			
		}
		System.out.println("after"+temp);
	}

}
