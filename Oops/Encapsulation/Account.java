class  Account
{



		 int acno;
		private double sal;

		
double getsal(){

	return sal;
}
void setSal(double sal){
	this.sal=sal;
}
Account(){}
		Account(int acno,double sal){
            this.acno=acno;
            this.sal=sal;
		}

void display(){
System.out.println("Account Details ");
System.out.println("Account Number is : " + acno);
System.out.println("Account Sal is: "+sal);
	}
}
