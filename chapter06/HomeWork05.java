public class HomeWork05{
	public static void main(String[] args){
		int arr[] = new int[10];
		double sum = 0;//��
		int max = arr[0];//���ֵ
		int maxIndex = -1;//�������ֵ�±�
		int index = -1;//����8
		for(int i = 0; i < arr.length; i++){
			arr[i] = (int)(Math.random() * 100) + 1;
		}
		for(int i = arr.length - 1; i >= 0; i--){
			sum += arr[i];
			System.out.print(arr[i] + " ");
			if(max < arr[i]){
				maxIndex = i;
				max = arr[i];
			}

		}
		for(int i = arr.length - 1; i >= 0; i--){
			if(arr[i] == 8){
				System.out.println("\n"+"�ҵ�8"+"�±�Ϊ"+index);
				index = i;
				break;
			}
		}
			if(index == -1){
				System.out.println("\n"+"û���ҵ�8"+);
			}
		System.out.println("\n"+"ƽ��ֵ=" + sum/arr.length);
		System.out.println("���ֵ=" + max + " " + "�±�Ϊ" + maxIndex);

	}
}