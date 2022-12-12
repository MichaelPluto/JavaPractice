public class HomeWork09{
	public static void main(String[] args) {
		int sum = 0;
		for(int i = 1; i <= 100; i++){
		//i 可以表示第几项，同时也是当前项的最后一个数
			for(int j = 1; j <= i; j++){
				sum += j;
			}
		}
			System.out.println("sum=" + sum);



		// int sum = 0;
		// int total = 0;
		// for(int i = 1; i <= 100; i++){
		// 	sum += i;
		// 	total += sum;
		// }
		// 	System.out.println(total);

		// int i = 1;
		// int sum = 0;
		// int total = 0;
		// while(i <= 100){
		// 	sum += i;
		// 	total += sum;
		// 	i++;
			
		// }
		// 	System.out.println(total);
	}
}