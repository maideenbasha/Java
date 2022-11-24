interface sum{
void addition(int a,int b);
}
class Add implements sum{
public void addition(int a,int b){
System.out.println( " THE ADDITION OF NUMBERS : " + (a * b));
}
}
class Example2{
public static void main(String[] args){
Add A = new Add();
A.addition(2,3);
}
}	