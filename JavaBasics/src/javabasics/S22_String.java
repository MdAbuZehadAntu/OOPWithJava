package javabasics;

public class S22_String {

    public static void main(String[] args) {
        String str1 = "Hello";
        String str2 = new String("hEllo");

        //checking if the strings are same
        if (str1.equals(str2)) {
            System.out.println("They are equal");
        } else {
            System.out.println("They are not equal or same");
        }

        //Checking if the strings are equal ignoring cases 
        if (str1.equalsIgnoreCase(str2)) {
            System.out.println("They are equal ignoring case");
        } else {
            System.out.println("They are not equal or same ignoring case");
        }

        // Checking if the String is empty
        System.out.println(str1.isEmpty());

        //Concatenation of the strings
        String str3 = "World";
        String str4;
        str4 = str1 + " " + str3;// this is one waY
        System.out.println(str4);
        
        str4 = str1.concat(" ").concat(str3);//this is another way
        System.out.println(str4);
        
        str4=str4.toUpperCase();
        System.out.println(str4);
        
        System.out.println(str4.startsWith("HE"));
        System.out.println(str4.endsWith("D"));
    }

}
