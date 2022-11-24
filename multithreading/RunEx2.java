class Hi implements Runnable{
public void run(){
for(int i=1;i<=5;i++){
System.out.println("HI");
try{Thread.sleep(1000);}catch(Exception e){}
}
}
}
class Hello implements Runnable{
public void run(){
for(int i=1;i<=5;i++){
System.out.println("HELLO");
try{Thread.sleep(1000);}catch(Exception e){}
}
}
}
class RunEx2{
public static void main(String[] args){
Runnable obj1 = new Hi();
Runnable obj2 = new Hello();
Thread s1 = new Thread(obj1);
Thread s2 = new Thread(obj2); 
s1.start();
try{Thread.sleep(10);}catch (Exception e){}
s2.start();

}
}