import java.util.*;
public class ArrayListExample4 {
public static void main(String[] args){
ArrayList <String> al = new ArrayList<String>();
al.add("MANGO");
al.add("APPLE");
al.add("PINAPPLE");
al.add("WATERMELON");
al.add("BANANA");
System.out.println(" RETURNING ELEMENT: " + al.get(1));
al.set(1,"DATES");
for(String fruit:al)
System.out.println(fruit);
}
}
