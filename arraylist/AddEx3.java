import java.util.*;
class AddEx3{
public static void main(String[] args){
ArrayList <Integer> al = new ArrayList<Integer>();
Scanner s = new Scanner(System.in);
System.out.println("ENTER THE NUMBERS:");
int a;
for(int i=0;i<6;i++)
{
a=s.nextInt();
al.add(a);
}
System.out.println(al);
}
}