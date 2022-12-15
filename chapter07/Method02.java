public class Method02{
	public static void main(String[] args){
		//遍历一个数组，输出数组各个元素
		int [][] map ={{0,0,1},{1,1,1,},{1,1,3}};
		  MyTool myTool = new MyTool();
		  myTool.PirntMap(map);
		  myTool.PirntMap(map);
		  myTool.PirntMap(map);
	}
}
class MyTool{
	public void PirntMap(int[][]map){
			System.out.println("=======");
		for(int i = 0; i < map.length; i++){
			for(int j = 0; j < map.length; j++){
				System.out.print(map[i][j] + " ");
			}
				System.out.println();
		}
	}
}