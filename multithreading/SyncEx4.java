class sync_class{
public static synchronized void thread_fun(){
Thread th = Thread.currentThread();
for(int i=0;i<5;i++){
System.out.println(th.getName()+":"+i);
try{
Thread.sleep(100);
}catch(InterruptedException e){
e.printStackTrace();
}
}
}
}
class threadone extends Thread{
public void run(){
sync_class.thread_fun();
}
}
class threadtwo extends Thread{
public void run(){
sync_class.thread_fun();
}
}
class threadthree extends Thread{
public void run(){
sync_class.thread_fun();
}
}
public class SyncEx4{
public static void main(String[] args)throws InterruptedException{
threadone one = new threadone();
threadtwo two = new threadtwo();
threadthree three = new threadthree();
one.start();
two.start();
three.start();
}
}