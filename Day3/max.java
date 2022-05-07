import java.util.*;
class max{
public static void main(String args[]){
Scanner sc=new Scanner(System.in);
int a,b,c,max;
System.out.println("Enter a Three Numbers:");
a=sc.nextInt();
b=sc.nextInt();
c=sc.nextInt();
if(a>b)
System.out.println("A is max");
else if(b>c)
System.out.println("B is max");
else if (c>a)
System.out.println("c is max");
else
System.out.println("Number is Inavlid");
}
}


