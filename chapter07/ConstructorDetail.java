public class ConstructorDetail{
	public static void main(String[] args){
	Person t1 = new Person("jack", 99);//第一个构造器
	Person t2 = new Person("Tom");//第二个构造器
	System.out.println("第一个构造器输出" + t1.name + " " + t1.age);
	System.out.println("第二个构造器输出" + t1.name);

	}
}
class Person {
	String name;
	int age;
	public Person(String pName, int pAge){
		name = pName;
		age = pAge;
	}
	public Person(String pName){//构造器重载
		name = pName;
	}
}