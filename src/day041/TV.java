package day041;

public class TV {


//BELOW WE PREPARE BLUEPRINT /TEMPLATE FOR TV
    String name;
    String brand;
    boolean isOn;
    int currentChannel;
///ABOVE IS INSTANCE FIELD!!!!
//WE CAN PUT MAIN METHOD JUST IN HERE
    //HOWEVER KEEP TEMPLATE AS A TEMPLATE!!!!
    public void turnOn(){


        if (isOn==false){
            System.out.println("Turning on tv");
            isOn=true;
        }
    }public void turnOff(){
        //if(isOn) same as if(isOn==true)
        if (isOn==true){
            System.out.println("turning off tv");
            isOn=false;
        }

    }public  int getCurrentChannel(){
        return currentChannel;
//valid channel is 0-50
    }public void setCurrentChannel(int newChannelNumber){
if (newChannelNumber>50||newChannelNumber<0){
    System.out.println("Invalid , getting out");
}
        if (isOn==true) {
            currentChannel = newChannelNumber;
        }else{
            System.out.println("FIRST TURN ON TV");
        }

    }public void moveForWard(){

    }public void moveBackWard(){

    }public String toString(){
        return "TV{name= "+name+ ", isOn= "+isOn+", currentChannel= "+currentChannel;
    }
}
