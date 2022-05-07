//try with catch
import java.util.*;
public class catch1{
public static void main(String[]args){
Scanner sc=new Scanner(System.in);
int a,b,c;
System.out.println("Enter 2 Numbers");
a=sc.nextInt();
b=sc.nextInt();
try{
c=a/b;
System.out.println("Div is"+c);
}
catch(ArithmeticException e){
System.out.println("Can not divide by zero");
}
System.out.println("end");
}
}
