public class Object01{
	public static void main(String[] args){
	//ʹ���������ķ�ʽ�����è����
		//ʵ����cat1����
		Cat cat1 = new Cat();
		cat1.name = "С��";
		cat1.age = 10;
		cat1.color = "��ɫ";
		//ʵ����cat2����
		Cat cat2 = new Cat();
		cat2.name = "С��";
		cat2.age = 100;
		cat2.color = "��ɫ";

		System.out.println("��һֻè" + " " +"����=" + cat1.name+ " " + "����=" +cat1.age +  " " + "��ɫ=" + cat1.color);
		System.out.println("�ڶ�ֻè" + " " +"����=" + cat2.name+ " " + "����=" +cat2.age +  " " +"��ɫ=" + cat2.color);

	
	}
}
class Cat{//����Cat��
		String name;
		int age;
		String color;
	}	