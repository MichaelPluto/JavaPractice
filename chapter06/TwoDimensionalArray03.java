public class TwoDimensionalArray03{
	public static void main(String[] args){
	int arr[][] = new int[3][];
	for(int i = 0; i < arr.length; i++){
		arr[i] = new int[i + 1];//给每个一维数组开辟空间
		for(int j = 0; j < arr[i].length; j++){
			arr[i][j] = i + 1;//给每个一维数组每个空间赋值
			//arr[0][0]=1 
			//arr[1][0]=2 arr[1][1]= 2
			//arr[2][0]=3 arr[2][1]= 3 arr[2][2]= 3  
		}
	}
	for(int i = 0; i < arr.length; i++){
		for(int j = 0; j < arr[i].length; j++){
			System.out.print(arr[i][j] + " ");
		}
		System.out.println();//换行
	}
	}
}