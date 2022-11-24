class Bio
{
String fname = "MAIDEEN";
}
class data1 extends Bio
{
String lname = "BASHA";
}
class data2 extends Bio{
String habbits = "LISTEN MUSIC";
}
class data3 extends Bio
{
int age=24;
}
class Hierarical3
{
public static void main(String[] args){
data1 L = new data1();
data2 K = new data2();
data3 M = new data3();

System.out.println( " FIRSTNAME: " + L.fname + " LASTNAME: " + L.lname + " HABBITS: " + K.habbits + " AGE: " + M.age);
}
}