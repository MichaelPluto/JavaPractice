public class OverloadExercise01{
	public static void main(String[] args){
		Methods tool = new Methods();
		System.out.println(tool.m(2));
		System.out.println(tool.m(2,4));
		System.out.println(tool.m('A'));
	}
}
class Methods {
	public int m(int n){
		return n*n;
	}
	public int m(int n1 , int n2){
		return n1*n2;
	}
	public char m(char a){
		return a;
	}
}