public class Homework01{
	public static void main(String[] args){
		A01 tool = new A01();
		double arr[] = {2.1, 2.2, 3.6};
		Double res = tool.max(arr);
		if(res != null){
			System.out.println(tool.max(arr));
		}else{
			System.out.println("arr�����������鲻��Ϊnull");
		}
	}
}
class A01 {

	public Double max(double []arr){//Double ��һ����װ��
		//���ж�arr�Ƿ�Ϊ�� ���жϴ���0
		if(arr!= null && arr.length > 0){
		//��֤arr������һ��Ԫ�� 
		double maxNum = arr[0];
	//��������

		for(int i = 1; i < arr.length; i++){
			if(arr[i] > maxNum){
				maxNum = arr[i];
			}
		}
			return maxNum;
		}else{
			return null;
		}
	}

}
