class Demo
{
   Demo()
   {
   	System.out.println("running demo ()constructor");
   }
}
class Demo1 extends Demo
{
	Demo1(int arg1)
	{
		System.out.println("running demo1 ()constructor");
		System.out.println("arg1 vaule is"+arg1);
	}
}
class Demo2 extends Demo1
{
	Demo2()
	{   
		super(arg1:4);
		System.out.println("running demo2 ()constructor");
	}
}
class Main7
{
	public static void main(String[] args) 
	{
	
		Demo2 d2=new Demo2();
	}
}