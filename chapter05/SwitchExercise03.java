import java.util.Scanner;
public class SwitchExercise03{
	public static void main(String[] args) {
		//根据用于指定月份，打印该月份所属的季节。
		//3,4,5 春季 6,7,8 夏季 9,10,11 秋季 12, 1, 2 冬季 
		//[课堂练习, 提示使用穿透 ]
	Scanner myScanner = new Scanner(System.in);
		System.out.println("输入月份");
		int month = myScanner.nextInt();
		if(month >= 1 && month <=12){
			switch(month){
			case 3:
			case 4:
			case 5:
				System.out.println("春季");
				break;
			case 6:
			case 7:
			case 8:
				System.out.println("夏季");
				break;
			case 9:	
			case 10:	
			case 11:
				System.out.println("秋季");
				break;
			// case 12:	
			// case 1:	
			// case 2:
			default:
				System.out.println("冬季");
			}
		}else{
			System.out.println("输入有误");
		}
	}
}
