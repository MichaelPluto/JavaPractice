public class HomeWork06{
	public static void main(String[] args){
		char[] arr1 = {'a','z','b','c'};
		char[] arr2 = arr1;//让arr2指向arr1
		arr1[2] = '杨';// arr1 和 arr2 都会改变
		for(int i = 0; i < arr1.length; i++){
			System.out.println(arr1[i] + "," + arr2[i]);
			
		}
	}
}