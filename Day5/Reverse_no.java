import java.util.*;
class Reverse_no{
public static void main(String[]args){
Scanner sc=new Scanner (System.in);
int n,i;
n=sc.nextInt();
System.out.println("Enter a Array");
int[]arr=new int[n];
for(i=0;i<arr.length;i++)
{
arr[i]=sc.nextInt();
}
for(i=arr.length-1;i>0;i--)
{
System.out.println(arr[i]);
}
}
}
