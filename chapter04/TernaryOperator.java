public class TernaryOperator{
	public static void main(String[] args) {
		int a = 10;
		int b = 99;
		//�0�5�0�9�0�9�0�9
		//1.a > b �0�2�0�9false
		//2.���0�8�0�3�0�1b-- �0�3�0�6���0�8�0�3�0�1b�0�8�0�2�0�0�0�8,�0�6�0�3�0�2�� b-1;
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