public class This {

int id;
String name;
int age;
int salary;
This(int id,String name,int age,int salary)
{
this.id=id;
this.name=name;
this.age=age;
this.salary=salary;
}
void show(){
System.out.println(id + " " + name + " " + age + " " +salary);
}
public static void main(String[] args){
          This t1=new This(1,"maideen",24,20000);
          This t2=new This(2,"anwar",27,25000);
t1.show();
t2.show();
}
}
