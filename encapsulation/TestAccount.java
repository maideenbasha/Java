public class TestAccount{
public static void main(String[] args){
Account acc = new Account();
acc.setAcc_no(6767545678L);
acc.setName("san jay");
acc.setEmail("ghdagahj@gmail.com");
acc.setAmount(5000000f);
System.out.println(acc.getAcc_no()+" "+acc.getName()+" "+acc.getEmail()+" "+acc.getAmount());
}
}