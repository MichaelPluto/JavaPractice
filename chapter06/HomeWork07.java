public class HomeWork07{
	public static void main(String[] args){
		//д��ð������Ĵ���
		// ���Ԫ����������
		// ÿ������Ƚϴ������Ĵ����μ���
		 // 1 ��һ������
		 // 1 ��һ�αȽ�[24,69,80,57,13]
		 // 2 �ڶ��αȽ�[24,69,80,57,13]
		 // 3 �����αȽ�[24,69,57,80,13]
		 // 4 ���ĴαȽ�[24,69,57,13,80]
		int arr[] = {24,69,80,57,13};
		int temp = 0;
		for(int j = 0; j < arr.length-1; j++){//���ѭ��
		for(int i = 0; i < arr.length-1-j; i++){//�ڲ�Ƚ�
			if(arr[i] > arr[i+1]){
				temp = arr[i];
				arr[i] = arr[i+1];
				arr[i+1] = temp;
			}
		
		}
		for(int i = 0; i < arr.length; i++){
				System.out.print(arr[i] + " ");
			}
				System.out.println();
		}

	}
}