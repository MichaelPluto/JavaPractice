import java.util.Scanner;
public class Nestediftest{
	public static void main(String[] args) {
	/*��дһ����Ʊϵͳ
	4-10����������
		���ˣ�18-60����60
		��ͯ��<18����30
		���ˣ�>60��:����֮һ
	������
		���ˣ�40
		������20	
	  */
	  Scanner myScanner = new Scanner(System.in);
	  System.out.println("�����·�");
	  int month = myScanner.nextInt();
	  if(month >= 1 && month <= 12){
	  if(month >= 4 && month <= 10){
	  	System.out.println("��������");
	  	int age = myScanner.nextInt();
	  	int n1 = 60;
	  	int n2 = n1/2;
	  	int n3 = n1/3;

	  		if(age >= 18 && age <=60){
	  			System.out.println("����Ʊ��Ʊ��Ϊ=" + n1);


	  	}else if (age < 18) {
	  		System.out.println("��ͯƱ��Ʊ��Ϊ=" + n2 );
	  	
	  }else{
	  		System.out.println("����Ʊ��Ʊ��Ϊ=" + n3);
	  }

	  }	else {
	  	System.out.println("��������");
	  	int age = myScanner.nextInt();
	  	int n1 = 40;
	  	int n2 = 20;

	  	if(age >= 18 && age <= 60){
	  		System.out.println("����Ʊ��Ʊ��Ϊ=" + n1);

	  	}else{
	  		System.out.println("Ʊ��Ϊ=" + n2);
	  	}
	  	
	  }
	}else{
		System.out.println("������·�����");
	}

	}
}
