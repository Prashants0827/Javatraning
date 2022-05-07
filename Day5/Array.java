import java.util.*;
class Array{
public static void main(String[]args){
Scanner sc=new Scanner (System.in);
int i;
int[]arr=new int[5];
System.out.println("Enter a Array");
for(i=0;i<arr.length;i=i+1)
{
arr[i]=sc.nextInt();
}
System.out.println("Your Array");
for(i=0;i<arr.length;i=i+1)
{
System.out.println(arr[i]);
}
}
}

