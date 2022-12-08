//演示关系运算符的使用
public class InverseOperator {
//编写一个 main 方法
public static void main(String[] args) {
	System.out.println( 60 > 20);
	System.out.println( !(60 > 20));
	boolean b = (10 > 1)^(5 < 2);
	System.out.println("b=" + b);
	boolean c = (10 < 1 )^(5 < 2);
	System.out.println("c=" + b);
	boolean d = (10 > 1)^(5 > 2);
	System.out.println("d=" +d);
	
	}
}