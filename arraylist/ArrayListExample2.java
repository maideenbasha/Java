import java.util.*;
public class ArrayListExample2
{
public static void main(String[] args){
ArrayList<String>list=new ArrayList<String>();
list.add("MANGO");
list.add("BANANA");
list.add("APPLE");
list.add("ORANGE");
Iterator it = list.iterator();
while(it.hasNext())
{
   System.out.println(it.next());
}
}
}