class Company{
void show(){
System.out.println( " ITS STATERD IN 1985 WITHB ONLY 10 PEOPLES " );
}
}
class Manager extends Company{
void show1(){
System.out.println( " BUT STILL THERE IN 10000 PEOPLES " );
}
}
class BranchManager extends Manager{
void show2(){
System.out.println( " THEN WAITING FOR THOSE PEOPLES " );
}
}
class Employees extends BranchManager{
void show3(){
System.out.println( " HARDWORK NEVER FAILS! " );
}
}
class Multilevel3{
public static void main(String[] args){
Employees E = new Employees();
E.show();
E.show1();
E.show2();
E.show3();
}
}