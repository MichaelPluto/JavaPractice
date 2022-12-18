public class Homework011{
	public static void main(String[] args){
		MyTools t1 = new MyTools();
		System.out.println(t1.method("method(10.0, 20.0)", 100));
	}
}
class MyTools{

	public String method(String src, int n){
		return src + n;
	}
}