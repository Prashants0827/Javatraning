//abstract
abstract class A{
void show(){
System.out.println("In A");
}
abstract void add(int x,int y);
}
class B extends A{
@Override
void add(int x,int y){
System.out.println(x+y);
}
}
class abstract1{
public static void main(String[]args){
B ob=new B();
ob.show();
ob.add(100,200);
}
}