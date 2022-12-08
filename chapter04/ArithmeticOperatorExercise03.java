public class ArithmeticOperatorExercise03{
	public static void main(String[] args) {
		int i = 59;
		int j = i / 7;
		int k = i % 7;
		System.out.println("合" +j +"个星期零" +k + "天"  );
		double t = 234.5;
		//double c = 5/9*(t-100);// c=0；
		double c = 5.0/9*(t-100);//考虑数学公式和java语言特性
		System.out.println("华氏温度 = " +t +"对应的摄氏温度为" +c );

	}
}