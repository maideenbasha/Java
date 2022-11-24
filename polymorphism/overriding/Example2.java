class Animal{
void work()
{
System.out.println("EATING STRUCTURE");
}
}
class Lion extends Animal{
void work()
{
System.out.println("THE LION EAT MEATS");
}
}
class Elephent extends Animal{
void work()
{
System.out.println("THE ELEPHENT EAT FRUITS");
}
}
class Cow extends Animal{
void work(){
System.out.println("THE COW EAT GRASS");
}
}
class Cat extends Animal{
void work(){
System.out.println("THE CAT EAT RAT");
}
}
class Example2{
public static void main(String[] args){
Animal A = new Animal();
Animal L = new Lion();
Animal E = new Elephent();
Animal C = new Cow();
Animal M = new Cat();
A.work();
L.work();
E.work();
C.work();
M.work();
}
}