public class HomeWork01{
	public static void main(String[] args) {
		// ĳ����100000Ԫ��ÿ����һ��·����Ҫ�ɷѹ�������
		// 1�����ֽ�> 50000��ÿ�ν�5%
		// 2�����ֽ�<= 50000��ÿ�ν�1000
		// ������˿��Ծ������ٴ�·�ڣ�ʹ��while break
		/*˼·����
		1.���� double money ����100000
		2.�������
			money > 50000
			money >= 1000 && money <= 50000
			money < 1000
		*/
		double money = 100000;//��ʣ����Ǯ
		int count = 0;
		while(true){//����ѭ��
			if(money > 50000){//��·��
				money *= 0.95;//���껹ʣ����Ǯ
				count++;
			}else if (money >= 1000) {
				money -= 1000;
				count++;
				
			}else{//money < 1000
				break;

			}
		}
			System.out.println("100000���Թ�" + count + "·��");
		// double money = 100000;
		// int count = 0;//�ۼƹ���·��
		// while(money >50000){
		// 	money *= 0.95// == money - 0.05*money; 
		// 	count++;
		// 	if(money <= 50000){
		// 		break;
		// 	}	
		// }	
		// while(money <= 50000){
		// 	money -= 1000;
		// 	count++;
		// 	if(money < 1000){
		// 		break;
		// 	}
		// }
		// System.out.println("���Ծ���" + count+"��·��");
	}
}