import java.util.Scanner;
public class HomeWork04{
	public static void main(String[] args){
	//��25�������飬����������
		Scanner myScanner = new Scanner(System.in);
		int arr1[] = {10, 12, 45, 90};
		int index = -1;//�±�����
		System.out.println("������������");
		int addNnm = myScanner.nextInt();
		//�ж�λ��
	for(int i = 0; i < arr1.length; i++){
		if(addNnm <= arr1[i]){//�ж����ݲ����λ�ã���index��¼
			index = i;
			break;//�ҵ��������˳�ѭ������Ȼ������������������бȽ�
		}
	}	
		if(index == -1){
			index = arr1.length;
		}
		System.out.println(index);

		//����
		int arr2[] = new int[arr1.length + 1];
		for(int i = 0,j = 0; i < arr2.length; i++){
			if(i != index){
				arr2[i] = arr1[j];
				j++;
			}else{
				arr2[i] = addNnm;
			}
		}
			arr1 = arr2;//���ø�ֵ
			//���
		for(int i = 0; i < arr1.length; i++){
			System.out.print(arr1[i] + " ");
		}
	}
}