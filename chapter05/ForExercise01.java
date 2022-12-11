public class ForExercise01{
	public static void main(String[] args) {
	int i = 0;
	int j = 5;
	int sum = i + j;	
	for(; i <= 5 && j >= 0; i++, j--){
		System.out.println(i + "+" + j + "=" + sum);
	}
	}
}