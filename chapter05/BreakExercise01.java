public class BreakExercise01{
	public static void main(String[] args) {
		//注意i为局部变量 作用域再for{}中
		int n =0;
		int sum = 0;
		for(int i = 1; i <= 100; i++){
			sum += i;
			if(sum > 20){
				System.out.println("和>20时 当前数i=" + i);
				n = i;
				break;
			}

		}
			System.out.println("当前数=" + n);
	}
}