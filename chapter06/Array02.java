import java.util.Scanner;
public class Array02{
	public static void main(String[] args) {
		//ѭ������5���ɼ����浽double������ �����
	double[]score = new double[5];
	Scanner myScanner = new Scanner(System.in);
	for(int i = 0; i < score.length; i++){
		System.out.println("�����" + (i+1) + "������");
		score[i] = myScanner.nextDouble();
	}
	for(int i = 0; i < score.length; i++){
		System.out.println("�����" + (i+1) + "������=" + score[i]);
	}	
	}
}