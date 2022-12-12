public class HomeWork07{
	public static void main(String[] args) {
		//输出a-z 和 Z-A
		char c1 ='a';//z = 122
		while(c1 <= 'z'){//字符可以直接比较大小
			System.out.print(c1 + " ");//不用强转char
			c1++;//
		} 
		System.out.print("   ");
		char c2 ='Z';//Z = 90
		while(c2 >= 'A' ){
			System.out.print(c2 + " ");
			c2--;
		}
	}
}