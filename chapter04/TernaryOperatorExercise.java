  public class TernaryOperatorExercise{
	public static void main(String[] args) {
		//实现三个数的最大值
		int n1 = 55;
		int n2 = 33;
		int n3 = 123;
		//1.先得到 n1 和 n2中的最大数，保存到max1
		//2.然后再求出max1 和 n3中的最大数，保存到 max2
		//3.输出max2
		int max1 = n1 > n2? n1 : n2;
		int max2 = n3 > max1? n3 : max1;
		System.out.println("最大数为" + max2);
		//使用嵌套语句实现,推荐使用上面方法
		//后续有更好的方法，比如排序
		int max =(n1 > n2? n1 : n2) > n3? (n1 > n2? n1 : n2): n3;
		System.out.println("最大值为" + max);
	}
}
  