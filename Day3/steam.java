import java.util.*;
class steam{
public static void main(String args[]){
Scanner sc=new Scanner(System.in);
System.out.println("Enter temp of Air and steam");
double tair,tstream,efficiency;
tair=sc.nextDouble();
tstream=sc.nextDouble();
efficiency=1-(tair/tstream);
if(tair>300 && tstream<373){
System.out.println("efficiency");
}
else{
System.out.println("efficiency is zero");
}
}
}
