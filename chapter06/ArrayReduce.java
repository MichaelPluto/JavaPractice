import java.util.Scanner;
public class ArrayReduce{
	public static void main(String[] args) {
		//��һ������ {1�� 2�� 3�� 4�� 5}�� 
		// ���Խ������������������ʾ�û��Ƿ����������
		// ÿ����������Ǹ�Ԫ�ء���ֻʣ�����һ��Ԫ�أ�
		// ��ʾ������������
		int []arr1 = {1, 2, 3, 4, 5};
		do{
		Scanner myScanner = new Scanner(System.in);
			System.out.println("�����������ٸ�Ԫ��");
			int redNum = myScanner.nextInt();
		int []arr2 = new int[arr1.length - redNum];
		for(int i = 0; i < arr1.length - redNum; i++){
			arr2[i] = arr1[i];
		}
			arr1 = arr2;
		for(int i = 0; i < arr1.length; i++){
			System.out.print(arr1[i] + "\t");
		}
			System.out.println("�Ƿ��������y/n?");
			char key = myScanner.next().charAt(0);
			if(key == 'n'){
				break;
			}
			if(arr1.length == 1){
				System.out.println("����������");
				break;
			}
	 }while(true);
	 		System.out.println("�˳�");
	}
}