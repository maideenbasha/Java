class Counter{
int count;
public void increment()
{
count++;
}
}
public class SyncEx1{
public static void main(String[] args){
Counter c = new Counter();
c.increment();
c.increment();
System.out.println("Count" + c.count);
}
}