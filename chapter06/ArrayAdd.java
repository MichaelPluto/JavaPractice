import java.util.Scanner;
public class ArrayAdd{
	public static void main(String[] args) {
		// 1. �����ʼ���� int[] arr = {1,2,3}//�±� 0-2
		// 2. ����һ���µ����� int[] arrNew = new int[arr.length+1];
		// 3. ���� arr ���飬���ν� arr ��Ԫ�ؿ����� arrNew ����
		// 4. �� 4 ���� arrNew[arrNew.length - 1] = 4;�� 4 ���� arrNew ���һ��Ԫ��
		// 5. �� arr ָ�� arrNew ; arr = arrNew; ��ô ԭ�� arr ����ͱ�����
		// 6. ����һ�� Scanner ���Խ����û�����
		// 7. ��Ϊ�û�ʲôʱ���˳�����ȷ����ʹ�� do-while + break ������
		Scanner myScanner = new Scanner(System.in);
		//ʵ����������
		int []arr1 = {1, 2, 3,};
		do{
		int []arr2 = new int[arr1.length + 1];
		for(int i = 0; i < arr1.length; i++){
			arr2[i] = arr1[i];//����
		}
		System.out.println("������ӵ�ֵ");
		int addNum = myScanner.nextInt();
		arr2[arr2.length -1] = addNum;//��ĳֵ��ֵ��arr2�����һ��λ��
		arr1 = arr2;

		for(int i = 0; i <arr1.length; i++){
			System.out.print(arr1[i] + " ");
		}
		System.out.println("�Ƿ��������y/n��");
		char c1 = myScanner.next().charAt(0);
		if(c1 == 'n'){//�˳�ѭ��
			break;
		}
	  }while(true);	
	  	System.out.println("�˳�");	
	}
}