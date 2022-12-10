import java.util.Scanner;
public class ifExercise03{
	public static void main(String[] args) {
	//判断一个年份是否为闰年
	  Scanner myScanner	  = new Scanner(System.in);
	  System.out.println("输入年份");
	  int year = myScanner.nextInt();
	  if(year % 4 ==0 && year % 100 != 0){
	  	System.out.println("该年份为闰年");	
	  }else if (year % 400 == 0) {
	  	System.out.println("该年份为闰年");

	  	
	  }else{
	  	System.out.println("不是闰年");
	  }


	}
}