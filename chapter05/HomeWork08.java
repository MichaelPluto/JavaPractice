public class HomeWork08{
	public static void main(String[] args) {
		//���1-1/2+1/3-1/4....1/100�ĺ�
		//��ĸΪ����ʱ��ǰ��ʱ + ��ĸΪż��ʱ��ǰ��ʱ -
		//������������ʽ�з��� 1��д��1.0���ܵõ���ȷ��С��
		int i = 1;
		double sum = 0;
		int end = 100;
		while(i <= end){
			//�ж���������ż��������ͬ����
		if(i % 2 != 0){
			sum = sum + 1.0 / i;
		}else{
			sum = sum - 1.0 / i;
		}
			i++;
		}
			System.out.println(sum);
	}
}