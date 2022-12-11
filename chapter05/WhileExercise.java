public class WhileExercise{
	public static void main(String[] args) {
		//打印40-200之间所有的偶数
		int i = 40;
		int j = 2;
		int end = 200;
		while(i <= end ){
			if(i % j ==0){
			System.out.println("输出偶数=" + i);
		  }
			i++;
		}
	}
}