import java.util.Scanner;
public class ifExercise03{
	public static void main(String[] args) {
	//�ж�һ������Ƿ�Ϊ����
	  Scanner myScanner	  = new Scanner(System.in);
	  System.out.println("�������");
	  int year = myScanner.nextInt();
	  if(year % 4 ==0 && year % 100 != 0){
	  	System.out.println("�����Ϊ����");	
	  }else if (year % 400 == 0) {
	  	System.out.println("�����Ϊ����");

	  	
	  }else{
	  	System.out.println("��������");
	  }


	}
}