package CodePractice;

public class ReverseWordInAString {
	
	public static String reverseWords(String s) {
		StringBuffer sb = new StringBuffer();
		int i=0;
		for(int k=0;k<s.length()-1;k++) {
			if(k==0 && s.charAt(k)==' ') {
				sb.append(" ");
				i++;
			}
			else {
				if(s.charAt(k)==' ' && s.charAt(k-1)!=' ') {
					StringBuffer s1 = new StringBuffer();
					s1.append(s.substring(i,k+1));
					sb.append(s1.reverse().toString());
				}
				else {
					sb.append(" ");
					i++;
				}
			}
		}
		return sb.toString();
	}

	public static void main(String[] args) {
		System.out.println(reverseWords("sky is blue"));
	}

}
