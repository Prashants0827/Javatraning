import java.util.*;
class check{
public static void main(String args[]){
Scanner sc=new Scanner(System.in);
int a;
System.out.println("Enter a Numbers:");
a=sc.nextInt();
if(a>0)
System.out.println("Positive");
else if(a<0)
System.out.println("Negative");
else if (a==0)
System.out.println("zero");
else
System.out.println("Number is Inavlid");
}
}
