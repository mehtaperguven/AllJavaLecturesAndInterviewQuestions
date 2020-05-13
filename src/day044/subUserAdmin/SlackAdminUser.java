package day044.subUserAdmin;

import day044.SlackUser;

public class SlackAdminUser extends SlackUser {

        int adminId;

        public SlackAdminUser(String name,String status,int adminId){
            this.name=name;
            this.status=status;
            this.adminId=adminId;
        }
        public void sendAtChannelMessage(){
            System.out.println("Please send meeting ID");
        }
        public void deleteMessage(){
            System.out.println("Message deleted");
        }
        public void addChannel(){
            System.out.println("Add mentoring session ");
        }

        public String toString() {
            return "SlackAdminUser{" +
                    "adminId=" + adminId +
                    ", name='" + name + '\'' +
                    ", status='" + status + '\'' +
                    '}';
        }

        public static void main(String[] args) {
            SlackAdminUser user1= new SlackAdminUser("Erva Erguven","student",1234);
            //BELOW ARE INHERITED METHODS/BEHAVIOURS
            user1.addEmoji();
            user1.sendMessage();
            user1.callSomeone();
            //ENDING HERE
            user1.sendAtChannelMessage();
            System.out.println(user1);
            user1.addChannel();
            user1.deleteMessage();
            SlackAdminUser user2=new SlackAdminUser("Akbar","Teacher",11111);
            System.out.println(user2);



        }
    }






