public class ForDetail{
	public static void main(String[] args){
		//使用for循环打印1000句话
		// for(;循环判断条件;) 中的初始化和变量迭代可以写到其它地方，
		// 但是两边的分号不能省略。
		int i = 1;
		for(; i <= 10; ){
			System.out.println("杨质飞是大帅哥"+ i);
			i++;
		}
		// 补充
		// for(;;){//表示一个死循环
		// 	System.out.println("ok");
		// }
		int count = 3;
		for(int k = 0, j = 0; k < count; k++, j +=2){
			System.out.println("k=" + k + "j=" + j);
		}
	}
}