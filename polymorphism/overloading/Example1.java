class Function{
static int multiply(int a,int b){
return a * b;
}
static int multiply(int a,int b,int c){
return a * b * c;
}
}
class Example1{
public static void main(String[] args){
System.out.println(Function.multiply(2 , 3 , 4));
System.out.println(Function.multiply(7 , 6));
}
}
