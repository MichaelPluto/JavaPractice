import java.util.Scanner;
public class DoWhileExercise02{
	public static void main(String[] args) {
	// 	//�����������Ǯ�������һֱʹ�������ޣ�
	// 	//ֱ������˵��ǮΪֹ
	// Scanner myScanner = new Scanner(System.in);
	// System.out.println("�����ʣ���Ǯ�� ����y/n");
	// char answer = myScanner.next().charAt(0);
	// 	do{
	// 		System.out.println("��������");
	// 	}while(answer == 'y');
	// 	System.out.println("��������");
		Scanner myScanner = new Scanner(System.in);
		char answer =' ';
		do{
			System.out.println("����ʹ��������");
			System.out.println("�����ʣ���Ǯ�� y/n");
			answer = myScanner.next().charAt(0);
			System.out.println("�ش���" +answer);

		}while(answer != 'y');
			System.out.println("���ʽ���");
	}
}