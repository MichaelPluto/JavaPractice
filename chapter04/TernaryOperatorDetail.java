public class TernaryOperatorDetail{
	public static void main(String[] args) {
		int a = 10;
		int b = 20;
		int c = (a < b )? a++: --b;
		double d = (a < b )? a++: --b;//��ȷ �����Զ�����ת�� int->double
		//int d = (a < b )? 1.1: 3.2;//���� double����תΪint
	

	}
}