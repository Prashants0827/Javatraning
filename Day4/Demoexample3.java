import java.util.*;
class Demoexample3{
public static void main(String[]args){
Scanner sc=new Scanner (System.in);
System.out.println("Enter a Number");
int n=sc.nextInt();
int i=1;
int sum=0;
while(i<=n)
{
sum=sum+i;
i=i+1;
}
System.out.println("Adition is "+sum);
}
}