class Demo
{
	int x=10;
	int y=20;
	static Demo a;
	static void show()
	{
		Demo d2 = new Demo();
		display();
	}
	static void display()
	{
		Demo d3 = new Demo();
	}
	public void finalize()throws Throwable
	{
		System.out.println("jawan Saheed");
		a=this;
	}
}

class Temp5 extends Demo
{
	public static void main(String ...s)
	{
		Demo d=new Demo();
		show();
		d.finalize();
		
		
	}
}