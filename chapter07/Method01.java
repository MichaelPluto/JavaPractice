public class Method01{
	public static void main(String[] args){
	Person p1 = new Person();
		p1.speak();//调用方法
		p1.cal01();
		p1.cal02(100);
		int returnSum = p1.getSum(10 , 20);
		System.out.println("getSum方法返回值为" + returnSum);
	}
}
class Person{
	String name;
	int age;
	public void speak(){//添加speak成员方法
		System.out.println("我是一个好人");

	}
	public void cal01(){
	int sum = 0;
	for(int i = 0; i <=1000; i++){
		sum += i;
	}
	System.out.println(sum);
	}

	public void cal02(int n){
		int sum = 0;
		for(int i = 0; i <= n; i++){
			sum += i;
		}
	
		System.out.println(sum);

	}

	public int getSum(int num1, int num2 ){
		//int 表示方法执行后返回一个int值
		// getSum 方法名
		//(int num1, int num2 ) 2个形参，可以接收用户传入的数
		// return totalSum; 表示把 totalSum的值返回
		int totalSum = num1 + num2;
		return totalSum;
	}
}