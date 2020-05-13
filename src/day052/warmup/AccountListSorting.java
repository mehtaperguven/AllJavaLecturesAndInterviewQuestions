package day052.warmup;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class AccountListSorting  {
    public static void main(String[] args) {

        List<Account> accountList=new ArrayList<>();
        accountList.add(new Account("Erva Erguven",18000));
        accountList.add(new Account("Emir ERguven",13000));
        accountList.add(new Account("Feyza Erguven",15000));
        accountList.add(new Account("Dilara Demirkiran",19000));
         accountList.add(new Account("Duru Tarhan",113500));

        System.out.println("AccountList before sorting "+accountList);
        Collections.sort(accountList);
        System.out.println("AccountList after sorting "+accountList);

        int balanceAll=0;
        Account a1=new Account("Mehtap",1000);
        for (int i=0;i<accountList.size(); i++){
            accountList.get(i).transferAll(a1);

        }
        System.out.println(a1);
//    for (Account each:accountList){
//        each.transferAll(a1);
//    }
        //same application with the above

  /*
  * WHAT CAN BE DATA TYPE OF a1
  *
  * Account a1;
  * Comparable a1;
  * Transferable a1;
  * Object a1;
  *
  * AN OBJECT CAN BE REFERRED BY
  * it's own type
  * it's super class type
  * interface type that it is implemented
  * */


  Account acc1 =new Account("Polymorphism1",10000);
  Transferable t1=new Account("Polymorphism2",10000);
  Comparable c1=new Account("Polymorphism3",10000);
  Object o1=new Account("Polymorphism4",10000);

    }
}
