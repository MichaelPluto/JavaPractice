import java.util.Scanner;
public class ArrayAdd{
	public static void main(String[] args) {
		// 1. 定义初始数组 int[] arr = {1,2,3}//下标 0-2
		// 2. 定义一个新的数组 int[] arrNew = new int[arr.length+1];
		// 3. 遍历 arr 数组，依次将 arr 的元素拷贝到 arrNew 数组
		// 4. 将 4 赋给 arrNew[arrNew.length - 1] = 4;把 4 赋给 arrNew 最后一个元素
		// 5. 让 arr 指向 arrNew ; arr = arrNew; 那么 原来 arr 数组就被销毁
		// 6. 创建一个 Scanner 可以接受用户输入
		// 7. 因为用户什么时候退出，不确定，使用 do-while + break 来控制
		Scanner myScanner = new Scanner(System.in);
		//实现数组扩容
		int []arr1 = {1, 2, 3,};
		do{
		int []arr2 = new int[arr1.length + 1];
		for(int i = 0; i < arr1.length; i++){
			arr2[i] = arr1[i];//拷贝
		}
		System.out.println("输入添加的值");
		int addNum = myScanner.nextInt();
		arr2[arr2.length -1] = addNum;//将某值赋值给arr2的最后一个位置
		arr1 = arr2;

		for(int i = 0; i <arr1.length; i++){
			System.out.print(arr1[i] + " ");
		}
		System.out.println("是否继续输入y/n？");
		char c1 = myScanner.next().charAt(0);
		if(c1 == 'n'){//退出循环
			break;
		}
	  }while(true);	
	  	System.out.println("退出");	
	}
}