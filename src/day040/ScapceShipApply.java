package day040;

public class ScapceShipApply {
    public static void main(String[] args) {

        SpaceShip space1=new SpaceShip();
        space1.name="Cybertek";
        System.out.println(space1);
        space1.setInitialPosition(0,4);//we set initial position
        System.out.println(space1);
       // space1.setDirection("up");
        space1.move1Block("down",1);//we change direction
        System.out.println(space1 );
        space1.move1Block("right",5);
        System.out.println("********");
        System.out.println(space1);

        space1.setDirection("ABC");
        space1.move1Block("left",9);
        System.out.println(space1);
    }
}
