public class FloatDetail{
	public static void main(String[] args) {
		//Java�ĸ����ͳ���Ĭ��Ϊ�������ͣ�����float�ͣ������ӡ�f����F��
		//float num1 = 1.1; //���󣡣�����ȱʧ
		float num2 = 1.1F;//��ȷ
		double num3 = 1.1;//��ȷ
		double num4 = 1.1F;//��ȷ
		//ʮ��������ʽ
		double num5 = .123; // = 0.123
		System.out.println(num5);
		System.out.println(5.12e2);// =512.0
		System.out.println(5.12E-2);// =0.0512
		//ͨ������£�double��float����ȷ
		double num6 = 2.15642315;
		float num7 = 2.15642315F;
		System.out.println(num6);
		System.out.println(num7);
		//������ʹ�����壺2.7��8.1 / 3 �Ƚ�
		//��һ�δ���
		double num11 = 2.7;
		double num12 = 8.1/3;
		System.out.println(num11);//�õ�2.7
		System.out.println(num12);//�õ�һ���ӽ�2.7��һ��С��������2.7
		//�õ�һ����Ҫ��ʹ�õ㣺�����Ƕ���������С����������ж�ʱ��ҪС��
		//Ӧ�������������Ĳ�ֵ�ľ���ֵ����ĳ�����ȷ�Χ���ж�
		if( num11 == num12){
			System.out.println("���");//�������

		}
		if (Math.abs(num11 - num12) < 0.0001) {
			System.out.println("��ֵ��С�����ҹ涨���ȣ���Ϊ���...");
			
		}
		//����ͨ��java API���� 
		System.out.println(Math.abs(num11 - num12));
		//ϸ�ڣ������ֱ�Ӳ�ѯ�õ���С����ֱ�Ӹ�ֵ��С�������


	}
}