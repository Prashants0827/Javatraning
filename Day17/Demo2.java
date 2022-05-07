class Test<T>{
T i;
void set(T x){
i=x;
}
void show(){
System.out.println(i);
System.out.println(i.getClass().getName());
}
}
public class Demo2{

    public static void main(String[] args) {
Test<String>
