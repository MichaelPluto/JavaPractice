import java.util.Scanner;
public class SwitchExercise01{
	public static void main(String[] args) {
		//ʹ�� switch �Ѵ�д���͵� char ��תΪСд(��������)��
		//ֻת�� a, b, c, d, e. ��������� "other"��
	Scanner myScanner = new Scanner(System.in);
		System.out.println("�����ַ�A-E");
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