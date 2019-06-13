import java.util.Scanner;
class Hcf
{
    public static void main(String arg[])	
	{
	 long n1,n2;
	 Scanner sc=new Scanner(System.in);
	 System.out.println("Enter  number 1");
                n1=sc.nextLong();
             	 System.out.println("Enter  number 2");
                n2=sc.nextLong();
	 long result=hcfCal(n1,n2);
     	 System.out.println("Hcf of two numbers = "+result);
}
static long hcfCal(long n1,long n2)
  { long temp;
    while ( n2> 0)
    {
        temp =n2;
       n2 = n1 % n2; 
        n1= temp;
    }
    return n1;
   }
}