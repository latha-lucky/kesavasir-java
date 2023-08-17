class Demo
{
   Demo()
   {
   	System.out.println("running demo ()constructor");
   }
}
class Demo1 extends Demo{
	Demo1()
	{
		System.out.println("running demo1 ()constructor");
	}
}
class Demo2 extends Demo1
{
	Demo2()
	{
		System.out.println("running demo2 ()constructor");
	}
}
class Main7
{
	public static void main(String[] args) 
	{
		Demo1 d1=new Demo1();
		System.out.println("=========");
		Demo2 d2=new Demo2();
	}
}