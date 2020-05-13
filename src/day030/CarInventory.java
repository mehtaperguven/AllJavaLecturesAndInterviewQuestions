package day030;

public class CarInventory {
    public static void main(String[] args) {

        /*
        * {
"Acura-NSX",
"Chevrolet-Corvette",
"Chevrolet-Cavalier",
"BMW-3 Series",
"Pontiac-LeMans",
"BMW-7 Series",
"Oldsmobile-Achieva",
"Honda-Civic"}
Create a class called CarInventory with main
// count how many Chevrolet is in this array
// and how many civic you have*/
 String [] cars=new String[]{
         "Acura-NSX",
         "Chevrolet-Corvette",
         "Chevrolet-Cavalier",
         "BMW-3 Series",
         "Pontiac-LeMans",
         "BMW-7 Series",
         "Oldsmobile-Achieva",
         "Honda-Civic"};

        int countChevrolet=0;
        int countCivic=0;
    String name[]=new String[cars.length];
    for (int i=0;i<cars.length;i++){

    int indexOfHash=cars[i].indexOf("-");
    name[i]=cars[i].substring(0,indexOfHash);
    System.out.println(name[i]);

    if (name[i].equalsIgnoreCase("Chevrolet")){
        countChevrolet++;
    }else if(name[i].equalsIgnoreCase("civic")) {
        countCivic++;
    }
}
        System.out.println("Count of Chevrolet is: "+countChevrolet+" and Count of civic is : "+countCivic);



    }
}
