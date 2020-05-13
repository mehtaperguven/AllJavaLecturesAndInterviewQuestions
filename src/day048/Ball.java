package day048;
/*Ball is  implementing class of Bouncible

	instance fields
		shape as String
		color as String
	create constructor to set those 2 fields
	instance methods
		implements abstract method from interface
		toString method */
public class Ball implements Bounceable {
  String shape;
  String color;

  public  Ball(String shape, String color){
      this.shape=shape;
      this.color=color;

  }
    @Override
    public void bounce() {
        System.out.println(shape+" "+color+ " color ball is bouncing");
    }

    @Override
    public String toString() {
        return "Ball{" +
                "shape='" + shape + '\'' +
                ", color='" + color + '\'' +
                '}';
    }
}
