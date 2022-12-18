public class Homework09{
	public static void main(String[] args){
		Music t = new Music("给我一首歌的时间",3.25);
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
		System.out.println("正在播放音乐");
	}

	public String getInfo(){
		return "音乐" +" " +  name + "播放时长" + " " +  times;
	}

}