public class VarParameterDetail {
	public static void main(String[] args){
	int []arr = {1,2,3,};
	T t = new T();
		t.f1(arr);
	}
}
class T {
	public void f1(int... nums) {
		System.out.println("长度=" + nums.length);
	}
	public void f2(String str,double...nums){

	}
	// public void f2(double...nums,String str){
		// 可变参数和普通参数放在一起时，必须保证在最后
	// }
	// public void f3(int...nums,double...nums){
		//	一个形参列表中最多只能有一个可变参数
	// }
}