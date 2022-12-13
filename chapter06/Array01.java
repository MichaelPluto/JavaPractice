public class Array01{
	public static void main(String[] args) {
		//一个养鸡场有 6 只鸡，它们的体重分别是 
		// 3kg,5kg,1kg,3.4kg,2kg,50kg 。
		// 请问这六只鸡的总体重是多少?
		// 平均体重是多少? 请你编一个程序


		//定义一个数组
		double[] hens = {3, 5, 1, 3.4, 2, 50};
		System.out.println("使用数组解决");
		//可以用 数组名.length 得到数组的大小长度
		System.out.println("数组的长度=" + hens.length);
		double totalWeight = 0;
		 //遍历数组得到数组的所有元素的和，使用for循环
		for(int i = 0; i < hens.length; i++){
			System.out.println("第"+ (i + 1) + "个元素的值=" + hens[i]);
			totalWeight += hens[i];

		}
			System.out.println("总体重为" + totalWeight + "  " + "平均体重为" + totalWeight / hens.length);
	}
}