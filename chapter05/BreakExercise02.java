import java.util.Scanner;
public class BreakExercise02{
	public static void main(String[] args) {
		//ʵ�ֵ�¼��֤���� 3 �λ��ᣬ
		// ����û���Ϊ"����" ,����"666"��ʾ��¼�ɹ���
		// ������ʾ���м��λ��ᣬ��ʹ�� for+break
		//˼·��
		 //1.��Scanner������ռ�������
		// 2.��equals �ж��ַ�������
		// 3.��count��¼�������

	Scanner myScanner = new Scanner(System.in);
		int count = 3;
		for(int i = 1; i <=3; i++){
			System.out.println("�����û���");
			String name = myScanner.next();
			System.out.println("����������");
			int password = myScanner.nextInt();
				if("����".equals(name) && password == 666){//�ַ������ݱȽ���equals��
			//  if(name.equals("����"))		
				System.out.println("��¼�ɹ�");
				break ;
			}	
			System.out.println("�������");
			count--;
			System.out.println("����" + count +"�λ���");

		}

		}
	}
