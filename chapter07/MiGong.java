public class MiGong{
	public static void main(String[] args){
		//˼·
		//1.�ȴ����Թ���int [][]arr = new int[8][7]
		//2.��0��ʾ�����ߣ�1��ʾ�ϰ��
		//3.��1�к͵�8��ȫΪ1��
		//4.��1�к͵�7��ȫΪ1��
		int [][]map = new int[8][7];
		//����1�к͵�8��ȫ��ֵ1��
		for(int i = 0; i < 7; i++){
			map[0][i] = 1;
			map[7][i] = 1;
		}
		//����1�к͵�7��ȫ��ֵ1��
		for(int i = 0; i < 8; i++){
			map[i][0] = 1;
			map[i][6] = 1;
		}

		map[3][1] = 1;
		map[3][2] = 1;
		// �����������
		// for(int i = 0; i < arr.length; i++){
		// 	for(int j = 0; j < arr[i].length; j++){
		// 		System.out.print(arr[i][j] + " ");
		// 	}
		// 	System.out.println();
		// }	
		MyTools t = new MyTools();
		t.miGong(map, 1, 1);
		System.out.println("=======��·�����=======");
		for(int i = 0; i < map.length; i++){
		 for(int j = 0; j < map[i].length; j++){
				System.out.print(map[i][j] + " ");
			}
		 	System.out.println();
	 }	
		
	}
}
class MyTools{
	//˼·��
	// 1.����ֵ����ѡ�� boolean��
	// 2.������ΪMiGong��
	// 3.�β�Ϊ��int [][]map , int i, int j��// i��j��ʾ��ǰ�����������̵ľ���λ��
	// 4.������Ϊ �ݹ���÷�����
	public boolean miGong(int [][]map, int i, int j){
		//0��ʾ�����ߣ�1��ʾ�ϰ��2��ʾ�������ұ��Ϊ�Ѿ��߹���·��3��ʾ�߹������߲�ͨ��·
		//���տ��Ը���2��·���ж�������Թ���·��
		//if�ж���arr[6][5]���λ��Ϊ2��������Ѿ��ҵ�����
		//�������ݹ����
		if(map[6][5] == 2){
			return true;
		}else{
		//�ٶ���ʼλ��Ϊ0����ʾ�����ߣ���һ�������ߵķ���
		//��������Ϊ�� �� �� �����ж��ַ����Կ�
			if(map[i][j] == 0){//
				map[i][j] = 2;//����λ�ø�ֵΪ2����ʾ������ͨ���Ѿ��߹�
				//��ʼ���з����ж�
				if(miGong(map, i, j+1)){

					return true;
				}else if(miGong(map, i+1, j)){

					return true;
				}else if (miGong(map, i, j-1)) {

					return true;
				}else if(miGong(map, i-1, j)){

					return true;
				}else{
					return false;
				}
			}else{
				return false;
			}

		}

		

	}
}