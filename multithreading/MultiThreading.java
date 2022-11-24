class threadone extends Thread{
public void run(){
Thread th = Thread.currentThread();
System.out.println(th.getName() +  " :thread priority: " +th.getPriority());
th.setPriority(MIN_PRIORITY);
System.out.println(th.getName() +  " :thread priority: " +th.getPriority());
System.out.println("First thread start");
System.out.println("First thread end");
}
}
class threadtwo extends Thread{
public void run(){
Thread th = Thread.currentThread();
System.out.println(th.getName() +  " :thread priority: " +th.getPriority());
System.out.println("Second thread start");
System.out.println("Second thread end");
}
}
public class Priority{
public static void main(String[] args)throws InterruptedException{
threadone one = new threadone();
threadtwo two = new threadtwo();
one.start();
two.start();
}
}