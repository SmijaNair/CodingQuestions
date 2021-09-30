public class ReverseString {
    public static void main(String[] args) {
        String actualString ="Smija";
        String revString ="";
        for (int i=actualString.length()-1;i>=0;i--){
            revString=revString+actualString.charAt(i);
        }
        System.out.println("Actual String is "+actualString);
        System.out.println("Reverse String is "+revString);
    }
}
