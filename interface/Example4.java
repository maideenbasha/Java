interface Polygon{
void getArea();
 default void getSides(){
System.out.println( "I can get sides of a polygon" );
}
}
class Rectangle implements Polygon{
public void getArea(){
int length = 2;
int breadth = 3;
int area = length * breadth;
 System.out.println( "The area of rectangle is :" + area);
}
public void getSides(){
System.out.println( "I have 4 Sides");
}
}
class square implements Polygon{
public void getArea(){
int length = 5;
int area = length * length;
System.out.println("he area of square is :" + area);
}
}
class Example4{
public static void main(String[] args){
Rectangle R = new Rectangle();
R.getArea();
R.getSides();
square s = new square();
s.getArea();
s.getSides();
}
}   