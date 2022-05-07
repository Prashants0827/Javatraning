import java.io.*;
public class Demo4{
public static void main(String[]args)throws Exception{
FileInputStream fin;
fin=new FileInputStream("C:\\Desktop\\prashant\\Day14\\test1.txt");
StringBuffer sb;
sb=new StringBuffer();
int x;
System.out.println(fin.available());
do{
x=fin.read();
if(x!=-1){
System.out.print((char)x);
}
}
while(x!=-1);
fin.close();
System.out.println();
}
}