package lcCompetition;

public class MirrorScoreofString {
    // Testcases not passed got TLE
    static long fun(String s){
        long score = 0;
        int n = s.length();
        char[] arr = s.toCharArray();
        for(int i = 1;i<n;i++){
            for(int j=i-1;j>=0;j--){
                if(arr[j]=='*')
                    continue;
                if(arr[i]-97==122-arr[j] || 122-arr[i]==arr[j]-97){
                    score+=(i-j);
                    arr[i]='*';
                    arr[j]='*';
                    break;
                }
            }
        }
        return score;
    }

    public static void main(String[] args) {
        System.out.println(fun("eockppxdqclkhjgvnw"));
    }
}
