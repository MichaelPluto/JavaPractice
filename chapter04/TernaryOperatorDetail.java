public class TernaryOperatorDetail{
	public static void main(String[] args) {
		int a = 10;
		int b = 20;
		int c = (a < b )? a++: --b;
		double d = (a < b )? a++: --b;//正确 满足自动类型转换 int->double
		//int d = (a < b )? 1.1: 3.2;//错误 double不能转为int
	

	}
}