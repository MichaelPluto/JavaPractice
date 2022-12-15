public class PropertiseDetail{
	public static void main(String[] args){
		 //属性如果不赋值，有默认值，规则和数组一致。具体说: 
		//int 0，short 0, byte 0, long 0, float 0.0,double 0.0，char \u0000，
		//boolean false，String null
		Person p1 = new Person();

		System.out.println("\n当前这个人的信息");
		System.out.println("age=" + p1.age + " name=" + p1.name + " sal=" + p1.sal + " isPass=" + p1.isPass);

	}
}
class Person{
	String name;
	int age;
	double sal;
	boolean isPass;
}
