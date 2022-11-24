class Addition{
void sum(int a,int b){
int c = a + b;
System.out.println( " ADDITION OF TWO NUMBERS : " +c);
}
void sum(int a,int b,int d){
int w = a + b + d;
System.out.println( " ADDITION OF TWO NUMBERS : " +w);
}
void sum(int p,int q,int r,int h){
int f = p * q * r * h;
System.out.println( "MULTIPLICATION OF THREE NUMBERS : " +f);
}
}
class Example2{
public static void main(String[] args){
 Addition s = new Addition();
 s.sum(2,3);
 s.sum(3,4,5);
 s.sum(7,6,4,3);
}
}
