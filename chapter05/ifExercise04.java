import java.util.Scanner;
public class ifExercise04{
	public static void main(String[] args) {
	//�ж�һ��������ż��
	  Scanner myScanner  =  new Scanner(System.in);
	  System.out.println("����һ������");
	  int num = myScanner.nextInt();
	  if(num % 2 ==0){
	  	System.out.println("Ϊż��");
	  }else{
	  	System.out.println("Ϊ����");
	  }

	}
}