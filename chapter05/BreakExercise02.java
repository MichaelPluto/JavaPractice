import java.util.Scanner;
public class BreakExercise02{
	public static void main(String[] args) {
		//实现登录验证，有 3 次机会，
		// 如果用户名为"丁真" ,密码"666"提示登录成功，
		// 否则提示还有几次机会，请使用 for+break
		//思路：
		 //1.用Scanner对象接收键盘输入
		// 2.用equals 判断字符串内容
		// 3.用count记录机会次数

	Scanner myScanner = new Scanner(System.in);
		int count = 3;
		for(int i = 1; i <=3; i++){
			System.out.println("输入用户名");
			String name = myScanner.next();
			System.out.println("请输入密码");
			int password = myScanner.nextInt();
				if("丁真".equals(name) && password == 666){//字符串内容比较用equals；
			//  if(name.equals("丁真"))		
				System.out.println("登录成功");
				break ;
			}	
			System.out.println("密码错误");
			count--;
			System.out.println("还有" + count +"次机会");

		}

		}
	}
