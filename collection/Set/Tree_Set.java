import java.util.*;
public class Tree_Set{
public static void main(String[] arg){
Set <Integer>list = new TreeSet<>();
list.add(2);
list.add(4);
list.add(5);
list.add(1);
list.add(6);
list.add(3);
for(Object item:list) 
{
System.out.println(item+ " ");
}
}
}
