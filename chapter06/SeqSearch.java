import java.util.Scanner;
public class SeqSearch{
	public static void main(String[] args){
		/*
		��һ�����У���üӥ������ëʨ����������������������������Ϸ
		���Ӽ�������������һ�����ƣ��ж��������Ƿ���������ơ�˳����ҡ� 
		 Ҫ��: ����ҵ��ˣ�����ʾ�ҵ����������±�ֵ��
		*/
		String [] arr ={"��üӥ��","��ëʨ��","��������","��������"};
		Scanner myScanner = new Scanner(System.in);
		System.out.println("����һ������");
			String name = myScanner.next();
		int index = -1;//����
		for(int i = 0; i < arr.length; i++){
			if(name.equals(arr[i])){
				index = i;
				System.out.println("�ҵ�" + name +" " + "�±�ֵΪ" + i);
				break;
			}

		}
			if(index == -1){//�������û���ҵ���Ӧ��ֵ
				System.out.println("û���ҵ�" + name);
			}
	}
}