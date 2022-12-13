public class ArrayExercise02{
	public static void main(String[] args) {
		//求出数组 {4, -1, 9, 10, 23}最大值 并得对应下标

		 int num[] = {4, -1, 9, 10, 23, 888};
		 int max = num[0];//假设第一个元素为最大值(哨兵)
		 int maxindex = 0;// 为最大值数组下标
		for(int i = 1; i < num.length; i++){
	         //i = 1 是因为要从第2个元素进行对比
			if(max < num[i] ){
				max = num[i];
				maxindex = i;
			}
		}
			System.out.println("最大值为" + max + "数组下标为" + maxindex);
	}
}