import java.util.Scanner;
public class SwitchExercise02{
	public static void main(String[] args) {
		//��ѧ���ɼ����� 60 �ֵģ����"�ϸ�"������ 60 �ֵģ����"���ϸ�"��
		//(ע������ĳɼ����ܴ��� 100), ��ʾ �ɼ�/60
	Scanner myScanner = new Scanner(System.in);
		System.out.println("����ɼ�");
		double grade = myScanner.nextDouble();
		double grade1 = grade / 60;
		if(grade >=0 && grade <=100){
		switch((int)grade1){
		  case 1:
		  	System.out.println("�ϸ�");
		  	break;
		  case 0:
		  	System.out.println("���ϸ�");
		  	break;
		  // default:
		  // 	System.out.println("��������");

		}
	  } else{
	  		System.out.println("�������");
	  }
	}

}
