public class MethodParameter02{
	public static void main(String[] args){
		B b = new B();
		int []arr = {1, 2, 3,};
		b.test100(arr);
		System.out.print("�������е�arr��� ");
		for(int i = 0; i < arr.length; i++){
			System.out.print(arr[i] + " ");
		}
			System.out.println();

		Person p = new Person();
		p.name = "jack";
		p.age = 10;

		b.test200(p);
		System.out.println("main�� p.age =" + p.age);
 
	}
}
class Person{
	String name;
	int age;
}
class B {
	//��дһ������test100
	//���Խ���һ�����飬�ڷ������޸�����
	//����ԭ���������Ƿ��б仯
	public void test100(int []arr){
		System.out.print("test100�е�arr��� ");
		arr[0] = 200;
		//��������
		for(int i = 0; i < arr.length; i++){
			System.out.print(arr[i] + " ");
		}
			System.out.println();
	}


	public void test200(Person p){
		//��дһ������test200
		//���Խ���һ�������ڷ������޸Ķ����е�ֵ
		//����ԭ���Ķ����е�ֵ�Ƿ�仯
		p.age = 1000;//�޸Ķ�������
	}
}