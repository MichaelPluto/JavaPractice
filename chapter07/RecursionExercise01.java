public class RecursionExercise01{
	public static void main(String[] args){
		MyTools T = new MyTools();
		int num = T.fibonacci(10);
		System.out.println(num);
	}
}
class MyTools{
	//���쳲�������
	//˼·��
	// 1.����ֵ��int
	// 2.������: num
	// 3.�βΣ� ��int n��
	// 4.�����壺�ݹ����
	public int fibonacci(int n){
		if(n >= 1){
		if(n == 1 || n == 2){
			return 1;
		}else{
			return fibonacci(n-1) + fibonacci(n-2);
		}
		}else{
			System.out.println("��������");
			return -1;
	}
	}
}