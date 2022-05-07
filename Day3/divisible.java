import java.util.*;
class divisible{
public static void main(String args[]){
Scanner sc=new Scanner(System.in);
int a;
System.out.println("Enter a Number:");
a=sc.nextInt();
if(a%5==0)
System.out.println("5 is divisible ");
else if(a%11==0)
System.out.println("11 is divisible");
else 
System.out.println("not divisible");
}
}
