public class ArithmeticOperatorExercise01{
	public static void main(String[] args) {
		int i = 1;
		i = i++;//使用临时变量规则：1.temp=i;2.i=i+1; 3.i=temp;
		System.out.println(i);//1
		int j = 1;
		j = ++j;//使用临时变量规则：1.j=j+1;2.temp=j; 3.j=temp;
		System.out.println(j);
	}	
}