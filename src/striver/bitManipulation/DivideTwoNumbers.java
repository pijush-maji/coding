package striver.bitManipulation;

public class DivideTwoNumbers {

    //without using multiplication, division and mod operator
    // a/b
    static int fun(int n,int d){
        if(n==d)
            return 1;
        boolean sign = false;
        if(n>=0 && d<0) sign = true;
        if(n<=0 && d>0) sign = true;
        long a=Math.abs((long) n); //if n or d = -2^31, then a or b will be 2^31 which is
        long b=Math.abs((long) d); // out of bound for integer, so we need to take long here
        long res=0;
        while(a>=b){
            long i=0;
            while(a-(b<<(i+1))>=0){
                i++;
            }
            long temp = (1l<<i);
            res+=temp;
            a-=(b<<i);
        }
        if(res>=Integer.MAX_VALUE && sign)
            return Integer.MIN_VALUE;
        if(res>=Integer.MAX_VALUE && !sign)
            return Integer.MAX_VALUE;
        return (int) (sign ? (-1)*res:res);
    }

    public static void main(String[] args) {
        System.out.println(fun(-2147483648,-1));
    }
}
