public class TwoDimensionalArray01{
	public static void main(String[] args){
		/*
		请用二维数组输出如下图形
			0 0 0 0 0 0
			0 0 1 0 0 0
			0 2 0 3 0 0
			0 0 0 0 0 0
		*/

		int[][] arr = {{0, 0, 0, 0, 0, 0},
					   {0, 0, 1, 0, 0, 0},
					   {0, 2, 0, 0, 0, 0},
					   {0, 0, 0, 0, 0, 0}};
		//访问第(i+1)个一维数组的第(j+1)个值 -> arr[i][j]
		for(int i = 0; i < arr.length; i++){//遍历二维数组的每个元素
			//遍历二维数组的每个元素（数组）
			//得到对应的每个一维数组的长度
			for(int j = 0; j < arr[i].length; j++){
				System.out.print(arr[i][j] + " ");//输出了一维数组
			}
			System.out.println();//换行
		}
	}
}