public class ThreadEx1 implements Runnable{
public static void main(String[] args){
Thread Thread1 = new Thread("MAIDEEN");
Thread Thread2 = new Thread("BASHA");
Thread1.start();
Thread2.start();
System.out.println("THREAD NAMES ARE FOLLOWING");
System.out.println(Thread1.getName());
System.out.println(Thread2.getName());
}
public void run(){
}
}