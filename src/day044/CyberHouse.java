package day044;

public class CyberHouse {
   private int houseNum;
    private String design;
    static String neighbourhoodName;//this belongs to CyberHouse

//constructor below can access anything
    public CyberHouse(int houseNum,String design){
        this.houseNum=houseNum;
        this.design=design;

    }public void showAllInfo(){//next instance method can access anything
        System.out.println("house Number is "+houseNum+"design name "+design+" neighbourhoodName "+neighbourhoodName);
    //access houseNum,access design,and access to static neighbourHood as well
    }public static void showNeighborhood(){
        System.out.println("neighbour hood Name "+neighbourhoodName);
       //System.out.println(houseNum);//does not work because houseNUm is not static
        //this field is static!!!!!
        //static method access only static member of same class
    }public int getHouseNum(){
        return houseNum;
    }public String getDesign() {
        return design;
    }
    public String toString() {
        return "CyberHouse{" +
                "houseNum=" + houseNum +
                ", design='" + design + '\'' +", neighborHoodName "+neighbourhoodName+
                '}';
    }
}
