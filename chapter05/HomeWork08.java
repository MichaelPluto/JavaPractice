public class HomeWork08{
	public static void main(String[] args) {
		//求出1-1/2+1/3-1/4....1/100的和
		//分母为奇数时，前面时 + 分母为偶数时，前面时 -
		//隐藏条件，公式中分子 1得写成1.0才能得到精确的小数
		int i = 1;
		double sum = 0;
		int end = 100;
		while(i <= end){
			//判断奇数还是偶数，做不同处理
		if(i % 2 != 0){
			sum = sum + 1.0 / i;
		}else{
			sum = sum - 1.0 / i;
		}
			i++;
		}
			System.out.println(sum);
	}
}