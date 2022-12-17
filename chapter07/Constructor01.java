public class Constructor01{
	public static void main(String[] args){
 	Person p1 = new Person("jack", 80);
 	System.out.println("p1的信息如下");
 	System.out.println("name=" + " " + p1.name);//jack
 	System.out.println("age=" + " " + p1.age);//80
	}
}
class Person {
	String name;
	int age;
	//构造器
	//1.构造器没有返回值，也不能写void
	//2.构造器名字必须和类一样
	//3.形参列表和成员方法的一样
	public Person(String pName, int pAge) {
		System.out.println("构造器被调用，完成对象的属性初始化");
		name = pName;
		age = pAge;
	}
}