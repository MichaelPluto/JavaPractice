public class ForDetail{
	public static void main(String[] args){
		//ʹ��forѭ����ӡ1000�仰
		// for(;ѭ���ж�����;) �еĳ�ʼ���ͱ�����������д�������ط���
		// �������ߵķֺŲ���ʡ�ԡ�
		int i = 1;
		for(; i <= 10; ){
			System.out.println("���ʷ��Ǵ�˧��"+ i);
			i++;
		}
		// ����
		// for(;;){//��ʾһ����ѭ��
		// 	System.out.println("ok");
		// }
		int count = 3;
		for(int k = 0, j = 0; k < count; k++, j +=2){
			System.out.println("k=" + k + "j=" + j);
		}
	}
}