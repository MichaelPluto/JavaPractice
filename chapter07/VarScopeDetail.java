public class VarScopeDetail{
	public static void main(String[] args){

	}
}
class Person {

	//public String name = "jack";
	//���Կ��Լ����η�
	String name = "jack";

	public void say(){
			//���Ժ;ֲ���������������������ѭ�ͽ�ԭ��
			String name = "king";
	//public		String name = "king";
			//�ֲ��������ܼ����η�
			System.out.println("say() name = " + name);
	}
	public void hi(){
		String address = "����";
		//String address = "�Ϻ�"; ͬһ������ľֲ��������ֲ���һ��

	}
}