package day031;

public class DailyRoutine {
    public static void wakeUp(){
        System.out.println("Open your eyes");
        System.out.println("Close your eyes");
        System.out.println("Hear your alarm ? Open it again");
        System.out.println("------------------");
    }
    public static void drinkCoffee(){
        System.out.println("Make your coffee");
        System.out.println("Press the button make your coffee");
        System.out.println("------------------");
    }
    public static void prepareKidsToSchool(){
        System.out.println("Wake them up");
        System.out.println("Prepare their breakfast ");
        System.out.println("-----------------");
    }
public static void takeThemToSchool(){
    System.out.println("Take them to school bus");
    System.out.println("Take a rest for a while");
    System.out.println("-----------------");
}
public static void studyJava(){
    System.out.println("Think about java waking up ");
    System.out.println("Think about java drinking Coffee ");
    System.out.println("Think about java preparing Kids forSchool");
    System.out.println("Eventually sit down and study java, practice practice");
    System.out.println("-----------------");
    }
    public static void sayILoveJava300Times(){
        for (int i=1;i<=300;i++){
            System.out.println("I love Java");
        }
    }
    public static void main(String[] args) {
        wakeUp();
         drinkCoffee();
            prepareKidsToSchool();
            takeThemToSchool();
             studyJava();
             sayILoveJava300Times();
    }
}
