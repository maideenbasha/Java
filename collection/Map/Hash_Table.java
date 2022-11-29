import java.util.*;
public class Hash_Table{
public static void main(String[] args){
Map<String,String>list = new Hashtable<>();
list.put("MAIDEEN","6578908765");
list.put("BASHA","6578555765");
list.put("ANWAR","6578000765");
list.put(null,"6578565765");
list.forEach((k,v) ->System.out.println( " Name = "+ k + " Phone No =" + v));
}
}