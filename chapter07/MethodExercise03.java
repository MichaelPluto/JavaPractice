public class MethodExercise03{
	public static void main(String[] args){
		Person p = new Person();
		p.name = "jack";
		p.age = 10;
		System.out.println(p.name + " " + p.age);

		MyTools tool = new MyTools();
		Person p1 = tool.copyPerson(p);//��Person p1 ���շ���ֵ
		System.out.println(p1.name + " " + p1.age);
		System.out.println(p == p1);// p ������ p1 ֻ�ǵ�ַ���ֵ��ͬ��
									//�ǲ�ͬ�ĵ�ַ
	}	
}
class Person {
	String name;
	int age;
}
class MyTools {//��¡
	//��дһ������ copyPerson�����Ը���һ�� Person ����
	//���ظ��ƵĶ��󡣿�¡���� ע��Ҫ��õ��¶����ԭ����
    //���������������Ķ���ֻ�����ǵ�������ͬ
    //˼·��
    //1.����ֵΪ Person
    //2.������Ϊ copyPerson
    //3.�β�Ϊ��Person p��
    //4.������Ϊ ����ֵ�����
   public Person copyPerson (Person p){
   	  Person p1 = new Person();
   	  p1.name = p.name;
   	  p1.age = p.age;
   	  return p1;
   }

}