public class AssignOperator{
	public static void main(String[] args) {
		int n1 = 10;
		n1 += 4;
		System.out.println(n1);//n1 = n1 + 4 = 10+4=14
		n1 /= 3;
		System.out.println(n1);//n1 = n1/3=14/3=4����ȡ��
		//���ϸ�ֵ��������������ת��
		byte b = 3;
		b += 2;// �ȼ��� b = (byte)(b + 2);
		b++;//�ȼ��� b =(byte)( b + 1 );
		System.out.println(b);



	}
}