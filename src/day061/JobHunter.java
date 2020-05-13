package day061;

import javax.print.attribute.standard.JobName;
import java.util.*;

public class JobHunter {
    public static void main(String[] args) {

        List<Job> lstJob=new LinkedList<>();


        //List<Job> lst=new ArrayList<>();



        Job j1=     new Job("Huston",60000,"Coctco");

        Job j2=new Job("texas",100000,"NTT");
        Job j3=new Job("Dallas",78000,"HomeDepot");
        Job j4=new Job("Dallas",90000,"Ikea");
        Job j5=new Job("Fort Worth",130000,"CVS");
       // lstJob.add(j1);
                 lstJob.add(new Job("Huston",60000,"Coctco"));
                 lstJob.add(new Job("texas",100000,"NTT"));


//                 lstJob.add(j1);
//                 lstJob.add(j2);
//                 lstJob.add(j3);


        lstJob.addAll(Arrays.asList(j1,j2,j3,j4,j5));

       //remove() and add() method LInkedLIst() better
        //get() method ArrayList() is better


        System.out.println("lstJob = " + lstJob);

        j1.getSalary();
        System.out.println(j1.getSalary());
        System.out.println(j2.getSalary());
        System.out.println(lstJob);


        System.out.println(j4.compareTo(j3));



        System.out.println("Before sorting \n"+lstJob);
        Collections.sort(lstJob);
        System.out.println("After sorting \n"+lstJob);


        Collections.sort(lstJob, Comparator.reverseOrder());
        System.out.println("After Comparator.reverseOrder() \n"+ lstJob);


        Collections.sort(lstJob,Collections.reverseOrder());
        System.out.println("After using Collections.reverseOrder() \n"+lstJob);

    }
}
