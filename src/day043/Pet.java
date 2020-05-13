package day043;

public class Pet {//Pet class for Pet objects

   private String type;
    private String name;

    public Pet(){//default customer

        this.name="no-name";
        this.type="unknown";
    }
    public Pet(String type,String name){
this.type=type;
this.name=name;
    }
    /*cat --> meow
 				dog --> woof
 				cow --> mooo
 				horse --> neinei   */
public void speak(){
        if (type.equalsIgnoreCase("cat")){
            System.out.println("Meow");
        }else if (type.equalsIgnoreCase("Dog")){
            System.out.println("woof");
        }else if(type.equalsIgnoreCase("Cow")){
            System.out.println("mooo");
        }else if (type.equalsIgnoreCase("Horse")){
            System.out.println("neinei");
        }else{
            System.out.println("Unknown animal");
        }
}
    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String toString() {
        return "Pet{" +
                "type=" + type+
                ", name='" + name + '\'' +
                '}';
    }
    /**
     * //A class can have static method in the instance field
     * //we can make any method static
     * // when we do not have any object to call to work with it
     * //Static method can not access anything non static
     */
    public static void showGeneralInfo(){

        System.out.println("Pets are friend of humans");
    }
}
