class student{
private int id;
private String name;
student(int id,String name){
this.id=id;
this.name=name;
}
int getId(){
return id;
}
String getName(){
return name;
}
}
class Mark extends student{
float m1,m2;
Mark(int id,String name,float m1,float m2){
super(id,name);
this.m1=m1;
this.m2=m2;
}
void show(){
System.out.println("Id:"+getId());
System.out.println("Name:"+getName());
System.out.println("m1");
System.out.println("m2");
}
}
public class single_inher{
public static void main(String[]args){
Mark ob1;
ob1= new Mark(1,"abc",90,89);
ob1.show();
}
}