import java.util.Scanner;
public class Nestediftest{
	public static void main(String[] args) {
	/*编写一个出票系统
	4-10月是旺季：
		成人（18-60）：60
		儿童（<18）：30
		老人（>60）:三分之一
	淡季：
		成人：40
		其他：20	
	  */
	  Scanner myScanner = new Scanner(System.in);
	  System.out.println("输入月份");
	  int month = myScanner.nextInt();
	  if(month >= 1 && month <= 12){
	  if(month >= 4 && month <= 10){
	  	System.out.println("输入年龄");
	  	int age = myScanner.nextInt();
	  	int n1 = 60;
	  	int n2 = n1/2;
	  	int n3 = n1/3;

	  		if(age >= 18 && age <=60){
	  			System.out.println("成人票，票价为=" + n1);


	  	}else if (age < 18) {
	  		System.out.println("儿童票，票价为=" + n2 );
	  	
	  }else{
	  		System.out.println("老人票，票价为=" + n3);
	  }

	  }	else {
	  	System.out.println("输入年龄");
	  	int age = myScanner.nextInt();
	  	int n1 = 40;
	  	int n2 = 20;

	  	if(age >= 18 && age <= 60){
	  		System.out.println("成人票，票价为=" + n1);

	  	}else{
	  		System.out.println("票价为=" + n2);
	  	}
	  	
	  }
	}else{
		System.out.println("输入的月份有误");
	}

	}
}
