import java.util.*;
class Book{
int no;
String name,author,publisher;
int quantity;
Book(int no,String name,String author,String publisher,int quantity){
this.no=no;
this.name=name;
this.author=author;
this.publisher=publisher;
this.quantity=quantity;
}
}

class ArrayListExample11{
public static void main(String[] args){
ArrayList <Book> list=new ArrayList<Book>();
Book b1=new Book(1,"rasull","django","abu",67);
Book b2=new Book(2,"dhoni","oops","raja",88);
Book b3=new Book(3,"rahim","structure","afftab",6);
list.add(b1);
list.add(b2);
list.add(b3);
for(Book b:list){
System.out.println(b.no +" "+ b.name + " "+ b.author +" "+ b.publisher +" "+ b.quantity);
}
}
}
