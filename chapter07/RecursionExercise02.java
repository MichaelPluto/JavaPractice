public class RecursionExercise02{
	public static void main(String[] args){
		MyTools t1 = new MyTools();
		int num = t1.peach(1);
		if(num != -1){
		System.out.println("һ����" +t1.peach(1) + "����");
	}
	}
}
class MyTools {
	//���ӳ���������
	// 	���ӳ��������⣺��һ�����ӣ�
	// 	���ӵ�һ��������е�һ�룬
	// 	���ٶ����һ����
	// �Ժ�ÿ����Ӷ������е�һ�룬
	// Ȼ���ٶ��һ���������� 10 ��ʱ��
	// ���ٳ�ʱ������û�ԣ�������ֻ�� 1 �������ˡ�
	// ���⣺��������ٸ����ӣ�
	//˼·���Ӻ���ǰ�� ��ʮ��ʣ1�����ӣ��ھ���������ӦΪ (1+1)*2 = 4����
	//		�ڰ���������ӦΪ��4+1)*2 = 10�� �Դ����ƣ�
	//      ǰһ������� = ����һ������� + 1��* 2
	// 1.����ֵ��int
	// 2.��������peach
	// 3.�β�Ϊ��int day;��¼����
	// 4.�����壺�ݹ����
	// i = 10 �� 1 ������
	// i = 9 �� (day10+1)*2 = 4��
	// i = 8 �� (day9+1)*2 = 10��
	public int peach(int day){
		if(day == 10){
			return 1;
		}else if(day >= 1 && day <=9){//�ݹ�Ҫ���ſ� 
			return (peach(day + 1) + 1) * 2;
		}else{
			System.out.println("��������");
			return -1;
		}
	}
}