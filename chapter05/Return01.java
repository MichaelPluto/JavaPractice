public class Return01{
	public static void main(String[] args) {
		
		for(int i = 1; i <= 5; i++){
			if( i == 3){
				System.out.println("杨质飞帅哥" + i);
				return;//当return用在方法时，表示跳出方法
					 //如果使用再main中，表示退出程序
			}
				System.out.println("HelloWorld");			
		}
				System.out.println("go on ...");
	}
}