package striver.bitManipulation;

public class CountNoOfSetBits {

    // n&n-1 will make the right most set bit to 0;
    public static void main(String[] args) {
        int n=23;
        int cnt=0;
        while(n!=0){
            n=n&(n-1);
            cnt++;
        }
        System.out.println(cnt);
    }
}
