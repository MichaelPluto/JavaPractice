import java.util.Scanner;
public class HomeWork02{
	public static void main(String[] args) {
		//判断一个数范围
	Scanner myScanner = new Scanner(System.in);
		System.out.println("输入一个数字");
		int i= myScanner.nextInt();
		if( i < 0){
			System.out.println("小于0");	
		}else if (i > 0) {
			System.out.println("大于0");
		}else{
			System.out.println("等于0");
		}
		// while(i < 0){
		// 	System.out.println("小于0");	
		// 	break;
		// }
		// while(i > 0){
		// 	System.out.println("大于0");
		// 	break;
		// }
		// while(i == 0){
		// 	System.out.println("等于0");
		// 	break;
		// }

	}
}