/*
 *��ʾ�����������ʹ��
 */
public class ArithmeticOperator{
	public static void main(String[] args) {
		System.out.println(10 / 4);//����ѧ����2.5 java����2
		System.out.println(10.0 / 4);//java��2.5
		double d =10 / 4;//java�� 10/4 = 2��2=>2.0
		System.out.println(d);
		// % ȡģ
		//��%�ı���Ϊ a % b=a - a / b * b
		//10 % -3 = 10 - 10 / (-3) * (-3)= 10-9=1
		System.out.println(10 % 3);// 1
		System.out.println(-10 % 3);// -1
		System.out.println(10 % -3);// 1
		System.out.println(-10 % -3);// -1
		//++��ʹ��
		int i= 10;
		i++;//i = 11
		++i;//i = 12
		System.out.println(i);
		/*��Ϊ���ʽʹ��
		 ǰ++ ++i��������ֵ
		 ��++ i++�ȸ�ֵ������
		 */
		 int j = 8;
		 //int k = ++j;//�ȼ� j=j+1;k=j;
		 int k = j++; //�ȼ� k=j; j+1;
		 System.out.println("k = " +k +" "+"j = "+ j);
	}
}