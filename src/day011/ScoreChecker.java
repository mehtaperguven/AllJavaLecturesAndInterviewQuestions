package day011;

public class ScoreChecker {

    // A program to check the score:
    /* ScoreChecker with main method
    Produce a variable called score assign value of your choice
    if the score is < 0 or >100-----:"INVALID SCORE"
    if the score==100 ---->>  PERFECT SCORE
    if score>70 && score<100  --->> YOU HAVE PASSED
    else --->> UNFORTUNATELY YOU HAVE FAILED
    */
    public static void main(String[] args) {
        int score = 30;
        if (score < 0 || score > 100) {

            System.out.println("INVALID SCORE");
        } else if (score == 100) {
            System.out.println("CONGRATULATIONS!!!PERFECT SCORE!!!!");
        } else if (score >= 70 && score < 100) {

            System.out.println("YOU HAVE PASSED");
        } else {
            System.out.println("UNFORTUNATELY YOU HAVE FAILED ");

        }

        if (score < 20) {
            System.out.println("Please come to my office");
        } else if (score > 30 && score < 40) {
            System.out.println("Attend additional classes");
        } else if (score > 40 && score < 70) {
            System.out.println("Little bit more study will let you to pass");
        }


    }
}