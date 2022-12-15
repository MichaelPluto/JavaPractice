public class MethodExercise01{
	public static void main(String[] args){
//编写类 AA ，有一个方法：
//判断一个数是奇数 odd 还是偶数, 返回 boolean
		judge A = new judge();
		 //boolean B = A.judgeNum(6);
		if(A.judgeNum(266)){//修改后
			System.out.println("是偶数\n");
		}else{
			System.out.println("是奇数\n");
		}
		System.out.println("打印出的图像为\n");
		A.print(5, 5, '#');
	}
}
class judge{
	// 思路：
	// 1.方法返回值：boolean
	// 2.方法的名字：judgNum
	// 3.方法的形参：int n
	// 4.方法的结构提：判断语句
	public boolean judgeNum (int n){
		if(n % 2 == 0){
		return true;
	}else{
		return false;
	}
	}
//根据行、列、字符打印 对应行数和列数的字符，
//比如：行：4，列：4，字符#,则打印相应的效果
//打印效果如下：
   // ####      	
   // ####
   // ####
   // #### 	
   //思路
	//1.方法返回值void
	//2.方法名字 print
	//3.形参为（int row, int column , char c）
	//4.结构体为循环输出

   public void print(int row, int col, char c){
   	for(int i = 1; i <=row; i++){
   		for(int j = 1; j <=col; j++){
   			System.out.print(c);

   		}
   			System.out.println();//换行
   	}
   			
   }

}