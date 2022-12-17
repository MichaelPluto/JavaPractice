public class MiGong{
	public static void main(String[] args){
		//思路
		//1.先创建迷宫，int [][]arr = new int[8][7]
		//2.用0表示可以走；1表示障碍物；
		//3.第1行和第8行全为1；
		//4.第1列和第7列全为1；
		int [][]map = new int[8][7];
		//将第1行和第8行全赋值1；
		for(int i = 0; i < 7; i++){
			map[0][i] = 1;
			map[7][i] = 1;
		}
		//将第1列和第7列全赋值1；
		for(int i = 0; i < 8; i++){
			map[i][0] = 1;
			map[i][6] = 1;
		}

		map[3][1] = 1;
		map[3][2] = 1;
		// 遍历输出数组
		// for(int i = 0; i < arr.length; i++){
		// 	for(int j = 0; j < arr[i].length; j++){
		// 		System.out.print(arr[i][j] + " ");
		// 	}
		// 	System.out.println();
		// }	
		MyTools t = new MyTools();
		t.miGong(map, 1, 1);
		System.out.println("=======找路的情况=======");
		for(int i = 0; i < map.length; i++){
		 for(int j = 0; j < map[i].length; j++){
				System.out.print(map[i][j] + " ");
			}
		 	System.out.println();
	 }	
		
	}
}
class MyTools{
	//思路：
	// 1.返回值类型选择 boolean；
	// 2.方法名为MiGong；
	// 3.形参为（int [][]map , int i, int j）// i和j表示当前老鼠所在棋盘的具体位置
	// 4.方法体为 递归调用方法；
	public boolean miGong(int [][]map, int i, int j){
		//0表示可以走，1表示障碍物，2表示可以走且标记为已经走过的路，3表示走过发现走不通的路
		//最终可以根据2的路线判断老鼠出迷宫的路线
		//if判断若arr[6][5]这个位置为2，则代表已经找到出口
		//否则进入递归调用
		if(map[6][5] == 2){
			return true;
		}else{
		//假定初始位置为0，表示可以走，下一步考虑走的方向
		//初步考虑为→ ↓ ← ↑；有多种方法皆可
			if(map[i][j] == 0){//
				map[i][j] = 2;//将此位置赋值为2，表示可以走通且已经走过
				//开始进行方向判断
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