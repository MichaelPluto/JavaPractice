import java.util.Scanner;
public class if02{
	public static void main(String[] args) {
	//if�Ŀ�������
	Scanner myScanner = new Scanner(System.in);
	//����Scanner����
	System.out.println("�����������");
	int age = myScanner.nextInt();
	//�� nextInt����
	if(age >18){
		//��if�ж� �����Ӧ��Ϣ
		System.out.println("���������18��Ҫ���Լ���Ϊ�����������");
	}
		else {
		System.out.println("������䲻����ηŹ���");
		}

	}
}