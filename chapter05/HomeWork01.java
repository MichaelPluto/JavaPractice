public class HomeWork01{
	public static void main(String[] args) {
		// 某人有100000元，每经过一次路口需要缴费规则如下
		// 1）当现金> 50000，每次交5%
		// 2）当现金<= 50000，每次交1000
		// 计算该人可以经过多少次路口，使用while break
		/*思路分析
		1.定义 double money 保存100000
		2.三种情况
			money > 50000
			money >= 1000 && money <= 50000
			money < 1000
		*/
		double money = 100000;//还剩多少钱
		int count = 0;
		while(true){//无限循环
			if(money > 50000){//过路口
				money *= 0.95;//过完还剩多少钱
				count++;
			}else if (money >= 1000) {
				money -= 1000;
				count++;
				
			}else{//money < 1000
				break;

			}
		}
			System.out.println("100000可以过" + count + "路口");
		// double money = 100000;
		// int count = 0;//累计过的路口
		// while(money >50000){
		// 	money *= 0.95// == money - 0.05*money; 
		// 	count++;
		// 	if(money <= 50000){
		// 		break;
		// 	}	
		// }	
		// while(money <= 50000){
		// 	money -= 1000;
		// 	count++;
		// 	if(money < 1000){
		// 		break;
		// 	}
		// }
		// System.out.println("可以经过" + count+"次路口");
	}
}