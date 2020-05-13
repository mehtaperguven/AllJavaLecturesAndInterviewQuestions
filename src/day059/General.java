package day059;

public class General {
    public static void main(String[] args) {

        Object o = new String("abc");
        //System.out.println(o.charAt(0));// will not work


        System.out.println("The start");
        String str ="";
        try {
            System.out.println("END of MY TRY");
            System.out.println(str.charAt(0));

        } catch (NullPointerException blabla) {
            System.out.println("NULL STR, THERE IS NO OBJECT HERE ONLY CONTAINER");
        }catch(Exception eee){

            System.out.println(eee.getMessage());// gives following message ...String index out of range: 0

            System.out.println("which gives from EXCEPTIONS TYPE");
        }
        System.out.println("THE END");




    }
}
//if we put more general exception type in try catch block first
//sub type would not be able to catch specific exceptions

//most specific exception type should come first !!!!!!
// }catch(Exception eee){ should not be first
//} catch (NullPointerException blabla) { should be first

