import java.util.Scanner;
public class Array02{
	public static void main(String[] args) {
		//循环输入5个成绩保存到double数组中 并输出
	double[]score = new double[5];
	Scanner myScanner = new Scanner(System.in);
	for(int i = 0; i < score.length; i++){
		System.out.println("输入第" + (i+1) + "个数字");
		score[i] = myScanner.nextDouble();
	}
	for(int i = 0; i < score.length; i++){
		System.out.println("输出第" + (i+1) + "个数字=" + score[i]);
	}	
	}
}