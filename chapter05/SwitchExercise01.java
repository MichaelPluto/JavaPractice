import java.util.Scanner;
public class SwitchExercise01{
	public static void main(String[] args) {
		//使用 switch 把大写类型的 char 型转为小写(键盘输入)。
		//只转换 a, b, c, d, e. 其它的输出 "other"。
	Scanner myScanner = new Scanner(System.in);
		System.out.println("输入字符A-E");
		char c1 = myScanner.next().charAt(0);
		switch(c1){
			case 'A':
				System.out.println("a");
				break;
			case 'B':
				System.out.println("b");
				break;
			case 'C':
				System.out.println("c");
				break;
			case 'D':
				System.out.println("d");
				break;
			case 'E':
				System.out.println("e");
				break;
			default:
				System.out.println("other");
		}
	}
}