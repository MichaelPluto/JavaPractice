public class RecursionExercise01{
	public static void main(String[] args){
		MyTools T = new MyTools();
		int num = T.fibonacci(10);
		System.out.println(num);
	}
}
class MyTools{
	//输出斐波那契数
	//思路：
	// 1.返回值：int
	// 2.方法名: num
	// 3.形参： （int n）
	// 4.方法体：递归调用
	public int fibonacci(int n){
		if(n >= 1){
		if(n == 1 || n == 2){
			return 1;
		}else{
			return fibonacci(n-1) + fibonacci(n-2);
		}
		}else{
			System.out.println("输入有误");
			return -1;
	}
	}
}