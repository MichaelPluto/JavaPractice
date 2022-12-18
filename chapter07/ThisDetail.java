public class ThisDetail{
	public static void main(String[] args){
		T t1 = new T();
		
	}
}
class T {

	public T(){
		this("jack", 100);
		System.out.println("T() 构造器");

	}

	public T(String name, int age){
		System.out.println("T(String name, int age)构造器");
	}


}