public class HanoiTower{
	public static void main(String[] args){
		Tower t1 = new Tower();
		t1.move(5, 'A', 'B', 'c');


	}
}
class Tower {
	//思路
	// 1.返回值 void
	// 2.方法名 move
	// 3.形参（int num, char a, char b, char c）
	// 4.方法体 递归调用
	public void move(int num, char a, char b, char c){
		//num表示有几个盘
		//a b c表示A B C塔
		//若只有一个盘的情况
		if(num == 1){
			System.out.println(a + "->" + c);//表示从A塔->C塔
		}else{
			//若有多个盘的情况
			//将所有的盘看作两个盘（最下面的盘 + 上面所有的盘）
			//1.将第一块盘放到b 借助c
			//2.将最后一块盘放到c 
			//3.将第一块盘放到c 借助a
			move(num - 1, a, c, b);//num为总盘数，num-1为上面所有盘
								  // a -> b 借助c = a, c, b
			System.out.println(a + "->" + c);

			move(num - 1, b, a, c);

		}
	}
}
