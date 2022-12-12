import java.util.Scanner;
public class HomeWork04{
	public static void main(String[] args) {
		//判断一个整数是否为水仙花数
		//水仙花数：其各个上数字的立方之和等于其本身
		//num的百位 = num /100
		//num的十位 = num /10 % 10
		//num的百位 = num % 10

	Scanner myScanner = new Scanner(System.in);
	System.out.println("输入一个三位整数");
	int num = myScanner.nextInt();
	int num1 = (num / 100)*(num / 100)*(num / 100);//百位上数的立方
	int num2 = (num / 10 % 10)*(num / 10 % 10)*(num / 10 % 10);//十位上数的立方
	int num3 = (num % 10)*(num % 10)*(num % 10);//个位上数的立方
	if(num1 + num2 + num3 == num){
		System.out.println(num +"为水仙花数");
	}else{
		System.out.println(num +"不是水仙花数");
	}
	}
}