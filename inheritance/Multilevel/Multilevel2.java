class Grandfather{
void speak(){
System.out.println("EARLY MORNING WAKE UP!");
}
}
class Father extends Grandfather{
void speak1(){
System.out.println("ITS GOOD FOR HEALTH!");
}
}
class Son extends Father{
void speak2(){
System.out.println("OKEY I WILL TRY!");
}
}
class Multilevel2{
public static void main(String[] args){
Son S = new Son();
S.speak();
S.speak1();
S.speak2();
}
}