public class Homework12{
	public static void main(String[] args){
	Employee t = new Employee("jack",'男',22);
	System.out.println(t.name + t.gender + t.age);
	}
}
class Employee {
	String name;
	char gender;
	int age;
	String stand;
	double sal;
	public Employee(String name, char gender, int age, String stand, double sal){
	this.name = name;
	this.gender = gender;
	this.age = age;
 	this.stand = stand;
	this.sal = sal;
  }
  	public Employee(String name, char gender, int age){
  		this.name = name;
		this.gender = gender;
		this.age = age;
  	}

  	public Employee(String stand, double sal){
  		this.stand = stand;
		this.sal = sal;
  	}
}
