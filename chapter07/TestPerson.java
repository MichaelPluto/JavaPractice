public class TestPerson{
	public static void main(String[] args){
		Person p1 = new Person("jack", 20);
		Person p2 = new Person("smith", 30);
		System.out.println("p1��p2�ȽϽ��Ϊ" + p1.compareTo(p2));//p1.compareTo Ϊ��ǰp1��jack��20
											 //(p2) Ϊ������β� Ϊ smith��20
	}
}
class Person {
	String name;
	int age;

	public Person(String name, int age){
		this.name = name;
		this.age = age;
	}

	public boolean compareTo(Person p){//��ͬ�����ıȽ�
		// if(this.name.equals(p.name) && this.age == p.age){
		// 	return true;
		// }else{
		// 	return false;
		// }
		return this.name.equals(p.name) && this.age == p.age;
	}
}
