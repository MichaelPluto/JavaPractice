public class HomeWork06{
	public static void main(String[] args) {
		//���1-100֮�䲻�ܱ�5����������
		//ÿ���һ��:ʹ��һ��count ͳ���������
		// ��count%5=0ʱ��˵���������ˣ���ʱ
		//  �������һ�����м���
		int count = 0;
		for(int i = 1; i <= 100; i++){
			if(i % 5 != 0){
				count++;
			System.out.print(i + "\t");
			if(count % 5 ==0){
				System.out.println();//����
			}
		  }
		}
	}
}