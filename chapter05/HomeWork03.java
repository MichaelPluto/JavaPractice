import java.util.Scanner;
public class HomeWork03{
	public static void main(String[] args) {
		//�ж�һ������Ƿ�Ϊ����
	Scanner myScanner = new Scanner(System.in);
		System.out.println("����һ�����");	
		int year = myScanner.nextInt();
		if(year % 4 == 0){
			System.out.println("Ϊ����");
		}else{
			System.out.println("��������");
		}

	}
}