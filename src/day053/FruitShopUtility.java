package day053;

public class FruitShopUtility {
    public static void main(String[] args) {
        //Fruit f=null; is possible!!!!!!!!!!!!
        //we can return null for any reference type
Fruit f1=new Orange("sweet","Orange",13);
Fruit f2=new Apple("Crispy","Hot red","Gala");
  displayFruit(f1);
  displayFruit(f2);
  digestBetter(f1);
        System.out.println(getMyFavoriteFruit());
        System.out.println(getMyFavoriteFruit1());
    Fruit x=getMyFavoriteFruit1();

    x.getDigested();
        System.out.println();
    System.out.println("x.getDigested() = " + x);

    }




    //display fruit//we maid it static
    // to call it directly in static main method
    public static void displayFruit(Fruit anyFruit){
        System.out.println("Displaying fruit \n"+anyFruit.toString());
    }

    //new Method digestBetter
    //It accepts a Fruit as parameter type
    //and Inside the method, it will digest the fruit object 4 times
    // than displayInformation
    public static void digestBetter(Fruit newFruit){
        for (int i=1; i<=4; i++) {
            newFruit.getDigested();
        }
        System.out.println("newFruit.toString() = " + newFruit.toString());
    }

    public static Fruit getMyFavoriteFruit(){
        Fruit fr=new Orange("crispy","orange",15);
        return fr;
    }
    public static Fruit getMyFavoriteFruit1 (){
        return new Apple ("Sweet and Crisp","Yellow","Opal");
    }
    public static Fruit getFavoriteByType(int type){
        if (type==1){
            return new Apple("sour","green","Golden");
        }else if(type==2){
            return new Orange("crispy","light-orange",12);

        }else{
            return null;
        }
    }
    //sell fruit;

}
