public class Homework09{
	public static void main(String[] args){
		Music t = new Music("����һ�׸��ʱ��",3.25);
		t.play();
		System.out.println(t.getInfo());
	}
}
class Music {
	String name;
	double times;

	public Music(String name, double times){
		this.name = name;
		this.times = times;
	}

	public void play(){
		System.out.println("���ڲ�������");
	}

	public String getInfo(){
		return "����" +" " +  name + "����ʱ��" + " " +  times;
	}

}