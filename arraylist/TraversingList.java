import java.util.*;
public class TraversingList{
public static void main(String[] args){
ArrayList <String> list = new ArrayList<String>();
list.add("MAIDEEN");
list.add("ANWAR");
list.add("MAIDEEN");
list.add("SAMEER");
System.out.println("TRAVERSING LIST THROUGH LIST ITERATOR:");
ListIterator <String> list1 = list.listIterator(list.size());
while(list1.hasPrevious())
{
  String str = list1.previous();
  System.out.println(str);
}

System.out.println("TRAVERSING LIST THROUGH FOR LOOP:");
    for(int i=0;i<list.size();i++)
{
System.out.println(list.get(i));
}

System.out.println("TRAVERSING LIST THROUGH FOREACH() METHOD:");
list.forEach(a->{
System.out.println(a);
});

System.out.println("TRAVERSING LIST THROUGH FOREACHREMAINING() METHOD:");
Iterator <String> itr = list.iterator();
itr.forEachRemaining(a->{
System.out.println(a);
});
}
}