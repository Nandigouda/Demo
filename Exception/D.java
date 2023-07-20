class A 
{
	
}
class B extends A
{
}
class C extends A
{
}
class D
{

public static void main (String[] args){

 A obj=new A();
 A obj1=new B();//upcasting
 B obj2=(B)obj;//downcasting

 C obj3=(C)obj1;// Class Cast Exception


}}