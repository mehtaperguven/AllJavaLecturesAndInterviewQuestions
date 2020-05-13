package day011;

public class LogicalOperator_SingleAndDouble {
    public static void main(String[] args) {
        //&& ..double ampersand checks both conditions are true simultaneously
        //it does not check the next conditions if the first condition is false
        //like  we have multiple condition for rocket launching
        //isEngineRunning, isCommunicationSystemWorking, isAirEnough
        //isEngineRunning&&isCommunicationSystemWorking&&isAirEnough
        //if isEngineRunning FALSE it does not check the others

        //**********
        //& checks all conditions anyway and give the result
/*
        System.out.println(7>5 & 1>7);
        System.out.println(5>5 & 1>7);
        System.out.println(1>5 & 9>7);
        //System.out.println(9/0); gives error
        //System.out.println(9/0==3);//it gives error because it is not valid operation

        System.out.println(5>10 && 9/0==3);//...>it gives false because of && it checks the first one
        // if it is false it stops and prints false
        System.out.println(5>10 & 9/0==3);//...> it gives error since & checks all conditions
        */
        System.out.println("***********");


        System.out.println(10>5||9/0==3);
        //if you have "||" if catches yes it stops and does not check others
        System.out.println(10>5| 9/0==3);
        //"one single pipe |" will check each cases one by one!!!

    }
}
