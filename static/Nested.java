class Nested{
static int a,b,c;
static void print(){
c=a+b;
System.out.println("C="+c);
} 
static{
System.out.println("THIS IS STATIC BLOCK");
}
static class A{
void display(){
System.out.println("THIS IS NESTED CLASS");
}
} 
public static void main(String[] arg)
{
Nested.a=3;
Nested.b=4;
Nested.print();
Nested.A  s=new Nested.A();
s.display();
}
}