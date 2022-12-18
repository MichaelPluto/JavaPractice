public class Homework02{
	public static void main(String[] args){
		String []arr = {"杨质飞","刘芮"};
		A02 tool = new A02();
		int index = tool.find("刘芮",arr);
		System.out.println("查找到的index=" + index);

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