public class YangHui{
	public static void main(String[] args){
		/*
		��ӡʮ���������
		����
		1.��һ���� 1 ��Ԫ��, �� n ���� n ��Ԫ��
		2.ÿһ�еĵ�һ��Ԫ�غ����һ��Ԫ�ض��� 1
		3.�ӵ����п�ʼ, ���ڷǵ�һ��Ԫ�غ����һ��Ԫ�ص�Ԫ�ص�ֵ. 
		arr[i][j]arr[i][j] = arr[i-1][j] + arr[i-1][j-1]; 
		�����ҵ��������
		*/
		int arr [][] = new int[10][];//���ٿռ�
		for(int i = 0; i < arr.length; i++){//������ά������һά����ĸ���
			arr[i] = new int[i+1];//��ÿһ��һά���鸳ֵ���ܴ���Ԫ�صĸ�����
			for(int j = 0; j < arr[i].length; j++){//����һά�����Ԫ�ظ���
				if(j==0 || j == arr[i].length - 1){//��һ��Ԫ�غ����һ��Ԫ�����
					arr[i][j] = 1;
				}else{
					arr[i][j] = arr[i-1][j] + arr[i-1][j-1];//�м��Ԫ�� = ��һ��ͬһ�е�Ԫ�� + ��һ����һ�е�Ԫ��
				}
			}
		}
		for(int i = 0; i < arr.length; i++){
			for(int j = 0; j < arr[i].length; j++){
				System.out.print(arr[i][j]+ "\t");
			}
				System.out.println();//����
		}
			
	}
}