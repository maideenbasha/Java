class Hi extends Thread{
public void run(){
for(int i=1;i<=5;i++){
System.out.println("HI");
try{Thread.sleep(1000);}catch(Exception e){}
}
}
}
class Hello extends Thread{
public void run(){
for(int i=1;i<=5;i++){
System.out.println("HELLO");
try{Thread.sleep(1000);}catch(Exception e){}
}
}
}
class SleepEx2{
public static void main(String[] args){
Hi obj1 = new Hi();
Hello obj2 = new Hello();
obj1.start();
obj2.start();

}
}