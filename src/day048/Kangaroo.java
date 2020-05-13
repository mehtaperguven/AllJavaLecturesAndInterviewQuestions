package day048;
/*Kangaroo
	instance fields :
		 name as String
		 int jumpDistance
	add constructor to set above two fields
	instance methods :
		implements abstract method from interface
		toString
		eat() */
// A CLASS CAN IMPLEMENT MORE THAN ONE INTERFACE AS BELOW
public class Kangaroo implements Bounceable, BoxerWithBellyPouch {//Bounceable is interface

   String name;
   int jumpDistance;

    public Kangaroo(String name, int jumpDistance) {
        this.name = name;
        this.jumpDistance = jumpDistance;
    }

    @Override
    public void bounce(){
        System.out.println(name+" Kangaroo is jumping "+jumpDistance+
                " meters far when gravity is "+GRAVITY);
    }
    @Override
    public void kickBox(){
        System.out.println("Kangroo is a kick boxer ");
}

    public void carryChildInThePocket(){
        System.out.println("Kangaroo carries its child in her pocket");
    }
    @Override
    public String toString() {
        return "Kangaroo{" +
                "name='" + name + '\'' +
                ", jumpDistance=" + jumpDistance +
                '}';
    }

    public void eat(){
        System.out.println(name+" Kangaroo likes eating vegetable.");
    }

    public static void main(String[] args) {
        Ball b1=new Ball("sphere","blue");
        b1.bounce();
        System.out.println(b1);
        Kangaroo k1=new Kangaroo("Jay",2);
        k1.eat();
        k1.bounce();
        k1.carryChildInThePocket();
        k1.kickBox();
        System.out.println(k1);

        //List<Integer> lst=new ArrayList<>();
        //SuperTYpe variableName=new SubTYpe(.......);
        //Below we give example
        Bounceable b11=new Kangaroo("Tototo",4);
        System.out.println(b11);

        BoxerWithBellyPouch b22=new Kangaroo ("Kango",3);
        System.out.println(b22);
        Bounceable b33=new Ball("Sphear","Green");
        System.out.println(b33);



    }
}
