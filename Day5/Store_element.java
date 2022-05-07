import java.util.*;
class Store_element{
public static void main(String args[]){
Scanner sc=new Scanner (System.in);
int n,i;
n=sc.nextInt();
int[]arr=new int[n];
System.out.println("Enter a Array");
for(i=0;i<arr.length;i=i+1)
{
arr[i]=sc.nextInt();
}
for(i=0;i<arr.length;i++)
{
System.out.println(arr[i]);
}
}
}
