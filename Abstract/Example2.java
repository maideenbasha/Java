abstract class foods{
abstract void seafood();
}
class meat extends foods{
public void seafood(){
System.out.println( " ULTIMATE TASTE " );
}
}
class fish extends foods{
public void seafood(){
System.out.println( " SUPER " );
}
}
class Example2{
public static void main(String[] args){
meat E = new meat();
 E.seafood();
fish M= new fish();
 M.seafood();
}
}