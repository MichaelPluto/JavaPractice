public class ConstructorExercise{
	public static void main(String[] args){
		Person t1 = new Person();
		System.out.println("p1����ϢΪname="+ t1.name +" " + "����=" +  t1.age);//name = null; age = 18
		Person t2 = new Person("jack", 66);
		System.out.println("p2����ϢΪ" + t2.name + "  " + t2.age);//name = jack age = 66
	}
}
class Person {
	int age;
	String name;
		Person(){
		age = 18;
	}
	public Person(String pName, int pAge){
		age = pAge;
		name = pName;
	}
}