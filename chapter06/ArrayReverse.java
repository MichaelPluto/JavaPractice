public class ArrayReverse{
	public static void main(String[] args) {
		//���鷭ת


		//��������
		int arr [] = {11, 22, 33, 44, 55, 66};
		  //1. �� arr[0] �� arr[5] ���н��� {66,22,33,44,55,11}
          //2. �� arr[1] �� arr[4] ���н��� {66,55,33,44,22,11}
          //3. �� arr[2] �� arr[3] ���н��� {66,55,44,33,22,11}
          //4. һ��Ҫ���� 3 �� = arr.length / 2
          //5. ÿ�ν���ʱ����Ӧ���±� 
	      //�� arr[i] �� arr[arr.length - 1 -i]
		int temp = 0;
		int len = arr.length;
		for(int i = 0; i < len; i++){
			temp = arr[arr.length - 1 -i];
			arr[arr.length - 1 -i] = arr[i];
			arr[i] = temp;

		}
		for(int i = 0; i < len; i++){
			System.out.print(arr[i] + " ");
		}
	}
}