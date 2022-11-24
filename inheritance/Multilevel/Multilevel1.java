class Animal{
void eat(){
System.out.println("EATING...");
}
}
class Goat extends Animal{
void eat1(){
System.out.println("EATING NUTS...");
}
}
class Smallgoat extends Goat{
void eat2(){
System.out.println("EATING GRASS...");
}
}
class Multilevel1{
public static void main(String[] args){
Smallgoat S = new Smallgoat();
S.eat();
S.eat1();
S.eat2();
}
}