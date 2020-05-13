package day09;

public class InitializingAVariable {
    public static void main(String[] args) {
        //NEW TASK
        //Language Picker:
        // assume you are on the call and you have been given an option
        // to be greeted by the language of your choice according
        // to the number you choosed
        //Produce a variable called languageOption assign value,
        // string variable called greeting, assign an empty string
        //1--> "Hello"
        // 2--> "Salam"
        // 3-->"Hola"
        //4-->"Privet"
        //5-->"Merhaba"
        //6-->"Szia"
        //7-->"Bonjour"
        // Program should set
        // the value of string variable called greeting to this value
        //1--> "Hello, SDET"
        int languageOption = 9;
        System.out.println(languageOption);
        // a variable inside a method must have initial value
        //before it's being used for the first time
        String greeting = "";

        if (languageOption == 1) {
            greeting = "Hello";
        } else if (languageOption == 2) {
            greeting = "Salam";
        } else if (languageOption == 3) {
            greeting = "Hola";
        } else if (languageOption == 4) {
            greeting = "Privet";
        } else if (languageOption == 5) {
            greeting = "Merhaba";
        } else if (languageOption == 6) {
            greeting = "Szia";

        } else if (languageOption == 7) {
                greeting = "Bonjour";
            }
        else{
            greeting="UNKNOWN";
           }
        greeting=greeting+" , SDAT";
        System.out.println(greeting + ", SDAT");

        }
    }
