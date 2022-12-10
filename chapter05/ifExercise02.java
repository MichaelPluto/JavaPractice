public class ifExercise02{
	public static void main(String[] args) {
	// 判断两个数的和是否能同时被三和五整除	
		int num1 = 10;
		int num2 = 15;
		int sum = num1 + num2;
	if(sum % 3 == 0 && sum % 5 == 0){
		System.out.println("和可以被整除 = " + sum);

	}else{
		System.out.println("和不可以被整除");
	}

	}
}