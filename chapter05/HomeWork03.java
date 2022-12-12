import java.util.Scanner;
public class HomeWork03{
	public static void main(String[] args) {
		//判断一个年份是否为闰年
	Scanner myScanner = new Scanner(System.in);
		System.out.println("输入一个年份");	
		int year = myScanner.nextInt();
		if(year % 4 == 0){
			System.out.println("为闰年");
		}else{
			System.out.println("不是闰年");
		}

	}
}