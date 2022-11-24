interface Language{
void getName(String name);
}
class ProgramingName implements Language{
public void getName(String name){
System.out.println( " PROAGRAMING LANGUAGE : " + name );
}
}
class Example3{
public static void main(String[] args){
ProgramingName N = new ProgramingName();
N.getName("JAVA");
}
}