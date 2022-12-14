public class HomeWork05{
	public static void main(String[] args){
		int arr[] = new int[10];
		double sum = 0;//和
		int max = arr[0];//最大值
		int maxIndex = -1;//查找最大值下标
		int index = -1;//查找8
		for(int i = 0; i < arr.length; i++){
			arr[i] = (int)(Math.random() * 100) + 1;
		}
		for(int i = arr.length - 1; i >= 0; i--){
			sum += arr[i];
			System.out.print(arr[i] + " ");
			if(max < arr[i]){
				maxIndex = i;
				max = arr[i];
			}

		}
		for(int i = arr.length - 1; i >= 0; i--){
			if(arr[i] == 8){
				System.out.println("\n"+"找到8"+"下标为"+index);
				index = i;
				break;
			}
		}
			if(index == -1){
				System.out.println("\n"+"没有找到8"+);
			}
		System.out.println("\n"+"平均值=" + sum/arr.length);
		System.out.println("最大值=" + max + " " + "下标为" + maxIndex);

	}
}