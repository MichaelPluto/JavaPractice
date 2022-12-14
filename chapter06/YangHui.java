public class YangHui{
	public static void main(String[] args){
		/*
		打印十行杨辉三角
		规律
		1.第一行有 1 个元素, 第 n 行有 n 个元素
		2.每一行的第一个元素和最后一个元素都是 1
		3.从第三行开始, 对于非第一个元素和最后一个元素的元素的值. 
		arr[i][j]arr[i][j] = arr[i-1][j] + arr[i-1][j-1]; 
		必须找到这个规律
		*/
		int arr [][] = new int[10][];//开辟空间
		for(int i = 0; i < arr.length; i++){//遍历二维数组中一维数组的个数
			arr[i] = new int[i+1];//给每一个一维数组赋值（能储存元素的个数）
			for(int j = 0; j < arr[i].length; j++){//遍历一维数组的元素个数
				if(j==0 || j == arr[i].length - 1){//第一个元素和最后一个元素相等
					arr[i][j] = 1;
				}else{
					arr[i][j] = arr[i-1][j] + arr[i-1][j-1];//中间的元素 = 上一行同一列的元素 + 上一行上一列的元素
				}
			}
		}
		for(int i = 0; i < arr.length; i++){
			for(int j = 0; j < arr[i].length; j++){
				System.out.print(arr[i][j]+ "\t");
			}
				System.out.println();//换行
		}
			
	}
}