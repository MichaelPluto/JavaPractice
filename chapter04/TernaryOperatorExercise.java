  public class TernaryOperatorExercise{
	public static void main(String[] args) {
		//ʵ�������������ֵ
		int n1 = 55;
		int n2 = 33;
		int n3 = 123;
		//1.�ȵõ� n1 �� n2�е�����������浽max1
		//2.Ȼ�������max1 �� n3�е�����������浽 max2
		//3.���max2
		int max1 = n1 > n2? n1 : n2;
		int max2 = n3 > max1? n3 : max1;
		System.out.println("�����Ϊ" + max2);
		//ʹ��Ƕ�����ʵ��,�Ƽ�ʹ�����淽��
		//�����и��õķ�������������
		int max =(n1 > n2? n1 : n2) > n3? (n1 > n2? n1 : n2): n3;
		System.out.println("���ֵΪ" + max);
	}
}
  