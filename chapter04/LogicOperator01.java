//��ʾ�߼��������ʹ��
public class LogicOperator01{
	public static void main(String[] args) {
		//&&��·�� �� &�߼��� ������ʾ
		int age = 10;
		if(age <20 && age >5);{//&&
			System.out.println("ok100");

		}
		if(age <25 & age > 8){//&
			System.out.println("ok200");
		}
		//����
		int a = 4;
		int b = 9;
		//����&&��·����ԣ������һ������Ϊ false ,��������������ж�
		//����&�߼�����ԣ������һ������Ϊ false ,�����������Ȼ���ж�
		/*if(a < 1 & ++b < 50){
			System.out.println("ok300");

		}
		System.out.println("a=" + a + "b=" + b);*///4 10
		if(a < 1 && ++b <50){
			System.out.println("ok400");
		}
			System.out.println("a=" + a +"b=" + b);//4 9
	}
}