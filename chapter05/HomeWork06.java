public class HomeWork06{
	public static void main(String[] args) {
		//Êä³ö1-100Ö®¼ä²»ÄÜ±»5Õû³ýµÄÊý£¬
		//Ã¿Îå¸öÒ»ÐÐ:Ê¹ÓÃÒ»¸öcount Í³¼ÆÊä³ö¸öÊý
		// µ±count%5=0Ê±¾ÍËµÃ÷Êä³öÎå¸öÁË£¬ÕâÊ±
		//  ÎÒÃÇÊä³öÒ»¸ö»»ÐÐ¼´¿É
		int count = 0;
		for(int i = 1; i <= 100; i++){
			if(i % 5 != 0){
				count++;
			System.out.print(i + "\t");
			if(count % 5 ==0){
				System.out.println();//»»ÐÐ
			}
		  }
		}
	}
}