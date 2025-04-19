package striver.bitManipulation;

public class SwapTwoNumbers {
    public static void main(String[] args) {
        int a=23;
        int b=61;
        a = a^b; // 23^61
        b = a^b; // (23^61)^61 = 23
        a = a^b; // (23^61)^23 = 61
        System.out.println(a);
        System.out.println(b);
    }
}
