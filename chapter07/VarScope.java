public class VarScope{
	public static void main(String[] args){
		Cat t = new Cat();
		t.cry();
	}
}
class Cat {
	int num = 1;//属性
	double Score;//默认值为 0.0
	public void cry(){
		//String name; 局部变量没有默认值，必须赋值才能使用
		System.out.println(num);//局部变量可以使用属性

	} 
}