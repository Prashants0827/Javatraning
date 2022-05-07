import java.util.*;
class vote{
public static void main(String args[]){
String name;
int age;
Scanner sc=new Scanner(System.in);
System.out.println("Enter Name And Age");
name=sc.next();
age=sc.nextInt();
if(age>=18)
{
System.out.println("You can  cast a vote");
}
else
System.out.println("You can not  cast a vote");
}
}


