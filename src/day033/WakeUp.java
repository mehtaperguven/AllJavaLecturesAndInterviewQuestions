package day033;

public class WakeUp {
    public static void main(String[] args) {

        String spelled = getSpelledName("Zeyneb");
        System.out.println(spelled);
        System.out.println(getSpelledWay2("Emir"));
    }
    //get spelled name put dash between given String
    //@param name is the name parameter
    //@return the name has dash between

    public static String getSpelledName(String name) {
        String result = "";
        String result1 = "";
        for (int i = 0; i < name.length(); i++) {
            if (i != name.length() - 1) {
                result = result + name.charAt(i) + "-";
            }
        }
        return result = result + name.charAt(name.length() - 1);
    }
    public static String getSpelledWay2(String name){
        String result1="";
        for (int i=0;i<name.length()-1;i++){
            result1+=name.charAt(i)+"-";

        }
        result1+=name.charAt(name.length()-1);
        return result1;

    }
}

