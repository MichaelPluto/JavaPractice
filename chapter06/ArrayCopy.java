public class ArrayCopy{
	public static void main(String[] args) {
		//将arr1的数据拷贝到arr2中
		int arr1[] = {1, 2, 3, 4};
		//创建一个新的数组arr2，开辟新数据空间，
		//大小arr1.length
		int arr2[] = new int[arr1.length];
		for(int i = 0; i < arr1.length; i++){
			arr2[i] = arr1[i];

		}
		arr2[0] = 100;//修改第一个元素值

		System.out.println("arr1的元素");
		for(int i = 0; i < arr1.length; i++){

			System.out.println(arr1[i]);

		}
		System.out.println("arr2的元素");
		for(int i = 0; i < arr2.length; i++){

			System.out.println(arr2[i]);

		}
	}
}