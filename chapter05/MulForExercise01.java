import java.util.Scanner;
public class MulForExercise01{
	public static void main(String[] args){
	Scanner myScanner = new Scanner(System.in);
	 //Í³¼Æ3¸ö°à³É¼¨Çé¿ö£¬Ã¿¸ö°àÓÐ5ÃûÑ§Éú£»
	 //Çó³ö¸÷¸ö°àµÄÆ½¾ù·ÖºÍËùÓÐ°à¼¶µÄÆ½¾ù·Ö¡¾¼üÅÌÊäÈë³É¼¨¡¿
	 //Í³¼ÆÈý¸ö°à¼°¸ñÈËÊý£¬Ã¿¸ö°àÓÐ5ÃûÍ¬Ñ§¡£
	 //£¨1£©ÏÈ¼ÆËãÒ»¸ö°à£¬5¸öÑ§ÉúµÄ³É¼¨£»for
	//   1.1 Scanner ½ÓÊÕ£¬ÓÃ»§ÊäÈë
	//	 1.2 ¼ÆËãÒ»¸ö°àµÄ×Ü³É¼¨ sum ²¢Çó³öÒ»¸ö°àµÄÆ½¾ùÖµ sum/5
	// £¨2£©Íâ²ãforÑ­»·ÊµÏÖÈý¸ö°à 15ÃûÑ§ÉúµÄ³É¼¨Õ¹Ê¾ºÍ¸÷¸ö°àµÄÆ½¾ù·Ö
	// £¨3£©Çó³öËùÓÐ°à¼¶µÄÆ½¾ù·Ö£»
	//	 3.1 ¶¨ÒåÒ»¸ö±äÁ¿ totalSum = ËùÓÐ°àµÄ×Ü³É¼¨
	//	 3.2 totalSum += sum
	//	 3.3 totalSum / 15 ±ãÊÇÈ«Äê¼¶µÄÆ½¾ù·Ö
	// £¨4£©ÓÃifÓï¾äÅÐ¶Ï¼°¸ñÌõ¼þ
	//	 4.1 ¶¨ÒåÒ»¸öcount¼ÇÂ¼¼°¸ñÈËÊý
	//	 4.2 µ±ÓÐÒ»¸öÑ§Éú³É¼¨>=60Ê±£¬count++
	int count = 0;
	double totalSum = 0;
	double sum = 0;
	  for(int i = 1; i <= 3; i++){
		for(int j =1; j <= 5; j++) {
			System.out.println("ÊäÈëµÚ"+ i +"¸ö°àµÚ" + j +"¸öÍ¬Ñ§µÄ³É¼¨");
			double score = myScanner.nextDouble();
			System.out.println("³É¼¨Îª" + score);
			if(score >= 60){
				count++;
			}
			sum += score;
			totalSum += sum; 
		}
	  		System.out.println("Æ½¾ù·ÖÎª" + sum/5);

	   	}
	  		System.out.println("È«Äê¼¶Æ½¾ù·ÖÎª" + totalSum / 15);
			System.out.println("¼°¸ñÈËÊýÎª" + count);
	}
}