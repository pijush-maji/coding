package striver.bitManipulation;

public class SingleNumberIII {

    static int[] fun(int[] nums){
        int temp = 0;
        for(Integer i:nums){
            temp^=i;
        }
        //will produce right most set bit and remaining are unset
        //also this will differentiate the two unique number
        int n = (temp&(temp-1))^temp;
        int a=0;
        int b=0;
        for(Integer i : nums){
            if((i&n)!=0)
                a^=i;
            else
                b^=i;
        }
        int res[] = new int[2];
        res[0]=a;
        res[1]=b;
        return res;
    }
}
