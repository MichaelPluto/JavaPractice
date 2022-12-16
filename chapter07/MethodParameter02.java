public class MethodParameter02{
	public static void main(String[] args){
		B b = new B();
		int []arr = {1, 2, 3,};
		b.test100(arr);
		System.out.print("主方法中的arr输出 ");
		for(int i = 0; i < arr.length; i++){
			System.out.print(arr[i] + " ");
		}
			System.out.println();

		Person p = new Person();
		p.name = "jack";
		p.age = 10;

		b.test200(p);
		System.out.println("main的 p.age =" + p.age);
 
	}
}
class Person{
	String name;
	int age;
}
class B {
	//编写一个方法test100
	//可以接收一个数组，在方法中修改数组
	//看看原来的数组是否有变化
	public void test100(int []arr){
		System.out.print("test100中的arr输出 ");
		arr[0] = 200;
		//遍历数组
		for(int i = 0; i < arr.length; i++){
			System.out.print(arr[i] + " ");
		}
			System.out.println();
	}


	public void test200(Person p){
		//编写一个方法test200
		//可以接收一个对象，在方法中修改对象中的值
		//看看原来的对象中的值是否变化
		p.age = 1000;//修改对象属性
	}
}