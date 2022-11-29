class Method{
static int a,b,c;
static void print(){
c=a+b;
System.out.println("C="+c);
}
public static void main(String[] arg)
{
Method.a=3;
Method.b=4;
Method.print();
}
}