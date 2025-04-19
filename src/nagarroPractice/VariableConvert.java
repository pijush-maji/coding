package nagarroPractice;

public class VariableConvert {

    static String fun(String s){
        if(s==null || s.isBlank())
            return "";
        if(s.indexOf('_')==-1){
            StringBuilder sb = new StringBuilder();
            int flag = 0;
            for(Character c:s.toCharArray()){
                if(c>=65 && c<=90){
                    sb.append("_");
                    sb.append(c.toString().toLowerCase());
                }else {
                    sb.append(c);
                }
            }
            return sb.toString();
        }else{
            StringBuilder sb = new StringBuilder();
            int flag=0;
            for(Character c:s.toCharArray()){
                if(flag==1){
                    sb.append(c.toString().toUpperCase());
                    flag=0;
                    continue;
                }
                if(c=='_'){
                    flag=1;
                }else {
                    sb.append(c);
                }
            }
            return sb.toString();
        }
    }
    public static void main(String[] args) {
        System.out.println(fun("thisIsAJavaVariable"));
        System.out.println(fun("this_is_a_c++_variable"));
    }
}
