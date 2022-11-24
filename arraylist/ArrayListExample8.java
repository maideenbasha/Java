import java.util.*;
class ArrayListExample8{
public static void main(String[] args){
ArrayList <String> al = new ArrayList<String>();
al.add("ANWAR");
al.add("MAIDEEN");
al.add("BASHA");
al.add("RAJA");
al.add("ROJA");
System.out.println("AN INITIAL ELEMENT:"+al);
al.remove("BASHA");
System.out.println("AFTER INVOKING REMOVE(OBJECT) METHOD:"+al);
al.remove(0);
System.out.println("AFTER INVVOKING REMOVE(INDEX)METHOD:"+al);
ArrayList <String> al2 = new ArrayList<String>();
al2.add("RAVI");
al2.add("DHANUSH");
al.addAll(al2);
System.out.println("UPDATE LIST:"+al);
al.removeAll(al2);
System.out.println("AFTER INVOKING REMOVEALL() METHOD:"+al);
al.removeIf(str -> str.contains("RAJA"));
System.out.println("AFTER INVOKING REMOVEIF() METHOD:"+al);
al.clear();
System.out.println("AFTER INVOKING CLEAR() METHOD:"+al);
}
}