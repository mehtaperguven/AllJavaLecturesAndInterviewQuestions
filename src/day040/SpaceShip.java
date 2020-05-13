package day040;

public class SpaceShip {
    String name;
    String currentDirection;//left/right/up/down
    int xCoordinate;
    int yCoordinate;
    public void setInitialPosition(int xpos,int ypos){
        xCoordinate=xpos;
        yCoordinate=ypos;

    }
    public void setDirection(String direction){
        //not to have invalid
        if (direction.equalsIgnoreCase("up")||
        direction.equalsIgnoreCase("down")||
        direction.equalsIgnoreCase("right")||
        direction.equalsIgnoreCase("left")){
        currentDirection=direction;}
        else{
            System.out.println("invalid direction");
        }
    }
    public void  move1Block(String direction, int z) {
        int coordinate =0;
        if (direction.equals("right")) {
            setDirection(direction);
            xCoordinate= xCoordinate + z;
        } else if (direction.equals("left")) {
            setDirection(direction);
            xCoordinate = xCoordinate - z;
        } else if (direction.equals("up")) {
            setDirection(direction);
            yCoordinate = yCoordinate + z;
        } else if (direction.equals("down")) {
            setDirection(direction);
            yCoordinate= yCoordinate - z;
        }

    }
    public String toString(){

        String str="name is "+name+ " current direction is "+currentDirection+" x = "+xCoordinate+
                "  y = "+yCoordinate;
        return str;
    }

}
