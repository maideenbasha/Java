public class ThreadEx2 implements Runnable{
public static void main(String[] args){
Thread Thread1 = new Thread("ANWAR");
Thread Thread2 = new Thread("AHAMED");
Thread Thread3 = new Thread("JAJA");
Thread1.start();
Thread2.start();
Thread3.start();
System.out.println("PEOPLES ARE FOLLOWING:");
System.out.println(Thread1.getName() + " " + Thread2.getName() + " " + Thread3.getName());
}
public void run(){
}
}