/*
 * package CodePractice;
 * 
 * public class AddBinary {
 * 
 * public static String addBinary(String a, String b) {
 * 
 * int l = Math.min(a.length(),b.length());
 * 
 * int i=l-1,r=0,pr=0; StringBuilder sb = new StringBuilder(""); while(i>0){ int
 * v=0; r=pr; if(a.charAt(i)=='1' && b.charAt(i)=='1'){ v=0; pr=1; } else
 * if(a.charAt(i)=='0' && b.charAt(i)=='0') { v=0; pr=0; } else { if(r==1) {
 * v=0; pr=1; } else { v=1; pr=0; } sb.append(String.valueOf(v)); i--; continue;
 * } if(r==1) { sb.append(String.valueOf(1)); } else {
 * sb.append(String.valueOf(0)); } i--;
 * 
 * } return sb.reverse().toString();
 * 
 * }
 * 
 * public static void main(String[] args) {
 * System.out.println(addBinary("1010","1011")); }
 * 
 * }
 */