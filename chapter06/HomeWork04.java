import java.util.Scanner;
public class HomeWork04{
	public static void main(String[] args){
	//将25插入数组，并保持升序
		Scanner myScanner = new Scanner(System.in);
		int arr1[] = {10, 12, 45, 90};
		int index = -1;//下标索引
		System.out.println("输入插入的数字");
		int addNnm = myScanner.nextInt();
		//判断位置
	for(int i = 0; i < arr1.length; i++){
		if(addNnm <= arr1[i]){//判断数据插入的位置，用index记录
			index = i;
			break;//找到后立刻退出循环，不然还会与后面更大的数进行比较
		}
	}	
		if(index == -1){
			index = arr1.length;
		}
		System.out.println(index);

		//扩容
		int arr2[] = new int[arr1.length + 1];
		for(int i = 0,j = 0; i < arr2.length; i++){
			if(i != index){
				arr2[i] = arr1[j];
				j++;
			}else{
				arr2[i] = addNnm;
			}
		}
			arr1 = arr2;//引用赋值
			//输出
		for(int i = 0; i < arr1.length; i++){
			System.out.print(arr1[i] + " ");
		}
	}
}