public class Queen{
	public static void main(String[] args){
		int [][]map = new int [8][8];

	}
}
class MyTools{
	//����
	// 1.����ֵ���� boolean
	// 2.������chees
	// 3.�βΣ�int[][] map, i, j��
	// 4.������ �ݹ����
	public boolean chees(int[][] map, int i, int j){
		//0��ʾ���Էŵ�λ��, 2��ʾ�ʺ�ŵ�λ��
		if(map[i][j] == 0){
			map][i][j] = 2;
			if(chees(map, i+1, j)){
				return ;
			}else if(chees){

			}
		}else{
			return false;
		}
	}
}