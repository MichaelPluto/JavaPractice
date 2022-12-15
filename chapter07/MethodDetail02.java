public class MethodDetail02{
	public static void main(String[] args){
		A a = new A();
		a.sayOk();//同类中的方法调用
		a.m1();//不同类中的方法调用
	}
}
class A{
	//同一类中的方法调用： 直接调用即可
	//
	public void print(int n){
		System.out.println("print()方法被调用 n=" + n);

	}
	public void sayOk(){
		print(10);//sayOk调用 print直接调用
		System.out.println("\n继续执行sayOk");
	}
	public void m1(){
		B b = new B();
		b.hi();//调用B类中的方法hi
		System.out.println("\nB类中的hi()执行完后的返回");
	}
}

class B{
	//不同类中的方法调用：需要通过对象名调用
	public void hi(){
		System.out.println("B类中的hi()被执行");
	}
}