public class MethodParameter01{
	public static void main(String[] args){
	int a = 10;
	int b = 20;
	AA Obj = new AA();
		Obj.swap(a,b);
		System.out.println("main�����е�a��bΪ" + a +" " + b);
	}
}
class AA{
	public void swap(int a, int b){
		System.out.println("����ǰ��a��b" + a + " " + b );
		int temp = a;
		a = b;
		b = temp;
		System.out.println("�������a��b" + a + " " + b);
	}
}