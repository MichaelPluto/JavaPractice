public class Homework07{
	public static void main(String[] args){
		Dog t = new Dog();
		System.out.println(t.show("����", 22, "��ɫ"));
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

		return "����=" + name + " " + "����=" + age + " " + "��ɫ=" + " " + color;

	}

}