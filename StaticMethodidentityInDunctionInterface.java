import java.util.function.Function;

public class StaticMethodidentityInDunctionInterface {
    public static void main(String args[])
    {
        Function<Integer,Integer> f1= Function.identity();
        System.out.println(f1.apply(10)); //Output 10
    }
}
