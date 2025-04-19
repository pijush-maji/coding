package CodePractice;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class AnagramCheck {
	
	public static void main(String[] args) {
		System.out.println(isAnagram("ant", "tan"));
		
	}
	
	public static boolean isAnagram(String s, String t) {
        int[] a = new int[26];
        
        for(int i=0;i<26;i++) {
        	a[i]=0;
        }
        
        for(Character c : s.toCharArray()) {
        	a[c-97]++;
        }
        for(Character c: t.toCharArray()) {
        	a[c-97]--;
        }
        
        for(int i = 0;i<26;i++) {
        	if(a[i]!=0) return false;
        }
        return true;
        
    }

}
