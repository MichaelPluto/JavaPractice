public class Return01{
	public static void main(String[] args) {
		
		for(int i = 1; i <= 5; i++){
			if( i == 3){
				System.out.println("���ʷ�˧��" + i);
				return;//��return���ڷ���ʱ����ʾ��������
					 //���ʹ����main�У���ʾ�˳�����
			}
				System.out.println("HelloWorld");			
		}
				System.out.println("go on ...");
	}
}