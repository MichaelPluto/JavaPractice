public class TwoDimensionalArray01{
	public static void main(String[] args){
		/*
		���ö�ά�����������ͼ��
			0 0 0 0 0 0
			0 0 1 0 0 0
			0 2 0 3 0 0
			0 0 0 0 0 0
		*/

		int[][] arr = {{0, 0, 0, 0, 0, 0},
					   {0, 0, 1, 0, 0, 0},
					   {0, 2, 0, 0, 0, 0},
					   {0, 0, 0, 0, 0, 0}};
		//���ʵ�(i+1)��һά����ĵ�(j+1)��ֵ -> arr[i][j]
		for(int i = 0; i < arr.length; i++){//������ά�����ÿ��Ԫ��
			//������ά�����ÿ��Ԫ�أ����飩
			//�õ���Ӧ��ÿ��һά����ĳ���
			for(int j = 0; j < arr[i].length; j++){
				System.out.print(arr[i][j] + " ");//�����һά����
			}
			System.out.println();//����
		}
	}
}