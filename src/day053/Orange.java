package day053;

public class Orange extends Fruit {

    int vcLevel;

    public Orange(String taste, String color,int vcLevel ){
        super(taste,color);
        this.vcLevel=vcLevel;
    }

    @Override
    public void getDigested() {
        System.out.println(" Orange has "+color+" color and it's vitamin level "
                +vcLevel+ " it's taste is "+ taste);
    }

    @Override
    public String toString() {
        return "Orange{" +
                "vcLevel=" + vcLevel +
                ", taste='" + taste + '\'' +
                ", color='" + color + '\'' +
                '}';
    }
}
