//new way to handle multiple exception by using single catch
import java.util.*;
public class multi_single{
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
catch(ArithmeticException|InputMismatchException e){
if(e instanceof ArithmeticException){
System.out.println("Can not divide by zero");
}
else if(e instanceof InputMismatchException){
System.out.println("plz Enter int Value");
}
}
System.out.println("end");
}
}

