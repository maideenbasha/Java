
public class Single {
void meth()
{
	System.out.println("welcome to the class");
	}
}
class Child extends Single
{
	void func()
	{
		System.out.println("java oops");
	}
	public static void main(String args[])
	{
		Child d=new Child();
		d.meth();
		d.func();
	}
}