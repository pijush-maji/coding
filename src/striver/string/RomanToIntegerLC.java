package striver.string;

public class RomanToIntegerLC {

    static int fun(String s){
        switch (s){
            case "I": return 1;
            case "V": return 5;
            case "X": return 10;
            case "L": return 50;
            case "C": return 100;
            case "D": return 500;
            case "M": return 1000;
            case "IV": return 4;
            case "IX": return 9;
            case "XL": return 40;
            case "XC": return 90;
            case "CD": return 400;
            case "CM": return 900;
            default: return 0;
        }
    }
    static int romanToInt(String s){
        int val = 0;
        for(int i=0;i<s.length();i++){
            boolean flag = false;
            if(i+1<s.length()){
                if((s.charAt(i)=='I' && (s.charAt(i+1)=='V' || s.charAt(i+1)=='X'))
                || (s.charAt(i)=='X' && (s.charAt(i+1)=='L' || s.charAt(i+1)=='C'))
                || (s.charAt(i)=='C' && (s.charAt(i+1)=='D' || s.charAt(i+1)=='M'))) {
                    val+=fun(s.substring(i,i+2));
                    i++;
                    flag = true;
                }
            }
            if(!flag)
                val+=fun(String.valueOf(s.charAt(i)));
        }
        return val;
    }

    public static void main(String[] args) {
        System.out.println(romanToInt("MCMXCIV"));
    }
}
