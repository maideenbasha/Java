class threadone extends Thread{
public synchronized void run(){
Thread th = Thread.currentThread();
System.out.println(th.getName() +  " :thread priority: " +th.getPriority());
try{
this.wait(100);
}catch(InterruptedException e){
e.printStackTrace();
}
th.setPriority(MIN_PRIORITY);
System.out.println(th.getName() +  " :thread priority: " +th.getPriority());
System.out.println("First thread start");
System.out.println("First thread end");
}
}
class threadtwo extends Thread{
public synchronized void run(){
Thread th = Thread.currentThread();
System.out.println(th.getName() +  " :thread priority: " +th.getPriority());
System.out.println("Second thread start");
try{
this.wait(100);
}catch(InterruptedException e){
e.printStackTrace();
}
System.out.println("Second thread end");

}
}
class threadthree extends Thread{
public synchronized void run(){
Thread th = Thread.currentThread();
System.out.println(th.getName() +  " :thread priority: " +th.getPriority());
System.out.println("Third thread start");
System.out.println("Third thread end");
notifyAll();
}
}
public class Sync{
public static void main(String[] args)throws InterruptedException{
threadone one = new threadone();
threadtwo two = new threadtwo();
threadthree three = new threadthree();
one.start();
two.start();
three.start();
}
}