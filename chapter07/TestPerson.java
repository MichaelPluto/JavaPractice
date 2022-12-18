public class TestPerson{
	public static void main(String[] args){
		Person p1 = new Person("jack", 20);
		Person p2 = new Person("smith", 30);
		System.out.println("p1和p2比较结果为" + p1.compareTo(p2));//p1.compareTo 为当前p1的jack和20
											 //(p2) 为传入的形参 为 smith和20
	}
}
class Person {
	String name;
	int age;

	public Person(String name, int age){
		this.name = name;
		this.age = age;
	}

	public boolean compareTo(Person p){//不同对象间的比较
		// if(this.name.equals(p.name) && this.age == p.age){
		// 	return true;
		// }else{
		// 	return false;
		// }
		return this.name.equals(p.name) && this.age == p.age;
	}
}
