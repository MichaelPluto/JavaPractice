import java.util.Scanner;
public class SeqSearch{
	public static void main(String[] args){
		/*
		有一个数列：白眉鹰王、金毛狮王、紫衫龙王、青翼蝠王猜数游戏
		：从键盘中任意输入一个名称，判断数列中是否包含此名称【顺序查找】 
		 要求: 如果找到了，就提示找到，并给出下标值。
		*/
		String [] arr ={"白眉鹰王","金毛狮王","紫衫龙王","青翼蝠王"};
		Scanner myScanner = new Scanner(System.in);
		System.out.println("输入一个名称");
			String name = myScanner.next();
		int index = -1;//索引
		for(int i = 0; i < arr.length; i++){
			if(name.equals(arr[i])){
				index = i;
				System.out.println("找到" + name +" " + "下标值为" + i);
				break;
			}

		}
			if(index == -1){//遍历完后没有找到对应的值
				System.out.println("没有找到" + name);
			}
	}
}