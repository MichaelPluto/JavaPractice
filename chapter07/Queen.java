public class Queen{
	public static void main(String[] args){
		int [][]map = new int [8][8];

	}
}
class MyTools{
	//方法
	// 1.返回值类型 boolean
	// 2.方法名chees
	// 3.形参（int[][] map, i, j）
	// 4.方法体 递归调用
	public boolean chees(int[][] map, int i, int j){
		//0表示可以放的位置, 2表示皇后放的位置
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