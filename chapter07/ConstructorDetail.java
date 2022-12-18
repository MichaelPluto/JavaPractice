public class ConstructorDetail{
	public static void main(String[] args){
	Person t1 = new Person("jack", 99);//第一个构造器
	Person t2 = new Person("Tom");//第二个构造器
	System.out.println("第一个构造器输出" + t1.name + " " + t1.age);
	System.out.println("第二个构造器输出" + t1.name);

	}
}
class Dog{
	//如果程序员没有定义构造器，系统会自动给类生成一个默认无参构造器(也叫默认构造器)
	//使用 javap 指令 反编译看看
	/*
		默认构造器
		Dog(){
	
		}
	*/

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