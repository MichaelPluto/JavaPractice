import java.util.Scanner;
public class DoWhileExercise02{
	public static void main(String[] args) {
	// 	//如果李三不还钱，则老杨将一直使出五连鞭，
	// 	//直到李三说还钱为止
	// Scanner myScanner = new Scanner(System.in);
	// System.out.println("老杨问：还钱吗？ 输入y/n");
	// char answer = myScanner.next().charAt(0);
	// 	do{
	// 		System.out.println("继续拷问");
	// 	}while(answer == 'y');
	// 	System.out.println("结束拷问");
		Scanner myScanner = new Scanner(System.in);
		char answer =' ';
		do{
			System.out.println("老杨使用五连鞭");
			System.out.println("老杨问：还钱吗？ y/n");
			answer = myScanner.next().charAt(0);
			System.out.println("回答是" +answer);

		}while(answer != 'y');
			System.out.println("拷问结束");
	}
}