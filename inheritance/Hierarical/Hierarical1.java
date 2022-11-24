class A{
void print(){
System.out.println("A");
}
}
class B extends A{
void print1(){
System.out.println("B");
}
}
class C extends A{
void print2(){
System.out.println("C");
}
}
class D extends A{
void print3(){
System.out.println("D");
}
}
class Hierarical1{
public static void main(String[] args){
B obj_1 = new B();
obj_1.print();
obj_1.print1();

C obj_2 = new C();
obj_2.print();
obj_2.print2();

D obj_3 = new D();
obj_3.print();
obj_3.print3();

}
}