public class OverloadExercise02{
	public static void main(String[] args){
		Methods tool = new Methods();
		System.out.println("平方=" + tool.max(1,2));
		System.out.println(tool.max(5.6, 8.8));
		System.out.println(tool.max(9.2, 10.5, 4.4));
	}
}
class Methods{
	public int max(int n1, int n2){
		if(n1 > n2){
			return n1;
		}else{
			return n2;
		}
	}
	public double max(double n1, double n2){
		if(n1 > n2){
			return n1;
		}else{
			return n2;
		}
	}
	public double max(double n1, double n2, double n3){
		if(n1 > n2 && n1 > n3){
			return n1;
		}else if(n2 > n1 && n2 > n3){
			return n2;
		}else{
			return n3;
		}
		
	}
}