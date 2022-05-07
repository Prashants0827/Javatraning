
class Account{
int id;
String name;
int balance;
Account(int id,String name,int balance)
{
this.id=id;
this.name=name;
this.balance=balance;
System.out.println("Constructor With Argument");
}
Account(){
id=1;
name="abc";
balance=0;
System.out.println("Constructor Without Argument");
}
void deposit(int amt){
balance+=amt;
}
void withdraw(int amt){
balance-=amt;
}
void print(){
System.out.println("**************************");
System.out.println("Id:"+id);
System.out.println("name:"+name);
System.out.println("balance:"+balance);
System.out.println("**************************");
}
}
class Constructor{
public static void main(String[]args){
Account ob1=new Account();
Account ob2=new Account(2,"adc",1000);
ob2.deposit(3000);
ob1.deposit(1500);
ob1.print();
ob2.withdraw(2000);
ob2.print();
}
}



