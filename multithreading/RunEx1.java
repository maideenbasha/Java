class MultiThreading implements Runnable{
public void run(){
System.out.println(" I AM THREAD RUNNING!");
}
}
class RunEx1{
public static void main(String[] args){
MultiThreading M = new MultiThreading();
Thread T = new Thread(M);
T.start();
}
}