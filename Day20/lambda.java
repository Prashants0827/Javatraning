import java.util.*;
public class lambda{
public static void main(String[] args) {
@FunctionalInterface
interface A<T>{
T add(T x,T y);
}
A<Integer>ob=(x,y)->x+y;
System.out.println(ob.add(200,300));
}
}
