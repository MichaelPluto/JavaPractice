import java.util.Scanner;
public class Nestedif{
	public static void main(String[] args) {
		//�μӸ��ֱ�������������ɼ����� 8.0 ���������
		//������ʾ��̭�����Ҹ����Ա���ʾ�����������Ů����
		Scanner myScanner  = new Scanner(System.in);
		System.out.println("����ɼ�");
		double score = myScanner.nextDouble();
		if(score > 8.0){
			System.out.println("�����Ա�");
			char gender = myScanner.next().charAt(0);
			if(gender == '��'){
				System.out.println("����������");

			}else if (gender == 'Ů') {
				System.out.println("����Ů����");

				
			}else{
				System.out.println("�Ա���������");
			}


		}else{
			System.out.println("�ɼ����ϸ���̭");
		}
	}
}