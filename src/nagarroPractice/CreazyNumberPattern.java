package nagarroPractice;

import java.util.Scanner;

//https://www.ambitionbox.com/interviews/nagarro-question/crazy-numbers-pattern-challenge-mfYZo4uZ?campaign=top_question_card_view_answer&expandQuestion=true
public class CreazyNumberPattern {
    public static void main(String[] args) {
        int t = 1;
        Scanner in = new Scanner(System.in);
        for(int i=0;i<t;i++){
            int n = in.nextInt();
            int k = 1;
            for(int j=1;j<=n;j++){
                int cnt=0;
                while(cnt<j){
                    System.out.print(k);
                    k++;
                    cnt++;
                    if(k==10)
                        k=1;
                }
                System.out.println();
            }
        }
    }
}
