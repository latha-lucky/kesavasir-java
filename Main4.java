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
class Main4
{
public static void main(String[] args) 
   {
	Inter2 d1=new Inter2();
	System.out.println("x value is" +d1.x);
	d1.demo1();
	System.out.println("y value is"+d1.y);
	d1.test();
    }
}