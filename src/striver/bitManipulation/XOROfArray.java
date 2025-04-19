package striver.bitManipulation;

//https://leetcode.com/problems/xor-operation-in-an-array/description/
public class XOROfArray {

    static int fun(int n){
        switch (n%4){
            case 1:
                return 1;
            case 2:
                return n+1;
            case 3:
                return 0;
            case 0:
                return n;
        }
        return 0;
    }

    static int getXor(int start, int n){
        return (start & n & 1) | ((fun((start>>1)+n-1)^fun((start>>1)-1))<<1);
    }

    public static void main(String[] args) {
        System.out.println(getXor(5,10));
    }
}
