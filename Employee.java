package inheritance;
 class Employeee {
String name;
int age;
String address;
String phoneNumber;
double salary;
void printsalary() {
	System.out.println("salary:"+salary);}
}
class Officer extends Employeee{
	String specialization;
	Officer(String name,int age,String phoneNumber,String address,double salary,String specialization){
this.name=name;
this.age=age;
this.phoneNumber=phoneNumber;
this.salary=salary;
this.address=address;
this.specialization=specialization;	}
void printOfficerDetails(){
	System.out.println("OfficerDetails:");
	System.out.println("Name:"+name);
	System.out.println("Age:"+age);
	System.out.println("PhoneNumber:"+phoneNumber);
	System.out.println("Address:"+address);
	System.out.println("Specialization:"+specialization);
	printsalary();}
}
class Manager extends Employeee{
	String Department;
	Manager(String name,int age,String phoneNumber,String address,double salary,String Department){
this.name=name;
this.age=age;
this.phoneNumber=phoneNumber;
this.salary=salary;
this.address=address;
this.Department=Department;}
void printManagerDetails(){
	System.out.println("ManagerDetails:");
	System.out.println("Name:"+name);
	System.out.println("Age:"+age);
	System.out.println("Phone Number:"+phoneNumber);
	System.out.println("Address:"+address);
	System.out.println("Department:"+Department);
	printsalary();}
}
	public class Employee{
		public static void main(String[]args){
			Officer off=new Officer("Ajal",19,"8590443216","kasaragod",500000,"cse-cy");
			Manager man=new Manager("Dominic",19,"9049039865","kasaragod",500000,"system analyst");
			off.printOfficerDetails();
			man.printManagerDetails();}
			}
