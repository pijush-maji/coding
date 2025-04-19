package FunctionInterface;

public class Test {

    public static void main(String[] args) {
        FuncInterface sum = (int x,int y) -> x+y;
        FuncInterface multi = (int x,int y) ->x*y;
        System.out.println(sum.calulate(6,3));
        System.out.println(multi.calulate(6,3));
    }
}
