public class Homework04{
	public static void main(String[] args){
		int [] oldArr = {1,2,3,};
		A03 p = new A03();
		int[] newArr = p.copyArr(oldArr);
		//����nerArr��֤
		for(int i = 0; i < newArr.length; i++){
			System.out.print(newArr[i] + " ");
		}
			System.out.println();
	}
}
class A03 {

	public int[] copyArr(int[] oldArr){
		//�ڶ��д���һ������Ϊ oldArr.length����
		int [] newArr = new int[oldArr.length];
		//���� oldArr����Ԫ�ؿ����� newArr
		for(int i = 0; i < oldArr.length; i++){
			newArr[i] = oldArr[i];
		}
			return newArr;
	}
}