public class MethodExercise01{
	public static void main(String[] args){
//��д�� AA ����һ��������
//�ж�һ���������� odd ����ż��, ���� boolean
		judge A = new judge();
		 //boolean B = A.judgeNum(6);
		if(A.judgeNum(266)){//�޸ĺ�
			System.out.println("��ż��\n");
		}else{
			System.out.println("������\n");
		}
		System.out.println("��ӡ����ͼ��Ϊ\n");
		A.print(5, 5, '#');
	}
}
class judge{
	// ˼·��
	// 1.��������ֵ��boolean
	// 2.���������֣�judgNum
	// 3.�������βΣ�int n
	// 4.�����Ľṹ�᣺�ж����
	public boolean judgeNum (int n){
		if(n % 2 == 0){
		return true;
	}else{
		return false;
	}
	}
//�����С��С��ַ���ӡ ��Ӧ�������������ַ���
//���磺�У�4���У�4���ַ�#,���ӡ��Ӧ��Ч��
//��ӡЧ�����£�
   // ####      	
   // ####
   // ####
   // #### 	
   //˼·
	//1.��������ֵvoid
	//2.�������� print
	//3.�β�Ϊ��int row, int column , char c��
	//4.�ṹ��Ϊѭ�����

   public void print(int row, int col, char c){
   	for(int i = 1; i <=row; i++){
   		for(int j = 1; j <=col; j++){
   			System.out.print(c);

   		}
   			System.out.println();//����
   	}
   			
   }

}