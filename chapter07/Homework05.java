public class Homework05{
	public static void main(String[] args){
		Circle t1 = new Circle(1);
		System.out.println("周长=" + t1.Perimeter());
		System.out.println("面积=" + t1.area());

	}
}
class Circle {
	double radius;

	public Circle(double radius){
		this.radius = radius;
	}

	public double Perimeter(){
		return 2*3.14*radius;
	}

	public double area(){
		return 3.14*radius*radius;
	}

}