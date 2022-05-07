//try with multicatch
import java.util.*;
public class multi_catch{
public static void main(String[]args){
Scanner sc=new Scanner(System.in);
int a,b,c;
System.out.println("Enter 2 Numbers");
try{
a=sc.nextInt();
b=sc.nextInt();
c=a/b;
System.out.println("Div is"+c);
}
catch(ArithmeticException e){
System.out.println("Can not divide by zero");
}
catch(InputMismatchException e){
System.out.println("plz Enter int Value");
}

System.out.println("end");
}
}
