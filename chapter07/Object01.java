public class Object01{
	public static void main(String[] args){
	//使用面向对象的方式解决养猫问题
		//实例化cat1对象
		Cat cat1 = new Cat();
		cat1.name = "小白";
		cat1.age = 10;
		cat1.color = "白色";
		//实例化cat2对象
		Cat cat2 = new Cat();
		cat2.name = "小花";
		cat2.age = 100;
		cat2.color = "花色";

		System.out.println("第一只猫" + " " +"名字=" + cat1.name+ " " + "年龄=" +cat1.age +  " " + "颜色=" + cat1.color);
		System.out.println("第二只猫" + " " +"名字=" + cat2.name+ " " + "年龄=" +cat2.age +  " " +"颜色=" + cat2.color);

	
	}
}
class Cat{//定义Cat类
		String name;
		int age;
		String color;
	}	