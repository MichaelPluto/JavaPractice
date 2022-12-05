public class CharDetail{
	public static void main(String[] args){
		//在java中，char的本质是一个整数，在输出十，是unicode码对应的字符
			char c1 = 97;
			System.out.println(c1);//输出 a

			char c2 = 'a';
			System.out.println((int)c2);//输出'a'对应的数字 97
			char c3 = '杨';
			//char类型是可以进行运算的，相当于一个整数，因为它都有对应Unicode码
			System.out.println((int)c3);//输出 26472
			System.out.println('a' + 10);//输出 107
			//课堂小测试
			char c5 = 'b' + 1;// b=98 b+1=99
			System.out.println((int)c5);//输出99 强制类型转换
			System.out.println(c5); //c5=b+1=99 99对应的Ascll码为c 输出c
	}



			

}