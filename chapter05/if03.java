import java.util.Scanner;
public class if03{
	public static void main(String[] args) {
		//芝麻信用分信用判断
		Scanner myScanner   =  new Scanner(System.in);
		System.out.println("输入芝麻信用分");
		int grade = myScanner.nextInt();
	if (grade >= 1 && grade <= 100){	
		if(grade == 100){
			System.out.println("信用极好");

		}else if (grade > 80 && grade <= 90) {
			System.out.println("信用优秀");
		}else if (grade > 60 && grade <= 80) {
			System.out.println("信用一般");
		}else{
			System.out.println("信用不及格");
			}
		}else{
			System.out.println("信用分需要在1-100，请重新输入");
		}
	}
}