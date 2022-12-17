public class VarScopeDetail{
	public static void main(String[] args){

	}
}
class Person {

	//public String name = "jack";
	//属性可以加修饰符
	String name = "jack";

	public void say(){
			//属性和局部变量可以重名，访问遵循就近原则
			String name = "king";
	//public		String name = "king";
			//局部变量不能加修饰符
			System.out.println("say() name = " + name);
	}
	public void hi(){
		String address = "北京";
		//String address = "上海"; 同一作用域的局部变量名字不能一样

	}
}