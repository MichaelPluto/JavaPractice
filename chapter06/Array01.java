public class Array01{
	public static void main(String[] args) {
		//һ���������� 6 ֻ�������ǵ����طֱ��� 
		// 3kg,5kg,1kg,3.4kg,2kg,50kg ��
		// ��������ֻ�����������Ƕ���?
		// ƽ�������Ƕ���? �����һ������


		//����һ������
		double[] hens = {3, 5, 1, 3.4, 2, 50};
		System.out.println("ʹ��������");
		//������ ������.length �õ�����Ĵ�С����
		System.out.println("����ĳ���=" + hens.length);
		double totalWeight = 0;
		 //��������õ����������Ԫ�صĺͣ�ʹ��forѭ��
		for(int i = 0; i < hens.length; i++){
			System.out.println("��"+ (i + 1) + "��Ԫ�ص�ֵ=" + hens[i]);
			totalWeight += hens[i];

		}
			System.out.println("������Ϊ" + totalWeight + "  " + "ƽ������Ϊ" + totalWeight / hens.length);
	}
}