public class BreakExercise01{
	public static void main(String[] args) {
		int count = 0;
		for(int i = 1; i <= 100; i++){
			count += i;
			if(count > 20){
				break;
			}
			System.out.println("求得数为" + count);
		}
	}
}