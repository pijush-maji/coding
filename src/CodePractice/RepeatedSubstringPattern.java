package CodePractice;

/**
 * 
 * @author pijush
 *
 *Problem link - https://leetcode.com/problems/repeated-substring-pattern/solutions/94352/java-simple-solution-with-explanation/?envType=study-plan-v2&envId=programming-skills
 */

public class RepeatedSubstringPattern {
	
	public static boolean check(String s) {
		int len = s.length();
		
		for(int i=len/2;i>=1;i--) {
			if(len%i==0) {
				int m=len/i;
				String subs = s.substring(0,i);
				StringBuilder sb = new StringBuilder();
				
				for(int j=0;j<m;j++) {
					sb.append(subs);
				}
				if(sb.toString().equals(s)) return true;
			}
		}
		return false;
	}
	
	public static void main(String[] args) {
		System.out.println(check("abcabcabcabc"));
	}

}
