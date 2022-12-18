public class Homework01{
	public static void main(String[] args){
		A01 tool = new A01();
		double arr[] = {2.1, 2.2, 3.6};
		Double res = tool.max(arr);
		if(res != null){
			System.out.println(tool.max(arr));
		}else{
			System.out.println("arr输入有误，数组不能为null");
		}
	}
}
class A01 {

	public Double max(double []arr){//Double 是一个包装类
		//先判断arr是否为空 再判断大于0
		if(arr!= null && arr.length > 0){
		//保证arr至少有一个元素 
		double maxNum = arr[0];
	//遍历数组

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
