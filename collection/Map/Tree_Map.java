import java.util.*;
public class Tree_Map{
public static void main(String[] args){
Map<String,String>list = new TreeMap<>();
list.put("MAIDEEN","6578908765");
list.put("BASHA","6578555765");
list.put("ANWAR","6578000765");
list.put("ALI","6578565765");
list.forEach((k,v) ->System.out.println( " Name = "+ k + " Phone No =" + v));
}
}