public class MethodDetail{
	public static void main(String[] args){
		Detail MerthodDetail = new Detail();
		int[] res = MerthodDetail.getSumAndSub(1,4);
		System.out.println("��=" + res[0]);
		System.out.println("��=" + res[1]);

	}
}
class Detail {
	// һ�����������һ������ֵ�������ض��������Է������飩
	public int[] getSumAndSub(int n1, int n2){
		int[] resArr = new int[2]; //����һ������
		resArr[0] = n1 + n2;
		resArr[1] = n1 - n2;
		return resArr;
	//	�������Ҫ���з����������ͣ������ִ��return
	//  �������ͱ����return��ֵ����һ�»����

	}	
	public double num(){

	double d1 = 1.1 * 3;
	return d1;
	// int n = 100;
	// return n;//���� int -> double
	// double -> int ������
}
	public void none(){
		System.out.println("Hello");
		System.out.println("Hello");
		System.out.println("Hello");
		int n = 10;
		//return ; //������return���������з���ֵ
	}
	}
