import java.util.Scanner;
public class MulForExercise01{
	public static void main(String[] args){
	Scanner myScanner = new Scanner(System.in);
	 //统计3个班成绩情况，每个班有5名学生；
	 //求出各个班的平均分和所有班级的平均分【键盘输入成绩】
	 //统计三个班及格人数，每个班有5名同学。
	 //（1）先计算一个班，5个学生的成绩；for
	//   1.1 Scanner 接收，用户输入
	//	 1.2 计算一个班的总成绩 sum 并求出一个班的平均值 sum/5
	// （2）外层for循环实现三个班 15名学生的成绩展示和各个班的平均分
	// （3）求出所有班级的平均分；
	//	 3.1 定义一个变量 totalSum = 所有班的总成绩
	//	 3.2 totalSum += sum
	//	 3.3 totalSum / 15 便是全年级的平均分
	// （4）用if语句判断及格条件
	//	 4.1 定义一个count记录及格人数
	//	 4.2 当有一个学生成绩>=60时，count++
	int count = 0;
	double totalSum = 0;
	double sum = 0;
	  for(int i = 1; i <= 3; i++){
		for(int j =1; j <= 5; j++) {
			System.out.println("输入第"+ i +"个班第" + j +"个同学的成绩");
			double score = myScanner.nextDouble();
			System.out.println("成绩为" + score);
			if(score >= 60){
				count++;
			}
			sum += score;
			totalSum += sum; 
		}
	  		System.out.println("平均分为" + sum/5);

	   	}
	  		System.out.println("全年级平均分为" + totalSum / 15);
			System.out.println("及格人数为" + count);
	}
}