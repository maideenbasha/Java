class Nested1{
static int a,b,c;
static void print(){
c=a+b;
System.out.println("C="+c);
} 
static{
System.out.println("THIS IS STATIC BLOCK");
}
static class A{
static void display(){
System.out.println("THIS IS NESTED CLASS");
}
} 
public static void main(String[] arg)
{
Nested1.a=3;
Nested1.b=4;
Nested1.print();
Nested1.A.display();
}
}