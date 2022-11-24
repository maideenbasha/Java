
class Multilevel {
	void meth()
	{
		System.out.println("welcome to the class");
		}
	}
class Single1 extends Multilevel{//child1 class
	void func1()
	{
		System.out.println("multilevel oops");
	}

}
	class Child1 extends Single1 
	{
		void func()
		{
			System.out.println("java oops");
		}
		public static void main(String args[])
		{
			Child1 d=new Child1();
			d.meth();
			d.func();
             d.func1();
		}
	}

