public class VarScope{
	public static void main(String[] args){
		Cat t = new Cat();
		t.cry();
	}
}
class Cat {
	int num = 1;//����
	double Score;//Ĭ��ֵΪ 0.0
	public void cry(){
		//String name; �ֲ�����û��Ĭ��ֵ�����븳ֵ����ʹ��
		System.out.println(num);//�ֲ���������ʹ������

	} 
}