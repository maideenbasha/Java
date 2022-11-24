public class GetSetNameEx2{
public static void main(String[] args) throws Exception{
Thread t1 = new Thread(() ->
{
for(int i=1;i<=5;i++){
System.out.println("HI");
try{Thread.sleep(1000);} catch(Exception e){}
}
},"MAIDEEN");
Thread t2 = new Thread(() ->
{
for(int i=1;i<=5;i++){
System.out.println("HELLO");
try{Thread.sleep(1000);} catch(Exception e){}
}
},"BASHA");

System.out.println(t1.getName());
System.out.println(t2.getName());

t1.start();
try{Thread.sleep(10);} catch(Exception e){}
t2.start();
System.out.println(t1.isAlive());
t1.join();
t2.join();
System.out.println(t2.isAlive());
System.out.println("BYE");
}
}