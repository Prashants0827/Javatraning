import java.util.*;
import java.lang.*;

class Student{
int id;
String name;
Student(int a,String b){
id=a;
name=b;
}
@Override
public String toString(){
    return"("+id+","+name+")";
}
@Override
public int hashcode(){
    int code;
    code=name.hashcode()+id;
    return code;
}
equal
}