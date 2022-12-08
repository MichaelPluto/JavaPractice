public class TernaryOperator{
	public static void main(String[] args) {
		int a = 10;
		int b = 99;
		//½â¶Á
		//1.a > b Îªfalse
		//2.·µ»Øb-- ÏÈ·µ»ØbµÄÖµ,È»ºó b-1;
		int result = a > b? a++:b--;
		System.out.println("result=" +result);//99
		System.out.println("a=" + a);//10
		System.out.println("b=" + b);//98
		int c = 10;
		int d = 99;
		//
		int cause = c < d? c++:d--;
		System.out.println("cause=" +cause);//10
		System.out.println("c=" + c);//11
		System.out.println("d=" + d);//99

	}
}