public class Homework03{
	public static void main(String[] args){
	Book book = new Book("神雕侠侣", 300);
	book.info();
	book.updatePrice();
	book.info();
	
	}
}
class Book {
	//构造器
	String name;
	int price;
	public Book(String name, int price){
		this.name = name;
		this.price = price;
	}

	public void updatePrice (){
		if(price > 150){
			price = 150;
		}else if(price > 120){
			price = 100;
		}
	}
	public void info(){
		System.out.println("书名=" + name + "价格=" + price);
	}
}