import java.util.Scanner;
public class Nestedif{
	public static void main(String[] args) {
		//参加歌手比赛，如果初赛成绩大于 8.0 进入决赛，
		//否则提示淘汰。并且根据性别提示进入男子组或女子组
		Scanner myScanner  = new Scanner(System.in);
		System.out.println("输入成绩");
		double score = myScanner.nextDouble();
		if(score > 8.0){
			System.out.println("输入性别");
			char gender = myScanner.next().charAt(0);
			if(gender == '男'){
				System.out.println("进入男子组");

			}else if (gender == '女') {
				System.out.println("进入女子组");

				
			}else{
				System.out.println("性别输入有误");
			}


		}else{
			System.out.println("成绩不合格，淘汰");
		}
	}
}