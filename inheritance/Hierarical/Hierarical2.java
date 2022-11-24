class Baseclass
{
int parentNum=20;
}
class Subclass1 extends Baseclass
{
int childNum1=1;
}
class Subclass2 extends Baseclass
{
int childNum2=2;
}
class Subclass3 extends Baseclass
{
int childNum3=3;
}
class Subclass4 extends Baseclass
{
int childNum4=4;
}
class Hierarical2{
public static void main(String[] args){

Subclass1 A = new Subclass1();
Subclass2 B = new Subclass2();
Subclass3 C = new Subclass3();
Subclass4 D = new Subclass4();

System.out.println( " parentNum * childNum1 = " + A.parentNum * A.childNum1 );
System.out.println( " parentNum * childNum2 = " + B.parentNum * B.childNum2 );
System.out.println( " parentNum * childNum3 = " + C.parentNum * C.childNum3 );
System.out.println( " parentNum * childNum4 = " + D.parentNum * D.childNum4 );
}
}
  