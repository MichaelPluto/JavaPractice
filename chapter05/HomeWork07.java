public class HomeWork07{
	public static void main(String[] args) {
		//���a-z �� Z-A
		char c1 ='a';//z = 122
		while(c1 <= 'z'){//�ַ�����ֱ�ӱȽϴ�С
			System.out.print(c1 + " ");//����ǿתchar
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