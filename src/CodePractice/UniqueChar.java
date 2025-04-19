package CodePractice;
public class UniqueChar {
	public static void main(String[] args) {
		System.out.println(findTheDifference("abcd","abcde"));
		
	}
	
	/**
	 * Problem link - https://leetcode.com/problems/find-the-difference/description/?envType=study-plan-v2&envId=programming-skills 
	 * 
	 * Concept - XOR operation 'a' ^ 'a' is 0, 5^5=0, 0^1=1, so with these
	 * concept if with do xor operation it'll solve this problem
	 *  "abcd" ^ "abcde" = 'e' as same character will give 0 after xor 
	 *  operation.	
	**/
	public static char findTheDifference(String s, String t) {
        
		char c = 0;
		
		for(Character a:s.toCharArray()) {
			c^=a;
		}
		for(Character a : t.toCharArray()) {
			c^=a;
		}
		
		System.out.println(c);
		
		return 'a';
    }

}
