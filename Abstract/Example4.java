abstract class Bike{
Bike(){
System.out.println( " BIKE IS READY! " );
}
abstract void run();
void changegear(){
System.out.println( " GEAR GANGED! " );
}
}
class Honda extends Bike{
void run(){
System.out.println( " RUNNING SAFETY! ");
}
}
class Example4{
public static void main(String[] args){
Bike A=new Honda();
A.run();
A.changegear();
}
}
