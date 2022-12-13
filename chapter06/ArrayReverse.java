public class ArrayReverse{
	public static void main(String[] args) {
		//数组翻转


		//定义数组
		int arr [] = {11, 22, 33, 44, 55, 66};
		  //1. 把 arr[0] 和 arr[5] 进行交换 {66,22,33,44,55,11}
          //2. 把 arr[1] 和 arr[4] 进行交换 {66,55,33,44,22,11}
          //3. 把 arr[2] 和 arr[3] 进行交换 {66,55,44,33,22,11}
          //4. 一共要交换 3 次 = arr.length / 2
          //5. 每次交换时，对应的下标 
	      //是 arr[i] 和 arr[arr.length - 1 -i]
		int temp = 0;
		int len = arr.length;
		for(int i = 0; i < len; i++){
			temp = arr[arr.length - 1 -i];
			arr[arr.length - 1 -i] = arr[i];
			arr[i] = temp;

		}
		for(int i = 0; i < len; i++){
			System.out.print(arr[i] + " ");
		}
	}
}