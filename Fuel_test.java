//Print all Armstrong Number
public class Fuel_test{
public static void main(String args[]){
int a,b;
int x,y,z,w;
int p;
for(a=100;a<=999;a++){
x=a%10;
y=a%100;
z=y/10;
w=a/100;
p=x*x*x+z*z*z+w*w*w;
if(a==p){
System.out.println(p);
}
}
}
########################################
///1

import java.util.*;
class square{
public static void main(String[]args){
int arr[]=new int[5];
Scanner sc=new Scanner(System.in); 
for(int i=0;i<arr.length;i++){
arr[i]=sc.nextInt();
}
for(int i=0;i<arr.length;i++){
arr[i]=arr[i]*arr[i];
}
for(int i=0;i<arr.length;i++){
System.out.println(arr[i]);
}
}
}
###################################
//3
//Create Class
import java.util.*;
class college{
private String First_name;
private String Last_name;
private String Major;
private int Year;
college(){
}
college(String firstName,String lastname,int year,String major){
this.first_name=first_Name;
this.last_name=last_name;
this.year=year;
this.major=major;
}
public String getfirstName(){
return firstName;
}
public String getlastName(){
return lastName;
}
public String getyear(){
return year;
}
public String getmajor(){
return major;
}
public string setFirst_name(String first_name){
this.first_name=first_name;
}
public string setLast_name(String last_name){
this.last_name=last_name;
}
public string setmajor(String Major){
this.major=major;
}
public int year(int Year){
this.year=year;
}
}

import java.util.*;
class square{
public static void main(String[]args){
int arr[]=new int[5];
Scanner sc=new Scanner(System.in); 
for(int i=0;i<arr.length;i++){
arr[i]=sc.nextInt();
}
for(int i=0;i<arr.length;i++){
arr[i]=arr[i]*arr[i];
}
for(int i=0;i<arr.length;i++){
System.out.println(arr[i]);
}
}
}

}
################################################################
//4
//Human
class Human{
String First_name;
String Last_name;
Human(String First_name,String Last_name){
this.First_name=First_name;
this.Last_name=Last_name;
}
public void get First_name
}
class teacher extends Human{
double salary;
int year;
int experiance;
}
class Human{
