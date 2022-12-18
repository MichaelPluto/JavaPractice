public class Homework08{
	int count = 9;

	public void count1(){//成员方法
		count = 10;//这个count就是属性
		System.out.println("count1=" + count);//10

	}
	public void count2(){//成员方法
		System.out.println("count1=" + count++);//10

	}
	//这是Homework08的main，任何一个类，都可以有main
	public static void main(String[] args){
		//1.new Homework08() 是匿名对象，只能用一次，使用后就销毁
		//2.创建匿名对象后，就调用count1() 
		new Homework08().count1();
		Homework08 t1 = new Homework08();
		t1.count2();
		t1.count2();


	}
}