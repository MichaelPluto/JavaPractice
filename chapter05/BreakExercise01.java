public class BreakExercise01{
	public static void main(String[] args) {
		//ע��iΪ�ֲ����� ��������for{}��
		int n =0;
		int sum = 0;
		for(int i = 1; i <= 100; i++){
			sum += i;
			if(sum > 20){
				System.out.println("��>20ʱ ��ǰ��i=" + i);
				n = i;
				break;
			}

		}
			System.out.println("��ǰ��=" + n);
	}
}