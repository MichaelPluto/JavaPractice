public class HomeWork06{
	public static void main(String[] args) {
		//输出1-100之间不能被5整除的数，
		//每五个一行:使用一个count 统计输出个数
		// 当count%5=0时就说明输出五个了，这时
		//  我们输出一个换行即可
		int count = 0;
		for(int i = 1; i <= 100; i++){
			if(i % 5 != 0){
				count++;
			System.out.print(i + "\t");
			if(count % 5 ==0){
				System.out.println();//换行
			}
		  }
		}
	}
}