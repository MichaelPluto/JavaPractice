public class CharDetail{
	public static void main(String[] args){
		//��java�У�char�ı�����һ�������������ʮ����unicode���Ӧ���ַ�
			char c1 = 97;
			System.out.println(c1);//��� a

			char c2 = 'a';
			System.out.println((int)c2);//���'a'��Ӧ������ 97
			char c3 = '��';
			//char�����ǿ��Խ�������ģ��൱��һ����������Ϊ�����ж�ӦUnicode��
			System.out.println((int)c3);//��� 26472
			System.out.println('a' + 10);//��� 107
			//����С����
			char c5 = 'b' + 1;// b=98 b+1=99
			System.out.println((int)c5);//���99 ǿ������ת��
			System.out.println(c5); //c5=b+1=99 99��Ӧ��Ascll��Ϊc ���c
	}



			

}