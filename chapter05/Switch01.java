import java.util.Scanner;
public class Switch01{
	public static void main(String[] args) {
	//编写一个程序接受字符：abcdefg
	//a表示星期一，b表示星期二...
	//用switch语句完成	
	Scanner myScanner = new Scanner(System.in);
	System.out.println("输入一个字符");
	char c1 = myScanner.next().charAt(0);
	switch(c1) {
		case 'a' :
			System.out.println("今天星期一");
			break;
		case 'b' :
			System.out.println("今天星期二");
			break;
		case 'c' :
			System.out.println("今天星期三");
			break;
		case 'd' :
			System.out.println("今天星期四");
			break;
		case 'e' :
			System.out.println("今天星期五");
			break;
		case 'f' :
			System.out.println("今天星期六");
			break;
		case 'g' :
			System.out.println("今天星期天");
		default:
			System.out.println("输入错误");

		}System.out.println("程序继续");
	} 
}