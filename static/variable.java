class variable{
static int a,b,c;
void print(){
c=a+b;
System.out.println("C="+c);
}
public static void main(String[] arg)
{
variable.a=3;
variable.b=4;
variable v = new variable();
v.print();
}
}