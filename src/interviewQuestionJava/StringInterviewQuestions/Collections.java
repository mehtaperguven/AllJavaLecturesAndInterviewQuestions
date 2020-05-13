package interviewQuestionJava.StringInterviewQuestions;

import org.w3c.dom.ls.LSOutput;

import java.util.*;

public class Collections {



    public static void main(String[] args) {

        List<Integer> list=Arrays.asList(1,2,3,4);

        int arr[]={1,2,3,4};

        System.out.println("list"+list);

        System.out.println(Arrays.toString(arr));

        int arr1[]=new int [4];
        int arr4[]={1,3,5,10};


        int max=arr4[0];
        for (int i=0;i<arr4.length;i++){
            if (arr4[i]>max){
                max=arr4[i];
            }

        }
        System.out.println("max "+max);

int temp; int l=arr4.length;
        for (int i=0;i<l/2;i++){
            temp=arr4[i];
            arr4[i]=arr4[l-i-1];//arr4[4-0-1]=arr4[3]
            arr4[l-i-1]=temp;
        }

        System.out.println(">>>."+Arrays.toString(arr4));



        int a1[][]={{1,2,3},{2,5,8}};
        System.out.println(Arrays.deepToString(a1));
        System.out.println(a1[1][0]);

        for (int i=0;i<2;i++){ //i represents number of rows ...index of first row is 0 and second row is 1
            for (int j=0;j<3;j++){//j represents column for each element, starts from 0.
                System.out.print(a1[i][j]+" ");
            }
            System.out.println();
        }


        List<String> lst=Arrays.asList("A","B");
        List<String> lst2=new ArrayList<>(lst);
        List<String> lst3=new ArrayList<String>(lst2);
        System.out.println(">>>>>>"+lst);
        System.out.println(">>>>>"+lst2);




        int[][] myNumbers = { {1, 2, 3, 4}, {5, 6, 7} };
        for (int i = 0; i < myNumbers.length; ++i) {
            for(int j = 0; j < myNumbers[i].length; ++j) {
                System.out.print(myNumbers[i][j]+" ");
            }
            System.out.println();
        }

        Set<Integer> mySet=new TreeSet<>();//PUTS MIN ONE AS FIRST ELEMENT WHEN WE PRINT
        Set<Integer> myNums2=new HashSet<>();//DOES NOT KEEP ENTRY ORDER
        HashSet<Integer> myNums=new HashSet<>(Arrays.asList(5,9));

        List<Integer> numList= Arrays.asList(10,10,30,90,78,78,90,30);
        Set<Integer> myUnOrderedSet=new HashSet<>(numList);

        Set<Integer> newInt=new TreeSet<>(Arrays.asList(2,4,6,8,8));

        System.out.println("newINt................."+newInt);

        LinkedList<String> object = new LinkedList<String>();

        // Adding elements to the linked list
        object.add("A");
        object.add("B");
        object.addLast("C");
        object.addFirst("D");
        object.add(2, "E");

        System.out.println("Linked list : " + object);

    }



}
