import java.util.Scanner;
public class HomeWork02{
	public static void main(String[] args) {
		//�ж�һ������Χ
	Scanner myScanner = new Scanner(System.in);
		System.out.println("����һ������");
		int i= myScanner.nextInt();
		if( i < 0){
			System.out.println("С��0");	
		}else if (i > 0) {
			System.out.println("����0");
		}else{
			System.out.println("����0");
		}
		// while(i < 0){
		// 	System.out.println("С��0");	
		// 	break;
		// }
		// while(i > 0){
		// 	System.out.println("����0");
		// 	break;
		// }
		// while(i == 0){
		// 	System.out.println("����0");
		// 	break;
		// }

	}
}