public class Homework06{
	public static void main(String[] args){
		Cale p1 = new Cale(8,6);
		System.out.println("和=" + p1.sum());
		System.out.println("差=" + p1.reduce());
		System.out.println("乘积=" + p1.ride());
		Integer except = p1.except();
		if(except != null){
			System.out.println("商=" + p1.except());
		}
	}
}
class Cale {
	int n1;
	int n2;
	public Cale(int n1, int n2){
		this.n1 = n1;
		this.n2 = n2;

	}
	public int sum(){

		return n1 + n2;
	}

	public int reduce(){

		return n1 - n2;
	}

	public int ride(){

		return n1 * n2;
	}

	public Integer except(){
		if(n2 == 0){
			System.out.println("商不能为0");
			return null;
		}else{
			return n1 / n2;
		}
	}
}