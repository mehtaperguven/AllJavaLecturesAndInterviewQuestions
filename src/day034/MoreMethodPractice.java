package day034;

public class MoreMethodPractice {
    public static void main(String[] args) {
        System.out.println(monkeyTrouble(true, false));
        System.out.println(monkeyTrouble(false, false));
        System.out.println(monkeyTrouble(true, true));

        System.out.println(monkeyTrouble2(true, false));
        System.out.println(monkeyTrouble2(false, false));
        System.out.println(monkeyTrouble2(true, true));
    }
//if we type/** and enter we will get following @param @return

    /**
     * @param aSmile
     * @param bSmile
     * @return true only if both monkeys are smiling or both not smiling,else return false
     */
    public static boolean monkeyTrouble(boolean aSmile, boolean bSmile) {
        //return true;
        if ((aSmile && bSmile) || (!aSmile && !bSmile)) {
            return true;
        } else {
            return false;
        }
        //second and shorter way
        // return (aSmile&&bSmile)||(!aSmile&&!bSmile);

    }

    /**
     *
     * @param aSmile
     * @param bSmile
     * @return yes only if both monkeys are smiling or both not smiling
     */
    public static String monkeyTrouble2(boolean aSmile, boolean bSmile) {
        //return true;
        if ((aSmile && bSmile) || (!aSmile && !bSmile)) {
            return "Yes";
        } else {
            return "No";
        }
    }
}