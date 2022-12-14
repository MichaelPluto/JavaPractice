public class HomeWork07{
	public static void main(String[] args){
		//写出冒泡排序的代码
		// 五个元素排序四趟
		// 每次排序比较次数从四次依次减少
		 // 1 第一躺排序
		 // 1 第一次比较[24,69,80,57,13]
		 // 2 第二次比较[24,69,80,57,13]
		 // 3 第三次比较[24,69,57,80,13]
		 // 4 第四次比较[24,69,57,13,80]
		int arr[] = {24,69,80,57,13};
		int temp = 0;
		for(int j = 0; j < arr.length-1; j++){//外层循环
		for(int i = 0; i < arr.length-1-j; i++){//内层比较
			if(arr[i] > arr[i+1]){
				temp = arr[i];
				arr[i] = arr[i+1];
				arr[i+1] = temp;
			}
		
		}
		for(int i = 0; i < arr.length; i++){
				System.out.print(arr[i] + " ");
			}
				System.out.println();
		}

	}
}