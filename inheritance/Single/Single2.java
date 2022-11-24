class Dog{
void sound(){
System.out.println("BARKING...");
}
}
class Cat extends Dog{
void sound1(){
System.out.println("MEOOW...");
}
}
class Single2{
public static void main(String[] args){
Cat C = new Cat();
C.sound();
C.sound1();
}
}