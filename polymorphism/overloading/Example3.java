class Shapes{
void area(){
System.out.println( " FIND AREA ");
}
void area(int r){
System.out.println( " CIRCLE AREA  = " + 3.14 * r * r);
}
void area(double b,double h){
System.out.println( " TRIANGLE AREA = " + 0.5 * b * h);
}
void area(int l,int b){
System.out.println( " RECTANGLE AREA = " + l * b);
}
}
class Example3{
public static void main(String[] args){

Shapes M = new Shapes();
M.area();
M.area(5);
M.area(6.0,1.2);
M.area(6,2);
}
} 