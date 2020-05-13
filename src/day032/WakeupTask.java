package day032;

public class WakeupTask {
    public static void main(String[] args) {
sayTheGoldenSentence();
    }
    public static void sayTheGoldenSentence(){
        String sentence="I can't do that";
        for(int i=1;i<=300;i++) {
            int index = sentence.indexOf("'");
            String s = "" + sentence.substring(index, index + 2);

            System.out.println(sentence.replace(s, ""));
        }
    }
}
