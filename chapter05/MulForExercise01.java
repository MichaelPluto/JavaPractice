import java.util.Scanner;
public class MulForExercise01{
	public static void main(String[] args){
	Scanner myScanner = new Scanner(System.in);
	 //ͳ��3����ɼ������ÿ������5��ѧ����
	 //����������ƽ���ֺ����а༶��ƽ���֡���������ɼ���
	 //ͳ�������༰��������ÿ������5��ͬѧ��
	 //��1���ȼ���һ���࣬5��ѧ���ĳɼ���for
	//   1.1 Scanner ���գ��û�����
	//	 1.2 ����һ������ܳɼ� sum �����һ�����ƽ��ֵ sum/5
	// ��2�����forѭ��ʵ�������� 15��ѧ���ĳɼ�չʾ�͸������ƽ����
	// ��3��������а༶��ƽ���֣�
	//	 3.1 ����һ������ totalSum = ���а���ܳɼ�
	//	 3.2 totalSum += sum
	//	 3.3 totalSum / 15 ����ȫ�꼶��ƽ����
	// ��4����if����жϼ�������
	//	 4.1 ����һ��count��¼��������
	//	 4.2 ����һ��ѧ���ɼ�>=60ʱ��count++
	int count = 0;
	double totalSum = 0;
	double sum = 0;
	  for(int i = 1; i <= 3; i++){
		for(int j =1; j <= 5; j++) {
			System.out.println("�����"+ i +"�����" + j +"��ͬѧ�ĳɼ�");
			double score = myScanner.nextDouble();
			System.out.println("�ɼ�Ϊ" + score);
			if(score >= 60){
				count++;
			}
			sum += score;
			totalSum += sum; 
		}
	  		System.out.println("ƽ����Ϊ" + sum/5);

	   	}
	  		System.out.println("ȫ�꼶ƽ����Ϊ" + totalSum / 15);
			System.out.println("��������Ϊ" + count);
	}
}