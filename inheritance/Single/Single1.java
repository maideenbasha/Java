class Student{
 void view()
{
System.out.println("READY TO LEARN");
}
}
class Teacher extends Student{
void disp()
{
System.out.println("SINGLE INHERITANCE");
}
}
class Single1{
public static void main(String[] args){
Teacher T = new Teacher();
T.view();
T.disp();
}
}
 