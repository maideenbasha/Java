import java.util.*;
class SortArrayList2{
public static void main(String[] args){
ArrayList <Integer> st = new ArrayList<Integer>();
st.add(34);
st.add(76);
st.add(56);
st.add(1);
st.add(7);
st.add(5);
st.add(66);
System.out.println(" SORTING THE NUMBERS ");
Collections.sort(st);
for(Integer number :st)
System.out.println(number);
}
}