public class ForceConvertDetai01{
	public static void main(String[] args) {
		
		//强转符号只针对于最近的操作数有效，往往会使用小括号提升优先级
		//int x = (int)10*3.5+6*1.5;//编译错误：double->int
			int x = (int)(10*3.5+6*1.5);//正确 （int）44.0->44
			System.out.println(x);


			char c1 = 100;//ok
			int m = 100;//ok\
			//char c2 = m;//错误 int->char
			char c3 = (char)m;//ok
			System.out.println(c3);//正确；输出100对应字符：d

	}
} 