package day053;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ManyFruits {
    public static void main(String[] args) {
        Fruit f1=new Apple ("sweet","red","Gala");
        Fruit f2 = new Apple("sour", "green", "Golden");
        Fruit f3 = new Orange("Very sweet", "orange", 13);
        Fruit f4 = new Orange("Sour", "light orange", 10);
        System.out.println("f1        "+f1);

        System.out.println("&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&");
        Test t=new Test2();

        t.saySomeThing();
        Orange o=new Orange("abc","yellow",11);
        Apple a11=new Apple("a","b","c");
        System.out.println("%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%");
        a11.getDigested();
        o.getDigested();
        f1.getDigested();
        System.out.println("################");
        f4.getDigested();
        o.getDigested();
        System.out.println("^^^^^^^^^^^^^^^^^^^^^^");
        System.out.println("f1   >>>>>> "+f1);
        System.out.println("f4   >>>>>>>"+f4);

        System.out.println("........"+o.vcLevel);
        System.out.println("............."+o.color);






        Fruit [] myFruits={f1,f2,f3,f4};
        System.out.println(Arrays.toString(myFruits));
        System.out.println();
        for (Fruit each:myFruits){
            System.out.println(each);
        }
        
        //List<Fruit> fruitList=Arrays.asList(f1,f2,f3,f4);

        List<Fruit>fruitList1=new ArrayList<>(Arrays.asList(f1,f2,f3,f4));    
        for (Fruit each:fruitList1){
            System.out.println("each.toString() = " + each.toString());
            System.out.println("Class TYpe :"+each.getClass().getSimpleName());
        }

        for (Fruit each:myFruits){
            each.getDigested();
        }
    
    }
}
