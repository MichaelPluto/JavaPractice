public class VarParameterExercise {
	public static void main(String[] args){
	//�������������ֱ�ʵ�ַ������������ſγɼ�(�ܷ�)��
	//�������������ſγɼ�(�ܷ�)���������������ſγɼ����ܷ֣���
	//��װ��һ���ɱ�����ķ���
		HspMethod tool = new HspMethod();
		System.out.println(tool.showScore("���ʷ�", 100, 99, 97, 87, 93));
		System.out.println(tool.showScore("����", 0, 0, 0, 0, 0));
	}
}
class HspMethod {
	//������
	// 1.����ֵ String
	// 2.������ showScore
	// 3.�β��б� ��String name, int...nums��;
	// 4.�����壺���
	public String showScore(String name, int...nums){
		int res = 0;
		for(int i = 0; i < nums.length; i++){
			res += nums[i];
		}
		return name + " " +  nums.length + "�ſεĳɼ��ܷ�=" + res ;

	}
}