public class Constructor01{
	public static void main(String[] args){
 	Person p1 = new Person("jack", 80);
 	System.out.println("p1����Ϣ����");
 	System.out.println("name=" + " " + p1.name);//jack
 	System.out.println("age=" + " " + p1.age);//80
	}
}
class Person {
	String name;
	int age;
	//������
	//1.������û�з���ֵ��Ҳ����дvoid
	//2.���������ֱ������һ��
	//3.�β��б�ͳ�Ա������һ��
	public Person(String pName, int pAge) {
		System.out.println("�����������ã���ɶ�������Գ�ʼ��");
		name = pName;
		age = pAge;
	}
}