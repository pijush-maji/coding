package striver.bitManipulation;

public class DecimalToBinary {

    static String deci2Binary(int n){
        if(n==0 || n==1)
            return String.valueOf(n);
        StringBuilder sb = new StringBuilder();
        int i = n/2,r=n%2;
        sb.append(r);
        while(i>0){
            r=i%2;
            i=i/2;
            sb.append(r);
        }
        return sb.reverse().toString();
    }

    static int binary2Deci(String s){
        int res = 0,n=1;
        for(int i=s.length()-1;i>=0;i--){
            if(s.charAt(i)=='1'){
                res+=n;
            }
            n*=2;
        }
        return res;
    }
    public static void main(String[] args) {
        int d = 446733544 ;
        String bin = deci2Binary(d);
        int deci = binary2Deci(bin);
        System.out.println(bin);
        System.out.println(deci);
    }
}
