import java.util.Scanner;
public class Input01{
	public static void main(String[] args) {
		 Scanner scanner  = new Scanner(System.in);
		 System.out.println("ѡ����ĳ�����");
		 String place = scanner.next();
		 System.out.println("�����������");
		 String name = scanner.next();
		 System.out.println("������ư����е�ʱ��");
		 int time = scanner.nextInt();
		 System.out.println("˵�������������");
		 String word = scanner.next();
		 System.out.println("����=" +name +" " +"������=" + place  + " "+"�ư�ʱ��" +time+ " " +"������=" + word );
	}
}