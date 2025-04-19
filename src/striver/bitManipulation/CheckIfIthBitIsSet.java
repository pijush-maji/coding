package striver.bitManipulation;

public class CheckIfIthBitIsSet {

    public static void main(String[] args) {
        int n = 23,i=3;
        System.out.println(Integer.toBinaryString(23));
        if((n&(1<<i))==0){
            System.out.println("Unset");
        }else{
            System.out.println("Set");
        }
    }
}
