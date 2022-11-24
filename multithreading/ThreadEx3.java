class MultiThreading extends Thread{
public void run(){
for(int i=1;i<=9;i++){
System.out.println("THREAD" + i);
}
}
}
class ThreadEx3{
public static void main(String[] args){
MultiThreading M = new MultiThreading();
M.start();
}
}