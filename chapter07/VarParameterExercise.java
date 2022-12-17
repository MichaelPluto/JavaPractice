public class VarParameterExercise {
	public static void main(String[] args){
	//有三个方法，分别实现返回姓名和两门课成绩(总分)，
	//返回姓名和三门课成绩(总分)，返回姓名和五门课成绩（总分）。
	//封装成一个可变参数的方法
		HspMethod tool = new HspMethod();
		System.out.println(tool.showScore("杨质飞", 100, 99, 97, 87, 93));
		System.out.println(tool.showScore("刘芮", 0, 0, 0, 0, 0));
	}
}
class HspMethod {
	//方法：
	// 1.返回值 String
	// 2.方法名 showScore
	// 3.形参列表 （String name, int...nums）;
	// 4.方法体：求和
	public String showScore(String name, int...nums){
		int res = 0;
		for(int i = 0; i < nums.length; i++){
			res += nums[i];
		}
		return name + " " +  nums.length + "门课的成绩总分=" + res ;

	}
}