public class ArrayCopy{
	public static void main(String[] args) {
		//��arr1�����ݿ�����arr2��
		int arr1[] = {1, 2, 3, 4};
		//����һ���µ�����arr2�����������ݿռ䣬
		//��Сarr1.length
		int arr2[] = new int[arr1.length];
		for(int i = 0; i < arr1.length; i++){
			arr2[i] = arr1[i];

		}
		arr2[0] = 100;//�޸ĵ�һ��Ԫ��ֵ

		System.out.println("arr1��Ԫ��");
		for(int i = 0; i < arr1.length; i++){

			System.out.println(arr1[i]);

		}
		System.out.println("arr2��Ԫ��");
		for(int i = 0; i < arr2.length; i++){

			System.out.println(arr2[i]);

		}
	}
}