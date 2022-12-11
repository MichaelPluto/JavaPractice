
public class MulForExercise02{
	public static void main(String[] args) {
	//打印九九乘法表
	// 思路如下；

	// (1) 外层for循环控制行数
	// (2) 内层for循环控制列数
	  
	  for(int i = 1; i <= 9; i++){
	  	for(int j = 1; j <= i; j++){
	  		//列数<=行数！
		System.out.print(i + "*" + j + " = " + j*i +" ");
	}
		System.out.println();
		}
	
	  
	}
}