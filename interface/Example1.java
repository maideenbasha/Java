interface A{
void a();
void b();
void c();
void d();
}
abstract class B implements A{
public void c(){
System.out.println( " I AM C " );
}
}
class M extends B{
public void a(){
System.out.println( " I AM A " );
}
public void b(){
System.out.println( " I AM B " );
}
public void d(){
System.out.println( " I AM D ");
}
}
class Example1{
public static void main(String[] args){
A a = new M();
a.a();
a.b();
a.c();
a.d();
}
}