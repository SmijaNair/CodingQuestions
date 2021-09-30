import java.util.Locale;

public class CheckifVowelPresent {
    public static void main(String[] args) {
        String aString="SmIja";
        String actualString =aString.toLowerCase();
//        for(int i=0;i<actualString.length();i++){
//            if(actualString.charAt(i)=='a'||actualString.charAt(i)=='e'|| actualString.charAt(i)=='i'||actualString.charAt(i)=='o'||actualString.charAt(i)=='u'){
//                System.out.println("Vowel is present "+actualString.charAt(i));
//            }
//        }
    Boolean a =containsVowel(actualString);
    System.out.println("boolean value is "+a);
    }
    public static boolean containsVowel(String actualString){
       return  actualString.matches(".*[aeiou].*");


    }
}
