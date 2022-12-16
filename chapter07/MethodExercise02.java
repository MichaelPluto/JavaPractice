public class MethodExercise02{
	public static void main(String[] args){
		int [][]arr = {{1,2,3},{4,5,6},{7,8,9}};
		MyTools tool = new MyTools();
		tool.printArr(arr);
	}
}
class MyTools {
	public void printArr (int [][]arr){
		for(int i = 0; i < arr.length; i++){
			for(int j = 0; j < arr[i].length; j++){
				System.out.print(arr[i][j] + " ");
			}
				System.out.println();
		}
	}
}