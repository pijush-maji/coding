package javaPractice.stream;
public class FindOccuranceinString {

    public static void main(String[] args) {
        String s = "pijushp";
        char c = 'p';

        System.out.println(s.chars().filter(ch->ch==c).count());

       int x = 016;
        System.out.println(x);

    }
}
