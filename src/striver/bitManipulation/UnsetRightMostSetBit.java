package striver.bitManipulation;

public class UnsetRightMostSetBit {

    public static void main(String[] args) {
        int n = 23;
        System.out.println(Integer.toBinaryString(23));
        int m = n&(n-1);
        System.out.println(Integer.toBinaryString(m));
    }
}
