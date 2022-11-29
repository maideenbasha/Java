import java.util.*;
public class Hash_Set{
public static void main(String[] arg){
Set <Integer>list = new HashSet<>();
list.add(1);
list.add(1);
list.add(3);
list.add(2);
list.add(3);
list.add(2);
for(Object item:list)
{
System.out.println(item +" ");
}
}
}
