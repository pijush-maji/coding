package striver.recursion;

public class AtoIWithoutRecursion {
    static int atoi(String s){
        long res = 0;
        char sign = '*';
        boolean foundNum = false;
        int min = (int)Math.pow(-2,31);
        int max = (int)Math.pow(2,31);
        for(Character c:s.toCharArray()){
            if(c==' ' && res==0 && !foundNum && sign=='*')
                continue;
            if((int)c>=48 && (int)c<=57){
                foundNum = true;
                res=res*10+Character.getNumericValue(c);
                if(res>max)
                    break;
            }else{
                if(sign=='*' && (c=='-' || c=='+') && !foundNum){
                    sign=c;
                    continue;
                }else{
                    break;
                }
            }

        }
        res =  sign=='-'?(-1)*res:res;

        if(res<min)
            return min;
        else if(res>max)
            return max;
        return (int)res;
    }

    public static void main(String[] args) {
        System.out.println(atoi("   +   34"));
    }
}
