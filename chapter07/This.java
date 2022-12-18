public class This{
	public static void main(String[] args){
		Dog dog1 = new Dog("¡ı‹«", 21);
		dog1.info();
	}
}
class Dog {
	String name;
	int age;


	public Dog(String name, int age){
		this.name = name;
		this.age = age;

	}

	public void info(){
		System.out.println(name + " " + age);
	}
}