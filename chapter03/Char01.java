//演示char的基本使用
public class Char01{
	public static void main(String[] args) {
		char c1 = 'a';
		char c2 = '\t';
		char c3 = '杨';
		char c4 = 97;//字符类型可以直接存放一个数字
		//复制整行的快捷键 ctrl+shift+D
		//删除整行的快捷键 ctrl+shift+K
		System.out.println(c1);
		System.out.println(c2);
		System.out.println(c3);
		System.out.println(c4);//当输出c4时候，会输出97表示的字符=》 编码概念
	}
}