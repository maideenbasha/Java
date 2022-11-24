class Shark{
void type1(){
System.out.println("EAT SMALL FISHES....");
}
}
class Floraan extends Shark{
void type2(){
System.out.println("EAT MEATS....");
}
}
class Single3{
public static void main(String[] args){
 Floraan F = new Floraan();
 F.type1();
 F.type2();
}
}