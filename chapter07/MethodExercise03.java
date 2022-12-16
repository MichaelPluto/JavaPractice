public class MethodExercise03{
	public static void main(String[] args){
		Person p = new Person();
		p.name = "jack";
		p.age = 10;
		System.out.println(p.name + " " + p.age);

		MyTools tool = new MyTools();
		Person p1 = tool.copyPerson(p);//用Person p1 接收返回值
		System.out.println(p1.name + " " + p1.age);
		System.out.println(p == p1);// p 不等于 p1 只是地址存的值相同，
									//是不同的地址
	}	
}
class Person {
	String name;
	int age;
}
class MyTools {//克隆
	//编写一个方法 copyPerson，可以复制一个 Person 对象，
	//返回复制的对象。克隆对象， 注意要求得到新对象和原来的
    //对象是两个独立的对象，只是他们的属性相同
    //思路：
    //1.返回值为 Person
    //2.方法名为 copyPerson
    //3.形参为（Person p）
    //4.方法体为 复制值的语句
   public Person copyPerson (Person p){
   	  Person p1 = new Person();
   	  p1.name = p.name;
   	  p1.age = p.age;
   	  return p1;
   }

}