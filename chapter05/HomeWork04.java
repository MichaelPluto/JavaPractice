import java.util.Scanner;
public class HomeWork04{
	public static void main(String[] args) {
		//�ж�һ�������Ƿ�Ϊˮ�ɻ���
		//ˮ�ɻ���������������ֵ�����֮�͵����䱾��
		//num�İ�λ = num /100
		//num��ʮλ = num /10 % 10
		//num�İ�λ = num % 10

	Scanner myScanner = new Scanner(System.in);
	System.out.println("����һ����λ����");
	int num = myScanner.nextInt();
	int num1 = (num / 100)*(num / 100)*(num / 100);//��λ����������
	int num2 = (num / 10 % 10)*(num / 10 % 10)*(num / 10 % 10);//ʮλ����������
	int num3 = (num % 10)*(num % 10)*(num % 10);//��λ����������
	if(num1 + num2 + num3 == num){
		System.out.println(num +"Ϊˮ�ɻ���");
	}else{
		System.out.println(num +"����ˮ�ɻ���");
	}
	}
}