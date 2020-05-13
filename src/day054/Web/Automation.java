package day054.Web;

import java.nio.channels.ClosedChannelException;

public class Automation {
    public static void main(String[] args) {
//  interview question is below
        //What is the line 9 doing????
        WebDriver c1=new ChromeDriver();//it is polymorphism
        //WebDriver is super type ,ChromeDriver is sub class
        // which implements WebDriver

        //Above webDriver is reference type
        // c1 is container c1 points to the ChromeDriver Object
       //WebDriver c1=new ChromeDriver();.....c1>>>points>>>ChromeDriver
        c1.openBrowser();
        c1.navigateTo("www.cybertekschool.com");
        c1.maximize();
        c1.closeBrowser();
        System.out.println("@@@@@@@@@@@@@@@@@@@@@@@@@");
        c1=new FireFox();//c1 now points to FireFox object
        //Now it is canceling pointing to ChromeDriver object
        //c1>>>>>>points>>>>>FireFox
        c1.openBrowser();
        c1.maximize();c1.navigateTo("www.learnCybertekSchool.com");
        c1.closeBrowser();
    }
}
