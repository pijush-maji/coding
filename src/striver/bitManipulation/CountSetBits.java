package striver.bitManipulation;

//Approach is to unset the bits from right one by one using the concept of
//UnsetRightMostSetBit
public class CountSetBits {
    public static void main(String[] args) {
        int n = 23;
        System.out.println(Integer.toBinaryString(23));
        int cnt = 0;
        while(n!=0){
            n=n&(n-1);
            cnt++;
        }
        System.out.println(cnt);
    }
}
