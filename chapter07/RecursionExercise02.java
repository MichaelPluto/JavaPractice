public class RecursionExercise02{
	public static void main(String[] args){
		MyTools t1 = new MyTools();
		int num = t1.peach(1);
		if(num != -1){
		System.out.println("一共有" +t1.peach(1) + "个桃");
	}
	}
}
class MyTools {
	//猴子吃桃子问题
	// 	猴子吃桃子问题：有一堆桃子，
	// 	猴子第一天吃了其中的一半，
	// 	并再多吃了一个！
	// 以后每天猴子都吃其中的一半，
	// 然后再多吃一个。当到第 10 天时，
	// 想再吃时（即还没吃），发现只有 1 个桃子了。
	// 问题：最初共多少个桃子？
	//思路：从后往前走 第十天剩1个桃子，第九天桃子数应为 (1+1)*2 = 4个；
	//		第八天桃子数应为（4+1)*2 = 10个 以此类推；
	//      前一天的桃子 = （后一天的桃子 + 1）* 2
	// 1.返回值：int
	// 2.方法名：peach
	// 3.形参为：int day;记录天数
	// 4.方法体：递归调用
	// i = 10 有 1 个桃子
	// i = 9 有 (day10+1)*2 = 4个
	// i = 8 有 (day9+1)*2 = 10个
	public int peach(int day){
		if(day == 10){
			return 1;
		}else if(day >= 1 && day <=9){//递归要反着看 
			return (peach(day + 1) + 1) * 2;
		}else{
			System.out.println("输入有误");
			return -1;
		}
	}
}