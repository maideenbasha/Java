class Hirarical {
	void meth()
	{
		System.out.println("welcome to the class");
		}
	}
class Multi extends Hirarical{//child1 class
	void func1()
	{
		System.out.println("multilevel oops");
	}

}
	class Base extends Hirarical 
	{
		void func()
		{
			System.out.println("java oops");
		}
		public static void main(String args[])
		{
			Base d=new Base();
			d.meth();
			d.func();
			Multi m =new Multi();
			m.meth();
             m.func1();
		}
	}