public class ArrayExercise02{
	public static void main(String[] args) {
		//������� {4, -1, 9, 10, 23}���ֵ ���ö�Ӧ�±�

		 int num[] = {4, -1, 9, 10, 23, 888};
		 int max = num[0];//�����һ��Ԫ��Ϊ���ֵ(�ڱ�)
		 int maxindex = 0;// Ϊ���ֵ�����±�
		for(int i = 1; i < num.length; i++){
	         //i = 1 ����ΪҪ�ӵ�2��Ԫ�ؽ��жԱ�
			if(max < num[i] ){
				max = num[i];
				maxindex = i;
			}
		}
			System.out.println("���ֵΪ" + max + "�����±�Ϊ" + maxindex);
	}
}