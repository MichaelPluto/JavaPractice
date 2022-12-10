import java.util.Scanner;
public class SwitchExercise02{
	public static void main(String[] args) {
		//对学生成绩大于 60 分的，输出"合格"。低于 60 分的，输出"不合格"。
		//(注：输入的成绩不能大于 100), 提示 成绩/60
	Scanner myScanner = new Scanner(System.in);
		System.out.println("输入成绩");
		double grade = myScanner.nextDouble();
		double grade1 = grade / 60;
		if(grade >=0 && grade <=100){
		switch((int)grade1){
		  case 1:
		  	System.out.println("合格");
		  	break;
		  case 0:
		  	System.out.println("不合格");
		  	break;
		  // default:
		  // 	System.out.println("输入有误");

		}
	  } else{
	  		System.out.println("输入错误");
	  }
	}

}
