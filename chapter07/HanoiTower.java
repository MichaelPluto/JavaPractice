public class HanoiTower{
	public static void main(String[] args){
		Tower t1 = new Tower();
		t1.move(5, 'A', 'B', 'c');


	}
}
class Tower {
	//˼·
	// 1.����ֵ void
	// 2.������ move
	// 3.�βΣ�int num, char a, char b, char c��
	// 4.������ �ݹ����
	public void move(int num, char a, char b, char c){
		//num��ʾ�м�����
		//a b c��ʾA B C��
		//��ֻ��һ���̵����
		if(num == 1){
			System.out.println(a + "->" + c);//��ʾ��A��->C��
		}else{
			//���ж���̵����
			//�����е��̿��������̣���������� + �������е��̣�
			//1.����һ���̷ŵ�b ����c
			//2.�����һ���̷ŵ�c 
			//3.����һ���̷ŵ�c ����a
			move(num - 1, a, c, b);//numΪ��������num-1Ϊ����������
								  // a -> b ����c = a, c, b
			System.out.println(a + "->" + c);

			move(num - 1, b, a, c);

		}
	}
}
