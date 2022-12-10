import java.util.Scanner;
public class ifExercise04{
	public static void main(String[] args) {
	//判断一个数的奇偶性
	  Scanner myScanner  =  new Scanner(System.in);
	  System.out.println("输入一个数字");
	  int num = myScanner.nextInt();
	  if(num % 2 ==0){
	  	System.out.println("为偶数");
	  }else{
	  	System.out.println("为奇数");
	  }

	}
}