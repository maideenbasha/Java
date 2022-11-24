class MultiThreading extends Thread{
public void run(){
System.out.println( " I AM THREAD RUNNING ");
}
}
class MultiThreadingEx1{
public static void main(String[] args){
MultiThreading s = new MultiThreading();
s.start();
}
}