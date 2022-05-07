import java.util.*;
class oven{
public static void main(String args[]){
Scanner sc=new Scanner(System.in);
double tempheat,no_items,sec,min;
no_items=sc.nextDouble();
tempheat=sc.nextDouble();
if(no_items==1)
{
sec=tempheat%100;
min=tempheat/100;
System.out.println("Minute"+min);
System.out.println("Second"+sec);
}
else if(no_items==2)
{
tempheat=tempheat*1.5f;
sec=tempheat%100;
min=tempheat/100;
System.out.println("Minute"+min);
System.out.println("Second"+sec);
}
else if(no_items==3)
{ 
tempheat=tempheat*2;
sec=tempheat%100;
min=tempheat/100;
System.out.println("Minute"+min);
System.out.println("Second"+sec);
}
}
}
