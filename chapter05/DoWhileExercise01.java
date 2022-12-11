public class DoWhileExercise01{
	public static void main(String[] args) {
	//统计1-200之间能被五整除但不能被3整除的个数
		int i = 1;
		int count = 0;
		int j = 5;
		int k = 3;
		int end = 200;
		do{ 
			if(i % j == 0 && i % k != 0){
			System.out.println("i=" +i);
			count++;
		 }
			i++;
		}while(i <= end);
		System.out.println("count=" + count);
	 	
	}
}