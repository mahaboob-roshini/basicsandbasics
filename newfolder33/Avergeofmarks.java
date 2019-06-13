
public class Avergeofmarks {
	public static void main(String args[]) {
		int n=5  ,avg=0;
		int a[]=new int[n];
		a[0]=10;
		a[1]=20;
		a[2]=30;
		a[3]=40;
		a[4]=25;
		for(int i=0;i<n;i++) {
			avg=avg+a[i];
		}
		System.out.println("avg"+avg/n);
	}

}
