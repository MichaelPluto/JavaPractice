public class ArryTest {
    public static void main(String[] args) {
        MyTools tool  = new MyTools();
        int [] arr = {20,-6,9,11,6};
        tool.bubble(arr);
        for(int i = 0; i < arr.length; i ++){
            System.out.print(arr[i] + "\t");
        }
    }

}
class MyTools {
    public void bubble(int[] arr){
        int temp = 0;
        for(int i = 0; i < arr.length - 1; i++){
            for (int j = 0; j < arr.length - 1 - i; j++) {
                if(arr[j] > arr[j + 1]){
                    temp = arr[j + 1];
                    arr[j + 1] = arr[j];
                    arr[j] = temp;
                }
            }
        }
    }
}
