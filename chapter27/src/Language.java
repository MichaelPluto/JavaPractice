import javax.imageio.stream.ImageInputStream;

public class Language {
    public static void main(String[] args) {
        Language spanish = new Language("Spanish", 555000000, "Spain, Latin America, and Equatorial Guinea", "subject-verb-object");
        spanish.getInfo();
    }
    protected String name;
    protected int numSpeaker;
    protected String regionsSpoken;
    protected String wordOrder;

    Language(String name, int numSpeaker,
             String regionsSpoken,String wordOrder){
        this.name = name;
        this.numSpeaker = numSpeaker;
        this.regionsSpoken = regionsSpoken;
        this.wordOrder = wordOrder;
    }
    public void getInfo(){
        System.out.println(name + "is spokrn by" + numSpeaker + "peopel mainly in" + regionsSpoken + "The language follows the word order:" + "wordOrder");
    }
}
