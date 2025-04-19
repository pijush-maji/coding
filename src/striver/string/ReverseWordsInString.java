package striver.string;

public class ReverseWordsInString {

    static String reverse(String s){
        StringBuilder sb = new StringBuilder();
        int n = s.length();
        boolean flag = false;
        int k=n;
        for(int i=n-1;i>=0;i--){
            if(s.charAt(i)==' '){
                if(flag){
                   sb.append(s.substring(i+1,k));
                   sb.append(' ');
                   k=i;
                   flag=false;
                }else{
                    k--;
                }
            }else{
                flag=true;
            }
        }
        if(flag)
            sb.append(s.substring(0,k));
        return sb.toString().trim();
    }


    public static void main(String[] args) {
        System.out.println(reverse("the sky is blue"));
    }
}
