package day055.association;
//ASSOCIATION====DIFFERENT TYPE OF RELATION
//HAS-A RELATION
//Taxi ...>>>>HAS>>>>....Engine....Driver....Passenger
//Driver can be concrete class that would have its own type
//Engine can be a class that would be a type Engine
public class Taxi {
    int plateNumber;
    Engine eng;//This is our new instance field/variable
    Driver dr;//one more new data type comes by Driver class
    public Taxi(int plateNumber, Engine eng,Driver dr) {
        this.plateNumber = plateNumber;
        this.eng = eng;
        this.dr=dr;
    }

    @Override
    public String toString() {
        return "Taxi{" +
                "plateNumber=" + plateNumber +
                ", eng=" + eng +
                ", dr=" + dr +
                '}';
    }
}
class Engine {//class called Engine  is our new type!!!Like String, int
    String type;
    int horsePower;
    public Engine(String type, int horsePower){//constructor
        this.type=type;
        this.horsePower=horsePower;
    }

    @Override
    public String toString() {
        return "Engine{" +
                "type='" + type + '\'' +
                ", horsePower=" + horsePower +
                '}';
    }
}
class Driver{
    String name;
    int driverId;
    public Driver(String name, int driverId){
        this.driverId=driverId;
        this.name=name;
    }

    @Override
    public String toString() {
        return "Driver{" +
                "name='" + name + '\'' +
                ", driverId=" + driverId +
                '}';
    }
}