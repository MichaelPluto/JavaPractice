public class ArrayExercise01{
	public static void main(String[] args) {
		// ����һ�� char ���͵� 26 ��Ԫ�ص����飬�ֱ� ����'A'-'Z'��
		//ʹ�� for ѭ����������Ԫ�ز���ӡ������
		//��ʾ��char ������������ 'A'+2 -> 'C
		char [] c1 = new char[26];
		for(int i = 0; i < c1.length; i++){
			c1[i] = (char)('A' + i);
		}
		for(int i = 0; i < c1.length; i++){

			System.out.print(c1[i] + " ");

		}
		

	}
}