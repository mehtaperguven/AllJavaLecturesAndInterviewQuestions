package day044;

public class SlackUser {
    protected String name;
    protected String status;
    //to access data
    //we used protected since sub class SlackAdminUser is in another package

    //methods//behaviours below
    public void sendMessage(){
        System.out.println("Thanks for your study");

    }
    public void callSomeone(){
        System.out.println("Call the mentor");
    }
    public void addEmoji(){
        System.out.println("Smiley face");
    }
}
