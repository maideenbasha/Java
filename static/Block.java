class Block{
static int a,b,c;
static void print(){
c=a+b;
System.out.println("C="+c);
} 
static{
System.out.println("THIS IS STATIC BLOCK");
}
public static void main(String[] arg)
{
Block.a=3;
Block.b=4;
Block.print();
}
}