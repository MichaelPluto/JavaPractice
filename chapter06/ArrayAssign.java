public class ArrayAssign{
	public static void main(String[] args) {
		//���鸳��ֵ�ǵ�ַ����ֵ��ʽΪ���ø�ֵ
		//arr2�ı仯��Ӱ��arr1;
		int[] arr1 = {1, 2, 3};
		int[] arr2 = arr1;//��arr1����arr2;
		arr2[0] = 10;//�޸�arr2��һ��ֵ

		//����arr1��ֵ
		for(int i = 0; i < arr1.length; i++){
			System.out.println(arr1[i]);
		}
	}
}