public class BreakDetail{
	public static void main(String[] args) {
	lable1:
		for(int i = 0; i < 4; i++){
			lable2:
			for(int j = 0; j < 10; j++){
				if(j == 2){
					//break lable2;//输出四组 0 1
					break lable1;//输出一组 0 1
				}
				System.out.println("j = " + j);
			}
		}	
	}
}