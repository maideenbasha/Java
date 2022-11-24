import java.util.*;
public class ArrayListExample3{
public static void main(String[] args){
ArrayList <String> list = new ArrayList<String>();
list.add("MANGO");
list.add("APPLE");
list.add("ORANGE");
list.add("BANA");
for(String fruit:list){
System.out.println(fruit);
}
}
}