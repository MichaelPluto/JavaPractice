import java.util.Scanner;
public class if01{
	public static void main(String[] args) {
	//if的快速入门
	Scanner myScanner = new Scanner(System.in);
	//定义Scanner变量
	System.out.println("输入你的年龄");
	int age = myScanner.nextInt();
	//用 nextInt接收
	if(age >18){
		//用if判断 输出对应信息
		System.out.println("你年龄大于18，要对自己行为负责，送入监狱");
	}
		System.out.println("程序继续执行");

	}
}