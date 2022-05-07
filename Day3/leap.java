import java.util.*;
class leap{
public static void main(String args[]){
Scanner sc=new Scanner(System.in);
int a;
System.out.println("Enter a Number:");
a=sc.nextInt();
if(a%100==0 && a%4==0)
System.out.println("Leap Year ");
else 
System.out.println("Not leap Year");
}
}
