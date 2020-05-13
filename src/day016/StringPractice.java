package day016;

import java.util.Scanner;

public class StringPractice {
    public static void main(String[] args) {

        //task
        //String variable with tabTitle
        //assign tabTitle value to searchKeyword+
        //check if tabTitle start with your searchKeyword and end with - Google Search
        //if so print the test has passed
        //if not print Test failed
        //assume you do not  know tab title is already correct
        //(in real world we will capture it with automation
        Scanner scan=new Scanner(System.in);

        System.out.println("Enter keyword to search ");
        String keywordToSearch=scan.nextLine();
        String tabTitle=keywordToSearch+"- Google Search";
        if (tabTitle.startsWith(keywordToSearch) && tabTitle.endsWith(" - Google Search")){
            System.out.println("test  passed");
        }else{
            System.out.println("Test failed ");
        }



    }
}
