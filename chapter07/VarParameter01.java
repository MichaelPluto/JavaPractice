public class VarParameter01 {
	public static void main(String[] args){
		HspMethod m = new HspMethod();
		System.out.println("和=" + m.sum(2,8,9,6));
	}
}
class HspMethod {
	// 1.int...表示接收的是可变参数，类型是int
	//   可以接收多个int（0-多）
	// 2.使用可变参数时，可以当作数组来使用 numbs可当作数组  
	public int sum(int...nums) {
			int res = 0;
		for(int i = 0; i < nums.length; i++){
			res += nums[i];
		}
			return res;
	}
}