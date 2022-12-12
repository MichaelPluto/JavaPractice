public class ContinueDetail{
	public static void main(String[] args) {
	
	label1:
	for(int i =0; i < 4; i++){
		label2:
		for(int j = 0; j < 10; j++){
			if(j == 2){
				continue;//输出四组【0，1，3，4，5，6，7，8，9】
			//  continue label1; //输出四组【0，1】
			//  continue label2; //和continue一样	
			}	
			System.out.println(j);
		}
			System.out.println(" ")
	}	
	}
}