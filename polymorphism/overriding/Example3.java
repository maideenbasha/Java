class swift{
void speed(){
System.out.println( " THIS CAR SPEED IS 100 ");
}
}
class innovo extends swift{
void speed(){
System.out.println( " THIS CAR SPEED IS 120 ");
}
}
class Example3{
public static void main(String[] args){
swift s= new innovo();
s.speed();
}
} 