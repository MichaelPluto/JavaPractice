public class MethodDetail02{
	public static void main(String[] args){
		A a = new A();
		a.sayOk();//ͬ���еķ�������
		a.m1();//��ͬ���еķ�������
	}
}
class A{
	//ͬһ���еķ������ã� ֱ�ӵ��ü���
	//
	public void print(int n){
		System.out.println("print()���������� n=" + n);

	}
	public void sayOk(){
		print(10);//sayOk���� printֱ�ӵ���
		System.out.println("\n����ִ��sayOk");
	}
	public void m1(){
		B b = new B();
		b.hi();//����B���еķ���hi
		System.out.println("\nB���е�hi()ִ�����ķ���");
	}
}

class B{
	//��ͬ���еķ������ã���Ҫͨ������������
	public void hi(){
		System.out.println("B���е�hi()��ִ��");
	}
}