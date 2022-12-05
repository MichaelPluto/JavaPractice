public class FloatDetail{
	public static void main(String[] args) {
		//Java的浮点型常量默认为都变了型，声明float型，需后面加‘f’或‘F’
		//float num1 = 1.1; //错误！！精度缺失
		float num2 = 1.1F;//正确
		double num3 = 1.1;//正确
		double num4 = 1.1F;//正确
		//十进制数形式
		double num5 = .123; // = 0.123
		System.out.println(num5);
		System.out.println(5.12e2);// =512.0
		System.out.println(5.12E-2);// =0.0512
		//通常情况下，double比float更精确
		double num6 = 2.15642315;
		float num7 = 2.15642315F;
		System.out.println(num6);
		System.out.println(num7);
		//浮点数使用陷阱：2.7和8.1 / 3 比较
		//看一段代码
		double num11 = 2.7;
		double num12 = 8.1/3;
		System.out.println(num11);//得到2.7
		System.out.println(num12);//得到一个接近2.7的一个小数而不是2.7
		//得到一个重要的使用点：当我们对运算结果是小数进行相等判断时，要小心
		//应该是以两个数的差值的绝对值，在某个精度范围内判断
		if( num11 == num12){
			System.out.println("相等");//不会输出

		}
		if (Math.abs(num11 - num12) < 0.0001) {
			System.out.println("差值很小，到我规定精度，认为相等...");
			
		}
		//可以通过java API来看 
		System.out.println(Math.abs(num11 - num12));
		//细节：如果是直接查询得到的小数或直接赋值的小数泽相等


	}
}