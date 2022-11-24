import java.util.*;
public class SortArrayList1{
public static void main(String[] args){
ArrayList <String> out = new ArrayList<String>();
out.add("MANGO");
out.add("ORANGE");
out.add("APPLE");
out.add("BANANA");
Collections.sort(out);
for(String fruit:out)
System.out.println(fruit);
}
}