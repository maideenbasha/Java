class Counter{
int count;
public void increment()
{
count++;
}
}
public class SyncEx2{
public static void main(String[] args) throws Exception{
Counter c = new Counter();
Thread t1 = new Thread(new Runnable()
{
public void run()
{
for(int i=1;i<=1000;i++)
{
c.increment();
}
}
});
t1.start();
t1.join();
System.out.println("Count" + c.count);
}
}