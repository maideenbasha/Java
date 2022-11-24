interface shop1

{
  
int Car = 5000000;
  
int Bike = 100000;
  
public void suzuki ();

}

interface shop2

{
  
int Laptop = 50000;
  
int Mobile = 25000;
  
public void oppo ();

}

class Store implements shop1, shop2

{
  
public void suzuki ()
  
{
    
int suzuki = Car - 50000;
    
int suzuki1 = Bike - 10000;
      
System.out.println ("CAR OFFER PRICE" + suzuki);
      
System.out.println ("BIKE OFFER PRICE" + suzuki1);
  
}
  
public void oppo ()
  
{
    
int oppo = Laptop - 5000;
    
int oppo1 = Mobile - 3000;
    
System.out.println ("LAPTOP OFFER PRICE" + oppo);
    
System.out.println ("MOBILE OFFER PRICE" + oppo1);
  
}


}


public class Interface
{

  public static void main (String[]args)
  {
    
Store s = new Store ();
   
   s.suzuki ();
    
  s.oppo ();
 
 }

}
