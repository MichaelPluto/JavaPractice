public class ConstructorDetail{
	public static void main(String[] args){
	Person t1 = new Person("jack", 99);//��һ��������
	Person t2 = new Person("Tom");//�ڶ���������
	System.out.println("��һ�����������" + t1.name + " " + t1.age);
	System.out.println("�ڶ������������" + t1.name);

	}
}
class Person {
	String name;
	int age;
	public Person(String pName, int pAge){
		name = pName;
		age = pAge;
	}
	public Person(String pName){//����������
		name = pName;
	}
}