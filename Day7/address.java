class Address{
int Housenum;
String Areaname;
String City;
}
void setHousenum(int housenum){
this.housenum=housenum;
}
void setAreaname(String areaname){
this.areaname=areaname;
}
void setCity(String city){
this.City=City;
}
int getHousenum(){
return housenum;
}
public String getAreaname(){
return araename;
}
public String getcity(){
return city;
}
}
class student{
int id;
String name;
Address adr;
public void setId(int id){
this.id=id;
}
public void setAdr(Address adr){
this.adr=adr;
}
public int getId(){
return id;
}
public Address getAdr(){
return adr;
}
}
class address{
public static void main(String[]args){
Address ad=new Address();
ad.setHousenum(1);
ad.setAreaname("abc");
ad.setCity("A.bad");
//CREAT STUDENT CLASS OBJECT
Student st=new Student();
int x=101;
st.setId(x);
st.setAdr(ad);
st.setName("xyz");
//READ VALUES
int id1;
id=1=set.getId();
String n;
n=st.getName();
Address ad1;
ad1.set.getAdr();
//READ ADDRESSS OBJECT VALUE
int hn;
hn=ad1.getHousenum();
String Area;
area=ad1.getName();
StringCity=ad1.getCity();
}

