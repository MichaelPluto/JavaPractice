public class Homework04{
	public static void main(String[] args){
		int [] oldArr = {1,2,3,};
		A03 p = new A03();
		int[] newArr = p.copyArr(oldArr);
		//遍历nerArr验证
		for(int i = 0; i < newArr.length; i++){
			System.out.print(newArr[i] + " ");
		}
			System.out.println();
	}
}
class A03 {

	public int[] copyArr(int[] oldArr){
		//在堆中创建一个长度为 oldArr.length数组
		int [] newArr = new int[oldArr.length];
		//遍历 oldArr，将元素拷贝到 newArr
		for(int i = 0; i < oldArr.length; i++){
			newArr[i] = oldArr[i];
		}
			return newArr;
	}
}