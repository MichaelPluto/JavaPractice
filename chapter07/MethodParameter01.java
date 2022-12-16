public class MethodParameter01{
	public static void main(String[] args){
	int a = 10;
	int b = 20;
	AA Obj = new AA();
		Obj.swap(a,b);
		System.out.println("main方法中的a和b为" + a +" " + b);
	}
}
class AA{
	public void swap(int a, int b){
		System.out.println("交换前的a和b" + a + " " + b );
		int temp = a;
		a = b;
		b = temp;
		System.out.println("交换后的a和b" + a + " " + b);
	}
}