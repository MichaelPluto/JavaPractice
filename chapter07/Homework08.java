public class Homework08{
	int count = 9;

	public void count1(){//��Ա����
		count = 10;//���count��������
		System.out.println("count1=" + count);//10

	}
	public void count2(){//��Ա����
		System.out.println("count1=" + count++);//10

	}
	//����Homework08��main���κ�һ���࣬��������main
	public static void main(String[] args){
		//1.new Homework08() ����������ֻ����һ�Σ�ʹ�ú������
		//2.������������󣬾͵���count1() 
		new Homework08().count1();
		Homework08 t1 = new Homework08();
		t1.count2();
		t1.count2();


	}
}