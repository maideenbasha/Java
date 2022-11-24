abstract class Bank{
abstract int getrateofInterest();
}
class SBI extends Bank{
int getrateofInterest(){
return 6;
}
}
class PNB extends Bank{
int getrateofInterest(){
return 7;
}
}
class HDFC extends Bank{
int getrateofInterest(){
return 9;
}
}
class Example3{
public static void main(String[] args){
Bank b;
b = new SBI();
System.out.println( " Rate of interest in SBI Bank: " + b.getrateofInterest()+"%");
b = new PNB();
System.out.println( " Rate of interest in PNB Bank: " + b.getrateofInterest()+"%");
b= new HDFC();
System.out.println( " Rate of interest in HDFC Bank: " + b.getrateofInterest()+"%");
}
}