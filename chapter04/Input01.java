import java.util.Scanner;
public class Input01{
	public static void main(String[] args) {
		 Scanner scanner  = new Scanner(System.in);
		 System.out.println("选择你的出生地");
		 String place = scanner.next();
		 System.out.println("输入你的名字");
		 String name = scanner.next();
		 System.out.println("输入你称霸三中的时间");
		 int time = scanner.nextInt();
		 System.out.println("说出你的人生格言");
		 String word = scanner.next();
		 System.out.println("姓名=" +name +" " +"出生地=" + place  + " "+"称霸时间" +time+ " " +"座右铭=" + word );
	}
}