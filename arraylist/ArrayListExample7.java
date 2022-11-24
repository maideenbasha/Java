import java.util.*;
class ArrayListExample7{
public static void main(String[] args){
ArrayList <String> al = new ArrayList<String>();
System.out.println("INITIAL LIST OF ELEMENTS:"+al);
al.add("MAIDEEN");
al.add("BASHA");
al.add("ANWAR");
System.out.println("After invoking add(Ee) method:"+al);
al.add(1,"GURU");
System.out.println("After invoking add(int index,E element)method:"+al);
ArrayList <String> al2 = new ArrayList<String>();
al2.add("SAMEER");
al2.add("MOHAMED");
al.addAll(al2);
System.out.println("After invoking addAll(Collection<?extends E>c)method:"+al);
ArrayList <String> al3 = new ArrayList<String>();
al3.add("AABU");
al3.add("SURYA");
al.addAll(1,al3);
System.out.println("After invoking addAll(int index, Collection<? extends E> c) method: "+al);
}
}