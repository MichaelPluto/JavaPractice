public class DoWhileExercise01{
	public static void main(String[] args) {
	//ͳ��1-200֮���ܱ������������ܱ�3�����ĸ���
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