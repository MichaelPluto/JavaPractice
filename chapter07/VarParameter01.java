public class VarParameter01 {
	public static void main(String[] args){
		HspMethod m = new HspMethod();
		System.out.println("��=" + m.sum(2,8,9,6));
	}
}
class HspMethod {
	// 1.int...��ʾ���յ��ǿɱ������������int
	//   ���Խ��ն��int��0-�ࣩ
	// 2.ʹ�ÿɱ����ʱ�����Ե���������ʹ�� numbs�ɵ�������  
	public int sum(int...nums) {
			int res = 0;
		for(int i = 0; i < nums.length; i++){
			res += nums[i];
		}
			return res;
	}
}