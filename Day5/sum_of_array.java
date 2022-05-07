import java.util.*;
class sum_of_array{
public static void main(String[]args){
Scanner sc=new Scanner (System.in);
int n,i,sum=0;
n=sc.nextInt();
System.out.println("Enter a Array");
int[]arr=new int[n];
for(i=0;i<arr.length;i++)
{
arr[i]=sc.nextInt();
}
for(i=0;i<arr.length;i++)
{
sum=sum+arr[i];
System.out.println("Addition is"+sum);
}
}
}
