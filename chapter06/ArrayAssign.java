public class ArrayAssign{
	public static void main(String[] args) {
		//数组赋的值是地址，赋值方式为引用赋值
		//arr2的变化会影响arr1;
		int[] arr1 = {1, 2, 3};
		int[] arr2 = arr1;//把arr1赋给arr2;
		arr2[0] = 10;//修改arr2第一个值

		//看看arr1的值
		for(int i = 0; i < arr1.length; i++){
			System.out.println(arr1[i]);
		}
	}
}