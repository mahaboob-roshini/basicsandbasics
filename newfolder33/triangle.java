
 class Demo {
	
		int b=10;
		int h=5;
		double trianglearea;
		void area()
		{
			trianglearea=(0.5*b*h);
			System.out.println("the area"+trianglearea);
		}
}
 public	class triangle
	{
		public static void main(String args[]){
			Demo t=new Demo();
			t.area();
		}
	}


