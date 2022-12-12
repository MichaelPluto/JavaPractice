public class Diamond{
	public static void main(String[] args) {
		//打印一个空心的菱形
		//(1)先打印一个矩形
		//(2)打印出半个金字塔
		//* 	1个*
		//**    2个*
		//***	3个*
		//****  4个*
		//*****	5个*
		//(3)打印出完整金字塔
		//*   		
		//***
		//*****
		//*******
		//*********
		//(4)规范的金字塔
		//    *   		
		//   ***
		//  *****
		// *******
		//*********
		//(5)空心金字塔
		//    *   		
		//   * *
		//  *   *
		// *     *
		//*       *
		//(6)打印一个倒装的金字塔
		//*********
		// *******
		//  *****
		//   ***
		//    *
		//(7)空心的倒装金字塔
		//*       *
		// *     *
		//  *   *
		//   * *
		//    *
		//(8)分别输出两个空心的金字塔得到空心菱形
		//    *   		
		//   * *
		//  *   *
		// *     *
		//*       *
		//*       *
		// *     *
		//  *   *
		//   * *
		//    *
		//(9) 先死后活，定义变量      
		int level = 5;
		for(int i = 1; i <=level; i++){//控制层数
			//输出*前先输出空格
			for(int k = 1; k <= level-i; k++){
				System.out.print(" ");
			}
			for(int j = 1; j <= 2*i-1; j++){
				if(j == 1 || j == 2*i-1){
				System.out.print("*");
			}else{
				System.out.print(" ");
			}
			}
			//每打完一层*就换行
			System.out.println(" ");

		}
		for(int n = level; n >= 1 ; n--){
			for(int b = 1; b <= level-n; b++){
				System.out.print(" ");
			}
			for(int m = 1; m <= 2*n-1 ; m++){
				if(m == 1 || m == 2*n-1){
			System.out.print("*");
		}else{
		  	System.out.print(" ");
		  }
		  }
		  	System.out.println(" ");
		}	 
	}
}