package day015;

public class StringCaseInsensitiveCheck {
    public static void main(String[] args) {
        String name="Arya Stark";
        System.out.println( name.contains("St"));
        System.out.println("name.contains(\"st\") result is = " + name.contains("st"));

        String upperCase=name.toUpperCase();
        System.out.println("upper Case name contains ST or not ? " + upperCase.contains("ST"));

        String lowerCaseName=name.toLowerCase();// arya stark
        System.out.println("lowercaseName contains st or not ? "+ lowerCaseName.contains("st"));
    //this is called method chaining , combining multiple method call
        //make my name all lowercase (String) than check whether it contains lowercase st

        System.out.println(name.toLowerCase().contains("st"));
        System.out.println(name.toUpperCase().contains("ST"));
    }
}
