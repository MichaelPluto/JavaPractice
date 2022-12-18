public class Homework07{
	public static void main(String[] args){
		Dog t = new Dog();
		System.out.println(t.show("刘芮", 22, "黄色"));
	}
}
class Dog {
	String name;
	int age;
	String color;

	public String show(String name, int age, String color){
		this.name = name;
		this.age = age;
		this.color = color;

		return "名字=" + name + " " + "年龄=" + age + " " + "颜色=" + " " + color;

	}

}