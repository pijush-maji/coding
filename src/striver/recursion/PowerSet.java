package striver.recursion;

import java.util.ArrayList;
import java.util.List;

public class PowerSet {

	//Generating all subset of a string
	// input - abc
	// output - "",a,b,ab,c,ac,bc,abc
	public static List<String> subset(String s) {
		List<String> res = new ArrayList<>();
		if(s=="") {
			res.add("");
			return res;
		}
		int n = s.length();
		for(int i=0;i<(1<<n)-1;i++) {
			String temp="";
			for(int j=0;j<n;j++) {
				if((i&(1<<j))!=0)
					temp+=s.charAt(j);
			}
			res.add(temp);
		}
		return res;
	}
	public static void main(String[] args) {
		System.out.println(subset("abc"));
	}

}
