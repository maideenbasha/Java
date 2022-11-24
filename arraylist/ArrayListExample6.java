import java.io.*;
import java.util.*;
class ArrayListExample6 {
public static void main(String[] args){
ArrayList <String> list = new ArrayList<String>();
list.add("MAIDEEN");
list.add("ANWAR");
list.add("AJITH");

try{
   FileOutputStream fos = new FileOutputStream("file");
   ObjectOutputStream oos = new ObjectOutputStream(fos)	;
    oos.writeObject(list);
    fos.close();
    oos.close();
  
FileInputStream fis = new FileInputStream("file");
ObjectInputStream ois = new ObjectInputStream(fis);
ArrayList al = (ArrayList)ois.readObject();
System.out.println(al);
}catch(Exception e){
System.out.println(e);
}
}
}