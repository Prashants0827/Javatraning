import java.util.Arraylist;
class Student implements Cloneable{
ArrayList<String>ar;
Student(){
ar=new Arraylist<>();
}
Student(Arraylist<String>t){
ar=t;
}
void loadData(){
ar.add("A");
ar.add("B");
ar.add("C");
ar.add("D");
}
void show(){
System.out.println("_____________________________");
for(String s:ar){
System.out.println(s);
}
System.out.println("_____________________________");
}
@Override
protected Object clone()throws CloneNotSupportedException{
ArrayList<String>ar2;
ar2=new ArrayList<>();
for(String s:ar){
ar2.add(s);
Student obj= new Student