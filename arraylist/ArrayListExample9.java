import java.util.*;
class ArrayListExample9{
public static void main(String[] args){
ArrayList <String> al=new ArrayList<String>();
al.add("ANWAR");
al.add("RAJA");
al.add("ROJA");
al.add("BASHA");
ArrayList <String> al2=new ArrayList<String>();
al2.add("ANWAR");
al2.add("MAIDEEN");
al.retainAll(al2);
System.out.println("iterating the elements after retaining the elements of al2");  
Iterator itr = al.iterator();
while(itr.hasNext()){
System.out.println(itr.next());
}
}
}