class Inter
{  
	int x=10;
	void demo1()
	{
		System.out.println("running demo1()method");
	}
}
class Inter2 extends Inter
{
	int y=20;
	void test()
	{
		System.out.println("running test()method");
	}

}
class Inter3 extends Inter2
{
	int z=30;
	void dis()
	{
		System.out.println("running dis()method");
	}
}
class Main5
{
public static void main(String[] args) 
   {
	Inter3 d2=new Inter3();
	System.out.println("x value is" +d2.x);
	d2.demo1();
	System.out.println("y value is"+d2.y);
	d2.test();
	System.out.println("z value is"+d2.z);
	d2.dis();
    }
}