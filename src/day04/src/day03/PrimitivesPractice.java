package day04.src.day03;

public class PrimitivesPractice {
    public static void main(String[] args) {

        byte letterCount=26;
        System.out.println("The letter count is ="+ letterCount  );
        short sheepCount=300;
        System.out.println("The sheep count is ="+ sheepCount  );
        int catCount=20;
        System.out.println("The cat count is ="+ catCount  );
        long mileToMoon=500000L;
        System.out.println("The mile to Moon is ="+ mileToMoon  );
        long mileToSun=10000000L;

        //----------L IS OPTIONAL
        System.out.println("The mile to Sun is ="+ mileToSun  );
        //-------floating point------
        //--------- we MUST PUT F after float type variable!!!!
        // upper or lowercase does not matter but f or F is MANDATORY
        float priceOfBanana=1.99f;
        System.out.println("The of Banana is ="+ priceOfBanana  );
        float priceOfPotato= 2.49F;
        System.out.println("The price of Potato is ="+ priceOfPotato  );
        //--------LARGER FLOATING NUMBERS-----------
        // it is not required d or D  USAGE OF D OR d is OPTIONAL!!!!!
        // However for good programming as a habit use d, D
        double priceOfIpad1 =355.99d;
        System.out.println("The price of Ipad1  is ="+ priceOfIpad1  );
        double priceOfIpadPro = 1024.99D;
        System.out.println("The price of Ipad pro  is ="+ priceOfIpadPro  );
        double priceOfMac = 2299.99;
        System.out.println("The price of Mac is ="+ priceOfMac  );

        //if you have a whole number compiler automatically assume is is an int
        //If you have a fractional number , compiler assume it is a double

    }
}
