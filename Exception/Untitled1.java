class A 
{
	
}
class B extends A
{
}
class c extends A
{
}
public static void main (String[] args){

A obj=new A();

if(obj instanceof B){
 A obj=new B();//upcasting
 B obj1=(B)obj;//downcasting

 C ob2=(C)obj1;


}}