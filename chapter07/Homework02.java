public class Homework02{
	public static void main(String[] args){
		String []arr = {"���ʷ�","����"};
		A02 tool = new A02();
		int index = tool.find("����",arr);
		System.out.println("���ҵ���index=" + index);

	}
}
class A02 {

	public int find(String findStr,String []arr){
		if(arr != null){
		for(int i = 0; i < arr.length; i++){
			if(findStr.equals(arr[i])){
				return i;
			}
		
		}
			return 1;
		}else{
			return -1;
		}

	}
}