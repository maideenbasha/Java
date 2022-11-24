class parent{
void must()
{
System.out.println( " PARENT CLASS " );
}
}
class subclass1 extends parent{
void must(){
System.out.println( " SUB CLASS1 " );
}
}
class subclass2 extends parent{
void must(){
System.out.println( " SUB CLASS2 " );
}
}
class Example1{
public static void main(String[] args){
parent p = new subclass1();
parent s = new subclass2();
p.must();
s.must();
}
}