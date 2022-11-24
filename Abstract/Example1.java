abstract class Animal{
abstract void makesound();
 
void eat(){
System.out.println( " I CAN EAT " );
}
}
class dog extends Animal{
public void makesound(){
System.out.println( " BARK BARK " );
}
}
class Example1{
public static void main(String[] args){
dog A = new dog();
A.makesound();
A.eat();
}
}
