import java.util.Scanner;
public class ArrayReduce{
	public static void main(String[] args) {
		//有一个数组 {1， 2， 3， 4， 5}， 
		// 可以将该数组进行缩减，提示用户是否继续缩减，
		// 每次缩减最后那个元素。当只剩下最后一个元素，
		// 提示，不能再缩减
		int []arr1 = {1, 2, 3, 4, 5};
		do{
		Scanner myScanner = new Scanner(System.in);
			System.out.println("输入缩减多少个元素");
			int redNum = myScanner.nextInt();
		int []arr2 = new int[arr1.length - redNum];
		for(int i = 0; i < arr1.length - redNum; i++){
			arr2[i] = arr1[i];
		}
			arr1 = arr2;
		for(int i = 0; i < arr1.length; i++){
			System.out.print(arr1[i] + "\t");
		}
			System.out.println("是否继续缩减y/n?");
			char key = myScanner.next().charAt(0);
			if(key == 'n'){
				break;
			}
			if(arr1.length == 1){
				System.out.println("不能再缩减");
				break;
			}
	 }while(true);
	 		System.out.println("退出");
	}
}