public class SwapwithoutThirdVariable {
    public static void main(String[] args) {
        int a=100;
        int b=60;
  b=b+a;
  a=b-a;
  b=b-a;
        System.out.println("a is "+a);
        System.out.println("b is "+b);
    }
}
