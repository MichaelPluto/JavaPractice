public class MethodDetail{
	public static void main(String[] args){
		Detail MerthodDetail = new Detail();
		int[] res = MerthodDetail.getSumAndSub(1,4);
		System.out.println("和=" + res[0]);
		System.out.println("差=" + res[1]);

	}
}
class Detail {
	// 一个方法最多有一个返回值（但返回多个结果可以返回数组）
	public int[] getSumAndSub(int n1, int n2){
		int[] resArr = new int[2]; //创建一个数组
		resArr[0] = n1 + n2;
		resArr[1] = n1 - n2;
		return resArr;
	//	如果方法要求有返回数据类型，则必须执行return
	//  返回类型必须和return的值类型一致或兼容

	}	
	public double num(){

	double d1 = 1.1 * 3;
	return d1;
	// int n = 100;
	// return n;//兼容 int -> double
	// double -> int 不兼容
}
	public void none(){
		System.out.println("Hello");
		System.out.println("Hello");
		System.out.println("Hello");
		int n = 10;
		//return ; //可以有return，但不能有返回值
	}
	}
