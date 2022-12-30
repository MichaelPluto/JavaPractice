public class TestTemplate {
    //main 模板快捷键
    public static void main(String[] args) {

        //sout 模板快捷键
        System.out.println("=========");
        //fori for 循环快捷键
        for (int i = 0; i < 2; i++) {

        }
        //自创的快捷键
        int arr [][] = {{1,2,3,4}, {5,6,7,8}, {9,10,11,12}, {13,14,15,16}};
        for(int i = 0; i < arr.length; i++){
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j] + " ");

            }
            System.out.println();
        }
    }
}
