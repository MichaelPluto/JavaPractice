import java.util.Scanner;
public class ForExercise{
	public static void main(String[] args) {
	//��ӡ1-100֮��������9�ı�����������
	//ͳ�Ƹ������ۺ�
	Scanner myScanner = new Scanner(System.in);
		System.out.println("����һ������");
		int i = myScanner.nextInt();
		if(i >= 1 && i <= 100){
		int count = 0;
		int sum = 0;
		int start = 1;
		int end =100;
		int k = 9;
		for(; i <= end && i >= start; i++){
		  if(i % k ==0){
		  	System.out.println("i =" + i);
		  	count++;
		  	sum += i;
		  }

		}
		System.out.println("count =" + count + "sum =" + sum);
	  }
	  	System.out.println("��������");
	  	
	}
}