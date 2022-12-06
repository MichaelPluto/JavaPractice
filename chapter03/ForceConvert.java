public class ForceConvert{
	public static void main(String[] args) {
		//强制类型转换
		int n1 = (int)2.8;
		System.out.println(n1);//精度损失
		int n2 = 2000;
		byte b1 = (byte)n2;
		System.out.println(b1);//数据溢出

	}
}