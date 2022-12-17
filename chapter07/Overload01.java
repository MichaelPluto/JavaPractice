public class Overload01{
	public static void main(String[] args){
		MyCalculator mc = new MyCalculator();
		System.out.println(mc.calculate(2,3,5));
	}
}
class MyCalculator{
	//方法重载
	public int calculate(int n1, int n2){
		System.out.println("calculate(int n1, int n2)被调用");
		return n1 + n2;
	}
	public double calculate(int n1, double n2){
		System.out.println("calculate(int n1, double n2)被调用");
		return n1 + n2;
	}
	public double calculate(double n1, int n2){
		System.out.println("calculate(double n1, int n2)被调用");
		return n1 + n2;
	}
	public int calculate(int n1, int n2, int n3){
		System.out.println("int n1, int n2, int n3 n2)被调用");		
		return n1 + n2 + n3;
	}
}