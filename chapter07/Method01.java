public class Method01{
	public static void main(String[] args){
	Person p1 = new Person();
		p1.speak();//���÷���
		p1.cal01();
		p1.cal02(100);
		int returnSum = p1.getSum(10 , 20);
		System.out.println("getSum��������ֵΪ" + returnSum);
	}
}
class Person{
	String name;
	int age;
	public void speak(){//���speak��Ա����
		System.out.println("����һ������");

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
		//int ��ʾ����ִ�к󷵻�һ��intֵ
		// getSum ������
		//(int num1, int num2 ) 2���βΣ����Խ����û��������
		// return totalSum; ��ʾ�� totalSum��ֵ����
		int totalSum = num1 + num2;
		return totalSum;
	}
}