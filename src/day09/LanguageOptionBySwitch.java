package day09;

import java.util.Scanner;

public class LanguageOptionBySwitch {
    public static void main(String[] args) {

       Scanner scan=new Scanner(System.in);
        System.out.println("Welcome to Cybertek Call Center ");
        System.out.println("Please select your language option from 1-7");

        int languageOption = scan.nextInt();

                String greeting = "";
    switch(languageOption){
    case 1:
        greeting = "Salam";
        break;
    case 2:
        greeting = "Hello";
        break;
    case 3:
         greeting = "Privet";
         break;
    case 4:
        greeting = "Szia";
        break;
    case 5:
        greeting = "Hola";
        break;
    case 6:
        greeting = "merhaba";
        break;
    case 7:
        greeting = "Bonjour";
        break;
    default:
            greeting="Unkown";
                }

                System.out.println(greeting + ", SDAT");

            }
        }



