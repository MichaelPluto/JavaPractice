public class ForceConvertDetai01{
	public static void main(String[] args) {
		
		//ǿת����ֻ���������Ĳ�������Ч��������ʹ��С�����������ȼ�
		//int x = (int)10*3.5+6*1.5;//�������double->int
			int x = (int)(10*3.5+6*1.5);//��ȷ ��int��44.0->44
			System.out.println(x);


			char c1 = 100;//ok
			int m = 100;//ok\
			//char c2 = m;//���� int->char
			char c3 = (char)m;//ok
			System.out.println(c3);//��ȷ�����100��Ӧ�ַ���d

	}
} 